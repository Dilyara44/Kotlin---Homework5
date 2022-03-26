package ru.netology

import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun addIdChanged() {
        val service = WallService()

        val firstPost = Post(
            0,
            1,
            1,
            1,
            1,
            "Первый пост",
            1,
            1,
            false,
            Comments(1, true, true, true, true),
            "Автор1",
            Likes(1, true, true, true),
            Reposts(1, true),
            Views(1),
            "post",
            1,
            true,
            true,
            true,
            true,
            true,
            true,
            1
        )

        val result = service.add(firstPost)

        assertFalse(result.id == firstPost.id)
    }

    @Test
    fun updateExistingTrue() {

        val service = WallService()

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
                Comments(1, true, true, true, true),
                "Автор1",
                Likes(1, true, true, true),
                Reposts(1, true),
                Views(1),
                "post",
                1,
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
                Comments(2, true, true, true, true),
                "Автор2",
                Likes(2, true, true, true),
                Reposts(2, true),
                Views(2),
                "post",
                2,
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
                Comments(3, true, true, true, true),
                "Автор3",
                Likes(3, true, true, true),
                Reposts(3, true),
                Views(3),
                "post",
                3,
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
            Comments(5, false, false, false, false),
            "Старый автор",
            Likes(5, false, false, false),
            Reposts(5, false),
            Views(5),
            "suggest",
            5,
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
                Comments(1, true, true, true, true),
                "Автор1",
                Likes(1, true, true, true),
                Reposts(1, true),
                Views(1),
                "post",
                1,
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
                Comments(2, true, true, true, true),
                "Автор2",
                Likes(2, true, true, true),
                Reposts(2, true),
                Views(2),
                "post",
                2,
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
                Comments(3, true, true, true, true),
                "Автор3",
                Likes(3, true, true, true),
                Reposts(3, true),
                Views(3),
                "post",
                3,
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
            Comments(5, false, false, false, false),
            "Старый автор",
            Likes(5, false, false, false),
            Reposts(5, false),
            Views(5),
            "suggest",
            5,
            false,
            false,
            false,
            false,
            false,
            false,
            5
        )


        val result = service.update(update)


        assertFalse(result)
    }
}