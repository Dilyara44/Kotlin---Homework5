package ru.netology

import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun addIdChanged() {
        val service = WallService()
        val attachments = emptyArray<Attachment>()
        var comments = emptyArray<Comments>()

        val actual = Post(
            1,
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
            Likes(1, true, true, true),
            Reposts(1, true),
            null,
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

        val result = service.add(
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
                Likes(1, true, true, true),
                Reposts(1, true),
                null,
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

        assertEquals(actual, result)

    }

    @Test
    fun updateExistingTrue() {

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
                Likes(1, true, true, true),
                null,
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
                Likes(2, true, true, true),
                null,
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
        service.add(
            Post(
                0,
                3,
                3,
                3,
                3,
                "Третий пост",
                3,
                3,
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
                "Автор3",
                Likes(3, true, true, true),
                Reposts(3, true),
                Views(3),
                "post",
                attachments,
                PostSource("Что-то неизвестное"),
                Geo("1", "1", "1"),
                3,
                "Что-то неизвестное",
                true,
                true,
                true,
                true,
                true,
                true,
                3
            )
        )

        val update = Post(
            1,
            5,
            5,
            5,
            5,
            "Измененный пост",
            5,
            5,
            true,
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
            "Старый автор",
            Likes(5, false, false, false),
            Reposts(5, false),
            Views(5),
            "suggest",
            attachments,
            PostSource("Что-то неизвестное"),
            Geo("1", "1", "1"),
            5,
            "Что-то неизвестное",
            false,
            false,
            false,
            false,
            false,
            false,
            5
        )


        val result = service.update(update)


        assertTrue(result)
    }

    @Test
    fun updateExistingFalse() {

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
        service.add(
            Post(
                0,
                3,
                3,
                3,
                3,
                "Третий пост",
                3,
                3,
                false,
                null,
                null,
                Likes(3, true, true, true),
                Reposts(3, true),
                Views(3),
                "post",
                attachments,
                PostSource("Что-то неизвестное"),
                Geo("1", "1", "1"),
                3,
                "Что-то неизвестное",
                true,
                true,
                true,
                true,
                true,
                true,
                3
            )
        )

        val update = Post(
            5,
            5,
            5,
            5,
            5,
            "Измененный пост",
            5,
            5,
            true,
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
            "Старый автор",
            Likes(5, false, false, false),
            Reposts(5, false),
            Views(5),
            "suggest",
            attachments,
            null,
            Geo("1", "1", "1"),
            5,
            "Что-то неизвестное",
            false,
            false,
            false,
            false,
            false,
            false,
            0
        )


        val result = service.update(update)


        assertFalse(result)
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        val service = WallService()
        val attachments = emptyArray<Attachment>()


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

    @Test
    fun commentShouldBeAdded () {
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
        service.add(
            Post(
                0,
                3,
                3,
                3,
                3,
                "Третий пост",
                3,
                3,
                false,
                null,
                null,
                Likes(3, true, true, true),
                Reposts(3, true),
                Views(3),
                "post",
                attachments,
                PostSource("Что-то неизвестное"),
                Geo("1", "1", "1"),
                3,
                "Что-то неизвестное",
                true,
                true,
                true,
                true,
                true,
                true,
                3
            )
        )

        val result = service.createComment (Comments (1,
            1,
            2,
            1,
            "text",
            Donut(true, "test"),
            null,
            null,
            attachments,
            "id comments",
            Thread(1, "test", true, true, true)))

        val actual = Comments (1,
            1,
            2,
            1,
            "text",
            Donut(true, "test"),
            null,
            null,
            attachments,
            "id comments",
            Thread(1, "test", true, true, true))


        assertEquals(actual, result)
    }
}