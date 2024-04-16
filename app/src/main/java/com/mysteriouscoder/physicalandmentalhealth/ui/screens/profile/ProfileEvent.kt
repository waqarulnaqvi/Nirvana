package com.mysteriouscoder.physicalandmentalhealth.ui.screens.profile

sealed class ProfileEvent(){
    data class Profile(
        val title: String,
        val subtitle: String,
        val image: Int,
    ) : ProfileEvent()

}