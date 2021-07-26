import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun addPost() {
        val service = WallService()

        val result = service.add(
            Post(
                id = 1,
                text = "First post",
                comments = Comments(),
                copyright = Copyright(),
                likes = Likes(),
                reposts = Reposts(),
                views = Views(),
                donut = Donut(placeHolder = PlaceHolder())
            )
        )

        assertEquals(2, result.id)

    }

    @Test
    fun updateExisting() {
        val service = WallService()

        service.add(
            Post(
                id = 1,
                text = "First post",
                comments = Comments(),
                copyright = Copyright(),
                likes = Likes(),
                reposts = Reposts(),
                views = Views(),
                donut = Donut(placeHolder = PlaceHolder())
            )
        )
        service.add(
            Post(
                id = 2,
                text = "Second post",
                comments = Comments(),
                copyright = Copyright(),
                likes = Likes(),
                reposts = Reposts(),
                views = Views(),
                donut = Donut(placeHolder = PlaceHolder())
            )
        )
        service.add(
            Post(
                id = 3,
                text = "Third post",
                comments = Comments(),
                copyright = Copyright(),
                likes = Likes(),
                reposts = Reposts(),
                views = Views(),
                donut = Donut(placeHolder = PlaceHolder())
            )
        )

        val update = Post(
            id = 3,
            text = "Updated post",
            comments = Comments(),
            copyright = Copyright(),
            likes = Likes(),
            reposts = Reposts(),
            views = Views(),
            donut = Donut(placeHolder = PlaceHolder())
        )

        val result = service.update(update)

        assertTrue(result)
    }

    @Test
    fun updateAbsent() {
        val service = WallService()

        service.add(
            Post(
                id = 1,
                text = "First post",
                comments = Comments(),
                copyright = Copyright(),
                likes = Likes(),
                reposts = Reposts(),
                views = Views(),
                donut = Donut(placeHolder = PlaceHolder())
            )
        )
        service.add(
            Post(
                id = 2,
                text = "Second post",
                comments = Comments(),
                copyright = Copyright(),
                likes = Likes(),
                reposts = Reposts(),
                views = Views(),
                donut = Donut(placeHolder = PlaceHolder())
            )
        )
        service.add(
            Post(
                id = 3,
                text = "Third post",
                comments = Comments(),
                copyright = Copyright(),
                likes = Likes(),
                reposts = Reposts(),
                views = Views(),
                donut = Donut(placeHolder = PlaceHolder())
            )
        )

        val update = Post(
            id = 7,
            text = "Updated post",
            comments = Comments(),
            copyright = Copyright(),
            likes = Likes(),
            reposts = Reposts(),
            views = Views(),
            donut = Donut(placeHolder = PlaceHolder())
        )

        val result = service.update(update)

        assertFalse(result)
    }
}