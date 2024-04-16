package com.mysteriouscoder.physicalandmentalhealth.ui.screens.login.accountcreatescreen

sealed class AccountCreateEvent
{
    data class CreateAccount(
        val email: String,
        val password: String,
        val confirmPassword: String
    ) : AccountCreateEvent()

    data class NavigateBack(
        val email: String,
        val password: String,
        val confirmPassword: String
    ) : AccountCreateEvent()

    data class ShowError(
        val message: String
    ) : AccountCreateEvent()
}