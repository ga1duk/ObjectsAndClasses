data class DonutPost(
    val isDonut: Boolean = false,
    val paidDuration: Int = 100,
    val placeHolder: PlaceHolder,
    val canPublishFreeCopy: Boolean = true,
    val editMode: String = "all"
)
