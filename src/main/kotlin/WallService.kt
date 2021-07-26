class WallService {

    var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        posts += post
        when {
            post.id < 0 -> throw Exception("post.id должен быть не меньше 1")
            post.id >= 0 -> post.id ++
        }
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for (oldPost in posts) {
            if (oldPost.id == post.id) {
                oldPost.fromId = post.fromId
                oldPost.createdBy = post.createdBy
                oldPost.text = post.text
                oldPost.replyOwnerId = post.replyOwnerId
                oldPost.replyPostId = post.replyPostId
                oldPost.friendsOnly = post.friendsOnly
                oldPost.comments = post.comments
                oldPost.copyright = post.copyright
                oldPost.likes = post.likes
                oldPost.reposts = post.reposts
                oldPost.views = post.views
                oldPost.postType = post.postType
                oldPost.signerId = post.signerId
                oldPost.canPin = post.canPin
                oldPost.canDelete = post.canDelete
                oldPost.canEdit = post.canEdit
                oldPost.isPinned = post.isPinned
                oldPost.markedAsAds = post.markedAsAds
                oldPost.isFavorite = post.isFavorite
                oldPost.donut = post.donut
                oldPost.postponedId = post.postponedId
                return true
            }
        }
        return false
    }
}