package com.example.session10_roomlocaldbpart1.repository

import com.example.session10_roomlocaldbpart1.data.entity.Mahasiswa

interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)
}