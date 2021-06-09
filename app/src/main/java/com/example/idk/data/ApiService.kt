package com.example.idk.data

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("games")
    fun getGames(): Call<Games>

}