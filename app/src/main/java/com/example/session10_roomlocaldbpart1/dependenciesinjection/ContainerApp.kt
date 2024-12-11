package com.example.session10_roomlocaldbpart1.dependenciesinjection

import android.content.Context
import com.example.session10_roomlocaldbpart1.data.database.KrsDatabase
import com.example.session10_roomlocaldbpart1.repository.LocalRepositoryMhs
import com.example.session10_roomlocaldbpart1.repository.RepositoryMhs

interface InterFaceCpntainerApp {
    val repositoryMhs: RepositoryMhs
}

class ContainerApp(private val context: Context) : InterFaceCpntainerApp{
    override val repositoryMhs: RepositoryMhs by lazy {
        LocalRepositoryMhs(KrsDatabase.getDatabase(context).mahasiswaDao())
    }
}