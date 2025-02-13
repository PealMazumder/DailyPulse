package com.petros.efthymiou.dailypulse.db

import android.content.Context
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.android.AndroidSqliteDriver
import petros.efthymiou.dailypulse.db.DailyPulseDatabase


/**
 * Created by Peal Mazumder on 13/2/25.
 */
actual class DatabaseDriverFactory(private val context: Context) {
    actual fun createDriver(): SqlDriver {
        return AndroidSqliteDriver(
            schema = DailyPulseDatabase.Schema,
            context = context,
            name = "Dailypulse.Database.db"
        )
    }
}