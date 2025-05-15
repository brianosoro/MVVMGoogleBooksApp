package com.symatechlabs.mvvmgooglebooksapp.data.source.remote
import retrofit2.http.*

interface SearchVolumesApi {

    @GET("books/v1/volumes")
    suspend fun getVolumes(
        @Query("q") query: String,
    ): SearchVolumesApi


}