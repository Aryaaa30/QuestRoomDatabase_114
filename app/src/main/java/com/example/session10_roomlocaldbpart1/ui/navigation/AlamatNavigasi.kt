package com.example.session10_roomlocaldbpart1.ui.navigation

interface AlamatNavigasi {
    val route: String
}

object DestinasiHome : AlamatNavigasi {
    override val route = "home"
}