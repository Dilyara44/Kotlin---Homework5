package ru.netology

class WallService {

    private var posts = emptyArray<Post>()

    private var id = 1.toLong()

    fun add(post: Post): Post {
        val target = post.copy(id = id)
        id++
        posts += target
        return posts.last()
    }

    fun update(initialPost: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (initialPost.id == post.id) {
                posts[index] = post.copy(
                    id = id,
                    ownerId = initialPost.ownerId,
                    createdBy = initialPost.createdBy,
                    text = initialPost.text,
                    replyOwnerId = initialPost.replyOwnerId,
                    replyPostId = initialPost.replyPostId,
                    friendsOnly = initialPost.friendsOnly,
                    comments = initialPost.comments,
                    copyright = initialPost.copyright,
                    likes = initialPost.likes,
                    reposts = initialPost.reposts,
                    views = initialPost.views,
                    postType = initialPost.postType,
                    signerId = initialPost.signerId,
                    canPin = initialPost.canPin,
                    canDelete = initialPost.canDelete,
                    canEdit = initialPost.canEdit,
                    isPinned = initialPost.isPinned,
                    markedAsAds = initialPost.markedAsAds,
                    isFavourite = initialPost.isFavourite,
                    postponedId = initialPost.postponedId
                )
                id++
                return true
            }
        }
        return false
    }

}