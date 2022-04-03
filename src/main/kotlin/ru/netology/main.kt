package ru.netology

fun main() {
    val service = WallService()

    val attachments = emptyArray<Attachment>()

    service.add(
        Post(
            0,
            1,
            1,
            1,
            1,
            "Первый пост",
            1,
            1,
            false,
            Comments(
                1,
                1,
                1,
                1,
                "text",
                Donut(true, "test"),
                null,
                null,
                attachments,
                "id comments",
                Thread(1, "test", true, true, true)
            ),
            "Автор1",
            null,
            Reposts(1, true),
            Views(1),
            "post",
            attachments,
            PostSource("Что-то неизвестное"),
            Geo("1", "1", "1"),
            1,
            "Что-то неизвестное",
            true,
            true,
            true,
            true,
            true,
            true,
            1
        )
    )
    service.add(
        Post(
            0,
            2,
            2,
            2,
            2,
            "Второй пост",
            2,
            2,
            false,
            Comments(
                1,
                1,
                1,
                1,
                "text",
                Donut(true, "test"),
                null,
                null,
                attachments,
                "id comments",
                Thread(1, "test", true, true, true)
            ),
            "Автор2",
            null,
            Reposts(2, true),
            Views(2),
            "post",
            attachments,
            PostSource("Что-то неизвестное"),
            Geo("1", "1", "1"),
            2,
            "Что-то неизвестное",
            true,
            true,
            true,
            true,
            true,
            true,
            2
        )
    )

    service.createComment (Comments (1,
        1,
        35,
        1,
        "text",
        Donut(true, "test"),
        null,
        null,
        attachments,
        "id comments",
        Thread(1, "test", true, true, true)))



}
