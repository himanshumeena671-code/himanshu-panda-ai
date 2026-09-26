package com.blurr.voice.utilities

import android.util.Log
import com.android.billingclient.api.BillingClient
import com.blurr.voice.MyApplication
import com.google.firebase.Firebase
import com.google.firebase.auth.auth
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.firestore
import kotlinx.coroutines.tasks.await

class FreemiumManager {

    private val db = Firebase.firestore
    private val auth = Firebase.auth
    private val billingClient: BillingClient = MyApplication.billingClient

    companion object {
        const val DAILY_TASK_LIMIT = 999999 // Effectively unlimited
        private const val PRO_SKU = "pro"
    }

    suspend fun getDeveloperMessage(): String {
        return "Premium Unlocked"
    }

    suspend fun isUserSubscribed(): Boolean {
        return true
    }

    suspend fun provisionUserIfNeeded() {
        // No-op for patched version
    }

    suspend fun getTasksRemaining(): Long? {
        return Long.MAX_VALUE
    }

    suspend fun canPerformTask(): Boolean {
        return true
    }

    suspend fun decrementTaskCount() {
        // No-op
    }
}
