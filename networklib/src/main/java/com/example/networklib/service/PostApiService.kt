package com.example.networklib.service

import retrofit2.http.GET

data class Post(
    val userId: Int,
    val id: Int,
    val title: String,
    val body: String
)

interface PostApiService {
    @GET("posts")
    suspend fun getPosts(): List<Post>
}
