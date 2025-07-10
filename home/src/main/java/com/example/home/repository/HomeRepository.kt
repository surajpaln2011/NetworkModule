package com.example.home.repository

import com.example.home.BuildConfig

class HomeRepository {
    private val api = NetworkModule.providePostApiService(BuildConfig.BASE_URL)
    suspend fun fetchPosts(): List<Post> = api.getPosts()
}