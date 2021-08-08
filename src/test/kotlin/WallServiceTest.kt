import comment.Comment
import exception.PostNotFoundException
import org.junit.Assert.*
import org.junit.Test

class WallServiceTest {

    @Test
    fun addPost() {
        val service = WallService()

        val result = service.add(
            Post(
                id = 0,
                text = "First post",
                comments = Comments(),
                copyright = Copyright(),
                likes = Likes(),
                reposts = Reposts(),
                views = Views(),
                donut = DonutPost(placeHolder = PlaceHolder())
            )
        )

        assertNotEquals(0, result.id)

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
                donut = DonutPost(placeHolder = PlaceHolder())
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
                donut = DonutPost(placeHolder = PlaceHolder())
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
                donut = DonutPost(placeHolder = PlaceHolder())
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
            donut = DonutPost(placeHolder = PlaceHolder())
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
                donut = DonutPost(placeHolder = PlaceHolder())
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
                donut = DonutPost(placeHolder = PlaceHolder())
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
                donut = DonutPost(placeHolder = PlaceHolder())
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
            donut = DonutPost(placeHolder = PlaceHolder())
        )

        val result = service.update(update)

        assertFalse(result)
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        val service = WallService()

        service.add(
            Post(
                id = 7,
                text = "First post",
                comments = Comments(),
                copyright = Copyright(),
                likes = Likes(),
                reposts = Reposts(),
                views = Views(),
                donut = DonutPost(placeHolder = PlaceHolder())
            )
        )

        service.createComment(Comment(postId = 1, text = "Test comment"))
    }

    @Test()
    fun shouldNotThrow() {
        val service = WallService()

        service.add(
            Post(
                id = 0,
                text = "First post",
                comments = Comments(),
                copyright = Copyright(),
                likes = Likes(),
                reposts = Reposts(),
                views = Views(),
                donut = DonutPost(placeHolder = PlaceHolder())
            )
        )

        service.createComment(Comment(postId = 1, text = "Test comment"))

        val result = service.comments.size

        assertNotEquals(0, result)
    }
}