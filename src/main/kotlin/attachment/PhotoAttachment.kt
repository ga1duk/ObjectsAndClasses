package attachment

class PhotoAttachment: Attachment {
    override val type: String = "photo"
    val photo: Photo? = null
}