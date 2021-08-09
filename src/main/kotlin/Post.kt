import attachment.Attachment
import java.time.LocalDateTime

data class Post(
    var id: Int,
    var ownerId: Int = 1,
    var fromId: Int = 1,
    var createdBy: Int = 1,
    var date: LocalDateTime = LocalDateTime.now(),
    var text: String,
    var replyOwnerId: Int = 1,
    var replyPostId: Int = 1,
    var friendsOnly: Boolean = false,
    var comments: Comments,
    var copyright: Copyright,
    var likes: Likes,
    var reposts: Reposts,
    var views: Views,
    var postType: String = "text",
    var postSource: PostSource? = null,
    var attachments: Array<Attachment>? = null,
    var geo: Geo? = null,
    var signerId: Int = 1,
    var copyHistory: Array<Post>? = null,
    var canPin: Boolean = true,
    var canDelete: Boolean = true,
    var canEdit: Boolean = true,
    var isPinned: Boolean = false,
    var markedAsAds: Boolean = false,
    var isFavorite: Boolean = false,
    var donut: DonutPost,
    var postponedId: Int = 1
)