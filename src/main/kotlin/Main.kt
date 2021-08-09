import attachment.*
import comment.Comment

private var attachments = emptyArray<Attachment>()

fun addAttachment(vararg attachment: Attachment): Array<Attachment> {
    attachments += attachment
    return attachments
}

fun main() {
    
    val audio = AudioAttachment()
    val video = VideoAttachment()
    val note = NoteAttachment()
    val album = AlbumAttachment()
    val photo = PhotoAttachment()

    val post = Post(
        id = 0,
        text = "Hello world!",
        comments = Comments(),
        copyright = Copyright(),
        likes = Likes(),
        reposts = Reposts(),
        views = Views(),
        attachments = addAttachment(audio, video, note, album, photo),
        donut = DonutPost(placeHolder = PlaceHolder())
    )

    val newPost = post.copy(
        id = 10,
        text = "Hello kotlin!"
    )

    val wallService = WallService()
    for (i in 0..9) {
        println(wallService.add(post))
    }

    println()

    println(wallService.update(newPost))

    println()

    if (attachments[1] is AudioAttachment) {
        println("Это объект типа AudioAttachment")
    } else {
        println("Это не объект типа AudioAttachment")
    }

    println()

    val comment = Comment(postId = 10, text = "XD")

    wallService.createComment(comment)
}
