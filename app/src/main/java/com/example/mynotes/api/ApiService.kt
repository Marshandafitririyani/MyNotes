package com.example.mynotes.api

import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST


 interface ApiService {
    @FormUrlEncoded
    @POST("login?expired=1")
    suspend fun login(
        @Field("email") email: String?,
        @Field("password") password: String?
    ): String
}