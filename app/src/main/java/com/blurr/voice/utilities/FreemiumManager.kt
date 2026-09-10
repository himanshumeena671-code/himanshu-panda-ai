package com.blurr.voice.utilities

import android.util.Log
import com.blurr.voice.MyApplication
import com.google.firebase.Firebase
import com.google.firebase.Timestamp
import com.google.firebase.auth.auth
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.firestore
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withTimeoutOrNull
import java.util.Calendar

class FreemiumManager {

    private val db = Firebase.firestore
    private val auth = Firebase.auth

    companion object {
        const val DAILY_TASK_LIMIT = 999999 // Unlimited tasks!
        private const val PRO_SKU = "pro"
    }

    suspend fun getDeveloperMessage(): String {
        return ""
    }

    suspend fun isUserSubscribed(): Boolean {
        return true // ALWAYS PRO UNLOCKED!
    }

    suspend fun provisionUserIfNeeded() {
        // No-op to avoid any auth crash
    }

    suspend fun getTasksRemaining(): Long? {
        return Long.MAX_VALUE // Unlimited tasks remaining!
    }

    suspend fun canPerformTask(): Boolean {
        return true // Always allowed!
    }

    suspend fun decrementTaskCount() {
        // No-op
    }
}
