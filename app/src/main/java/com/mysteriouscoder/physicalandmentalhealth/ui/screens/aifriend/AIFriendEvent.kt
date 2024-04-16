package com.mysteriouscoder.physicalandmentalhealth.ui.screens.aifriend

sealed class AIFriendEvent {
    data class UserInput(val message: String) : AIFriendEvent()
}