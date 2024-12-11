package com.example.session10_roomlocaldbpart1

import android.app.Application
import com.example.session10_roomlocaldbpart1.dependenciesinjection.ContainerApp

class KrsApp : Application() {
    lateinit var containerApp: ContainerApp // Fungsinya Untuk Menyimpan
    override fun onCreate() {
        super.onCreate()
        containerApp = ContainerApp(this) // Membuat Instance
        // Instance Adalah object yang dibuat dari class
    }
}