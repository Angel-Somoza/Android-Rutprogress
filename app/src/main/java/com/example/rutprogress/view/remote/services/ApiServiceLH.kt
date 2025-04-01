package com.example.rutprogress.view.remote.services
import com.example.rutprogress.view.model.User
import retrofit2.http.GET

interface ApiServiceLH {
    @GET("Date") // Ruta de API en el servidor local
    suspend fun  getmessage(): User
}
