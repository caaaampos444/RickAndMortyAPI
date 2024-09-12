package com.example.rickandmorty.service

import com.example.rickandmorty.model.Character
import com.example.rickandmorty.model.Result
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface CharacterService {

    @GET("character/{id}")
    fun getCharacterByID(@Path("id") id: Int): Call<Character>

    @GET("character")
    fun getAllCharacters(): Call<Result>

    @POST("character")
    fun postCharacter(@Body character: Character): Call<Character>

    @PUT("character")
    fun putCharacter(@Body character: Character): Call<Character>

}