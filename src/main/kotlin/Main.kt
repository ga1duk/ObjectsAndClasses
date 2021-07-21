fun main() {
        val comments = Comments(11, true, true, true, true)
        val copyright = Copyright(1, "dfsdlfkj", "Dmitry", "txt")
        val likes = Likes(1, true, true, true)
        val reposts = Reposts(1, true)
        val views = Views(1)
        val placeHolder = PlaceHolder()
        val donut = Donut(true, 10, placeHolder, true, "sdfjksdfl")

        val post = Post(1, 1, 1, 1, 1, "Hello", 1, 1, false,
        comments, copyright, likes, reposts, views, "text", 1, true, true, true,
        false, false, false, donut, 1)

        // TODO: 21.07.2021 заменить переменную wallService на массив объектов Post
        var wallService = WallService()
        wallService.add(post)
        wallService.update(post)
}