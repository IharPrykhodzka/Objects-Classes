package social

data class Likes(
        var count: Int,
        var userLikes: Boolean = false,
        var canLike: Boolean = false,
        var canPublish: Boolean = false) {
}