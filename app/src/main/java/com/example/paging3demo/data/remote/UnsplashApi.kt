package com.example.paging3demo.data.remote


import com.example.paging3demo.model.SearchResult
import com.example.paging3demo.model.UnsplashImage
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface UnsplashApi {

    @Headers("Authorization: Client-ID mrpcP3o39v0lXb9azpOi_H8c0SNEadTGESPVhFOWTZA")
    @GET("/photos")
    suspend fun getAllImages(
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ): List<UnsplashImage>

    @Headers("Authorization: Client-ID mrpcP3o39v0lXb9azpOi_H8c0SNEadTGESPVhFOWTZA")
    @GET("/search/photos")
    suspend fun searchImages(
        @Query("query") query: String,
        @Query("per_page") perPage: Int
    ): SearchResult

}