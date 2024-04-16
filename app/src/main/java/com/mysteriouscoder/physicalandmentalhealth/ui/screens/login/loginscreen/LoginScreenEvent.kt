package com.mysteriouscoder.physicalandmentalhealth.ui.screens.login.loginscreen

sealed class LoginScreenEvent {
    data class SetEmail(val email: String): LoginScreenEvent()
    data class SetPassword(val password: String): LoginScreenEvent()
    data object OnLogin: LoginScreenEvent()
}