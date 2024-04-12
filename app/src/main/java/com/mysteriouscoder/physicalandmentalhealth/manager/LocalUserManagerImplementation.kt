package com.mysteriouscoder.physicalandmentalhealth.manager

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import com.mysteriouscoder.physicalandmentalhealth.domain.manager.LocalUserManager
import com.mysteriouscoder.physicalandmentalhealth.util.Constants
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

// Implementing data store preferences:
// Data store preferences is just a jetpack library that allows us to save key value locally on the device.
// Shared Preferences is another API to save key value but android team introduced us this new API to save key value which is now recommended for that
class LocalUserManagerImplementation(
    private val context: Context
) : LocalUserManager {
    override suspend fun saveAppEntry() {
        context.dataStore.edit { settings ->
            settings[PreferencesKeys.APP_ENTRY] = true
        }
    }

    override fun readAppEntry(): Flow<Boolean> {
        return context.dataStore.data.map { preferences ->
            preferences[PreferencesKeys.APP_ENTRY] ?: false
        }
    }
}

private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = Constants.USER_SETTINGS)

private object PreferencesKeys {
    val APP_ENTRY = booleanPreferencesKey(Constants.APP_ENTRY)
}
