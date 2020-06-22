package social

data class Comments(
        val count:Int,
        var canPost: Boolean = false,
        var groupsCanPost: Boolean = false,
        var canClose: Boolean = false,
        var canOpen: Boolean = false) {
}