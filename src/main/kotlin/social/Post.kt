package social

data class Post(

        var id: Int,
        var ownerID: Int,
        var fromId: Int,
        var createdBy: Int,
        var date: Int,
        var text: String,
        var replyOwnerId: Int,
        var replyPostId: Int,
        var friendsOnly: Boolean = false,
        var comments: Comments,
        var copyright: String,
        var likes: Likes,
        var reposts: Reposts,
        var views: Int,
        var postType: PostType,
        var geo: Geo,
        var signerId: Int,
        var canPin: Boolean = false,
        var canDelete: Boolean = false,
        var canEdit: Boolean = false,
        var isPinned: Boolean = false,
        var markedAsAds: Boolean = false,
        var isFavorite: Boolean = false,
        var postponedId: Int){
    override fun toString(): String {
        return """
            
Post(id=$id, 
ownerID=$ownerID, 
fromId=$fromId, 
createdBy=$createdBy, 
date=$date, text='$text', 
replyOwnerId=$replyOwnerId, 
replyPostId=$replyPostId, 
friendsOnly=$friendsOnly, 
comments=$comments, 
copyright='$copyright', 
likes=$likes, 
reposts=$reposts, 
views=$views, 
postType=$postType, 
geo=$geo, 
signerId=$signerId, 
canPin=$canPin, 
canDelete=$canDelete, 
canEdit=$canEdit, 
isPinned=$isPinned, 
markedAsAds=$markedAsAds, 
isFavorite=$isFavorite, 
postponedId=$postponedId)

"""
    }
}