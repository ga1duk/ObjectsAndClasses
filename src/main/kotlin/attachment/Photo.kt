package attachment

data class Photo (
    val id: Int,
    val albumId: Int,
    val ownerId: Int,
    val userId: Int,
    val text: String,
    val date: Int,
    val sizes: Array<PhotoSize>,
    val width: Int,
    val height: Int
)
