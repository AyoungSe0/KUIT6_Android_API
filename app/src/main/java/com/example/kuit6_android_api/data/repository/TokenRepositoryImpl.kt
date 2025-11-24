package com.example.kuit6_android_api.data.repository

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.first

val Context.dataStore: DataStore<Preferences> by preferencesDataStore("Token")
val KEY = stringPreferencesKey("token")

class TokenRepositoryImpl : TokenRepository {
    override suspend fun saveToken(context: Context, token: String) {
        context.dataStore.edit {
            it[KEY] = token
        }
    }

    override suspend fun getToken(context: Context): String?
    {
        val prefs = context.dataStore.data.first()
        return prefs[KEY]
    }
}