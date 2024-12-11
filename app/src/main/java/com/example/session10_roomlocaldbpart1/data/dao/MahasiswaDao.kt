package com.example.session10_roomlocaldbpart1.data.dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.session10_roomlocaldbpart1.data.entity.Mahasiswa

@Dao
interface MahasiswaDao {
    @Insert
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)

}