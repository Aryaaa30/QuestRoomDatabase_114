package com.example.session10_roomlocaldbpart1.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.session10_roomlocaldbpart1.data.entity.Mahasiswa
import com.example.session10_roomlocaldbpart1.repository.RepositoryMhs

class HomeMhViewModel(
    private val repositoryMhs: RepositoryMhs
) : ViewModel(){

}

data class HomeUiState(
    val listMhs: List<Mahasiswa> = listOf(),
    val isLoading: Boolean = false,
    val isError: Boolean = false,
    val errorMessage: String = ""
)