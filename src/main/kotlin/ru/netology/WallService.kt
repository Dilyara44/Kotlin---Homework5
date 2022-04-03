package ru.netology

class WallService {

    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comments>()
    private var attachments = emptyArray<Attachment>()


    private var newId = 1.toLong()

    fun add(post: Post): Post {
        val target = post.copy(id = newId)
        newId++
        posts += target
        return posts.last()
    }

    fun update(initialPost: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (initialPost.id == post.id) {
                posts[index] = post.copy(
                    id = post.id,
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
                return true
            }
        }
        return false
    }

    fun createComment(comment: Comments): Comments {
        for (post in posts) {
            if (post.id == comment.postId) {
                comments += comment
                return comments.last()
            }
        }
        throw PostNotFoundException("Такого поста не существует!")

    }
}


