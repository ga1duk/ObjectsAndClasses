import comment.Comment
import exception.PostNotFoundException

class WallService {
    private var posts = emptyArray<Post>()
    var comments = emptyArray<Comment>()


    fun add(post: Post): Post {
        posts += post
        when {
            post.id < 0 -> throw Exception("post.id не должен быть отрицательным")
            post.id >= 0 -> post.id++
        }
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, _) in posts.withIndex()) {
            if (posts[index].id == post.id) {
                posts[index] = posts[index].copy(
                    fromId = post.fromId,
                    createdBy = post.createdBy,
                    text = post.text,
                    replyOwnerId = post.replyOwnerId,
                    replyPostId = post.replyPostId,
                    friendsOnly = post.friendsOnly,
                    comments = post.comments,
                    copyright = post.copyright,
                    likes = post.likes,
                    reposts = post.reposts,
                    views = post.views,
                    postType = post.postType,
                    signerId = post.signerId,
                    canPin = post.canPin,
                    canDelete = post.canDelete,
                    canEdit = post.canEdit,
                    isPinned = post.isPinned,
                    markedAsAds = post.markedAsAds,
                    isFavorite = post.isFavorite,
                    donut = post.donut,
                    postponedId = post.postponedId
                )
                return true
            }
        }
        return false
    }

    fun createComment(comment: Comment) {
        for (post in posts) {
            if (post.id == comment.postId) {
                comments += comment
                println("comment.Comment was successfully added to post with id ${comment.postId}")
                return
            }
        }
        throw PostNotFoundException("No post found with id ${comment.postId}")
    }
}