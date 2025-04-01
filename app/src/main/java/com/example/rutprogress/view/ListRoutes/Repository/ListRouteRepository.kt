package com.example.rutprogress.view.ListRoutes.Repository


import com.example.rutprogress.view.remote.services.ApiServiceLH
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ListRouteRepository @Inject constructor(private val apiService: ApiServiceLH) {
   suspend  fun GetMessage() = apiService.getmessage()

}
