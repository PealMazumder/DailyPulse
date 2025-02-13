package com.petros.efthymiou.dailypulse.db

import app.cash.sqldelight.db.SqlDriver


/**
 * Created by Peal Mazumder on 13/2/25.
 */
expect class DatabaseDriverFactory {
    fun createDriver(): SqlDriver
}