package com.mysteriouscoder.physicalandmentalhealth.ui.screens.onboarding

import androidx.lifecycle.ViewModel
import com.mysteriouscoder.physicalandmentalhealth.ui.screens.onboarding.components.OnBoardingEvent


class OnBoardingViewModel() : ViewModel() {

//    onEvent is only the public function inside the viewmodel

    fun onEvent(event: OnBoardingEvent) {
        when (event) {
            is OnBoardingEvent.SaveAppEntry -> {
                saveAppEntry()
            }

        }
    }

    private fun saveAppEntry() {

    }

}

//This architecture is a combination between MVI or MVVM.