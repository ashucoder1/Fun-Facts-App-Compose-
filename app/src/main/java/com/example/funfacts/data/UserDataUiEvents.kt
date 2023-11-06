package com.example.funfacts.data

sealed class UserDataUiEvents(){
    data class UserNameEntered(var name:String):UserDataUiEvents()
    data class AnimalSelected(var animalValue:String):UserDataUiEvents()
}
