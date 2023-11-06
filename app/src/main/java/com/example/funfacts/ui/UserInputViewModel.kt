package com.example.funfacts.ui

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.funfacts.data.UserDataUiEvents
import com.example.funfacts.data.UserInputScreenState

class UserInputViewModel:ViewModel() {
    var uiState= mutableStateOf(UserInputScreenState())

        fun onEvent(events: UserDataUiEvents){
            when(events){
                is UserDataUiEvents.UserNameEntered ->{
                    uiState.value=uiState.value.copy(
                        nameEntered = events.name
                    )
                }
                is UserDataUiEvents.AnimalSelected ->{
                    uiState.value=uiState.value.copy(
                        animalSelected = events.animalValue
                    )
                }
            }

        }

}

