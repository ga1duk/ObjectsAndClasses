package attachment

data class Note(
    val id: Int,
    val ownerId: Int,
    val title: String,
    val text: String,
    val date: Int,
    val comments: Int,
    val readComments: Int,
    val viewUrl: String,
    val privacyView: Array<String>,
    val privacyComment: Array<String>,
    val canComment: Boolean,
    val textWiki: String
    )
