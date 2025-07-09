package com.example.home.repository

import com.example.home.BuildConfig
import com.example.networklib.di.NetworkModule
import com.example.networklib.service.Post

class HomeRepository {
    private val api = NetworkModule.providePostApiService(BuildConfig.BASE_URL)
    suspend fun fetchPosts(): List<Post> = api.getPosts()
}