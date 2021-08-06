package attachment

data class Album(
    val id: Int,
    val thumb: Photo,
    val ownerId: Int,
    val title: String,
    val description: String,
    val created: Int,
    val updated: Int,
    val size: Int
)
