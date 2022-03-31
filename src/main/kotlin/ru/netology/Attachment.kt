package ru.netology

abstract class Attachment(
    val type: String,

    var attachments: Array<Attachment> = emptyArray<Attachment>()

)
