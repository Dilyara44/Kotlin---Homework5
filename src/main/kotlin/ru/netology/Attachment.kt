package ru.netology

sealed class Attachment(val type: String)

data class VideoAttachment(val video: Video) : Attachment("Video")

data class AudioAttachment(val audio: Audio) : Attachment("Audio")

data class DocAttachment(val doc: Doc) : Attachment("Doc")

data class LinkAttachment(val link: Link) : Attachment("Link")

data class PhotoAttachment(val photo: Photo) : Attachment("Photo")