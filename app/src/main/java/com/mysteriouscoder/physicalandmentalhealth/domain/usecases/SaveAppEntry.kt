package com.mysteriouscoder.physicalandmentalhealth.domain.usecases

import com.mysteriouscoder.physicalandmentalhealth.domain.manager.LocalUserManager


class SaveAppEntry(
    private val localUserManager: LocalUserManager
) {
    suspend operator fun invoke()
    {
        localUserManager.saveAppEntry()
    }
}