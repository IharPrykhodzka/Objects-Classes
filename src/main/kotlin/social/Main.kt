package social

fun main() {

    var comments = Comments(1, false, false, false, false)
    var likes = Likes(2, false, false, false)
    var reposts = Reposts(4, false)
    var postType = PostType.POSTPONE
    var place = Place(345, "Питер", 564, 312, 756, "asdasd", 867, 987,
    2345643, 564876,3421543,"Там!")
    var geo = Geo("Питер", "23432543643", place)

    var post = Post(1, 2,3, 3, 4, "Всем привет", 32, 432,
            false, comments, "Haha!!!", likes, reposts, 234, postType, geo, 32,
            false, false, false, false, false, false, 2345)

    println(post)
}