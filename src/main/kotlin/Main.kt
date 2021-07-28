fun main() {

    val post = Post(
        id = 0,
        text = "Hello world!",
        comments = Comments(),
        copyright = Copyright(),
        likes = Likes(),
        reposts = Reposts(),
        views = Views(),
        donut = Donut(placeHolder = PlaceHolder())
    )

    val newPost = post.copy(
        id = 10,
        text = "Hello kotlin!",
        comments = Comments(),
        copyright = Copyright(),
        likes = Likes(),
        reposts = Reposts(),
        views = Views(),
        donut = Donut(placeHolder = PlaceHolder())
    )

    val wallService = WallService()
    for (i in 0..9) {
        println(wallService.add(post))
    }

    println()

    println(wallService.update(newPost))

    println()

    for ((_, value) in wallService.posts.withIndex()) {
        println(value)
    }
}
