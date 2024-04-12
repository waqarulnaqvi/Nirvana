package com.mysteriouscoder.physicalandmentalhealth.domain.usecases

import com.mysteriouscoder.physicalandmentalhealth.domain.manager.LocalUserManager
import kotlinx.coroutines.flow.Flow

class ReadAppEntry(
    private val localUserManager: LocalUserManager
) {
    suspend operator fun invoke(): Flow<Boolean> {
       return localUserManager.readAppEntry()
    }
}

//3 48 to 2 19