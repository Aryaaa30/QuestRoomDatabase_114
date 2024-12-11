package com.example.session10_roomlocaldbpart1.repository

import com.example.session10_roomlocaldbpart1.data.dao.MahasiswaDao
import com.example.session10_roomlocaldbpart1.data.entity.Mahasiswa

class LocalRepositoryMhs(
    private val  mahasiswaDao: MahasiswaDao
) : RepositoryMhs{

    override suspend fun insertMhs(mahasiswa: Mahasiswa) {
        mahasiswaDao.insertMahasiswa(mahasiswa)
    }
}
