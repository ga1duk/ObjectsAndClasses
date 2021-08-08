package comment

import attachment.Attachment

data class Comment(
    val id: Int = 0,
    val postId: Int,
    val fromId: Int = 0,
    val date: Int = 0,
    val text: String,
    val donut: DonutComment? = null,
    val replyToUser: Int = 0,
    val replyToComment: Int = 0,
    val attachments: Attachment? = null,
    val parentsStack: Array<Comment>? = null,
    val thread: CommentThread? = null
    )
