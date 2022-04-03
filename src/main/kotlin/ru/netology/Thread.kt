package ru.netology

data class Thread(
    val count: Int,
    val items: String,
    val canPost: Boolean,
    val showReplyButton: Boolean,
    val groupsCanPost: Boolean
)
