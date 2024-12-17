package com.example.session10_roomlocaldbpart1.ui.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.session10_roomlocaldbpart1.repository.RepositoryMhs

class UpdateMhsViewModel(
    savedStateHandle: SavedStateHandle,
    private val repositoryMhs: RepositoryMhs
) : ViewModel(){
    var updateUIState by mutableStateOf(MhsUIState())
        private set

    private val _nim: String = checkNotNull(savedStateHandle[DestinasiEdit.NIM])

    init {

    }
}