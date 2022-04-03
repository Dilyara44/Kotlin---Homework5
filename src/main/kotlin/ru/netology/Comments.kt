package ru.netology

data class Comments(
    val id: Long,
    val fromId: Long,
    val postId: Long,
    val date: Int,
    val text: String,
    val donut: Donut,
    val replyToUser: Long?,
    val replyToComment: Long?,
    val attachments: Array <Attachment>,
    val parentsStack: String,
    val thread: Thread
)
