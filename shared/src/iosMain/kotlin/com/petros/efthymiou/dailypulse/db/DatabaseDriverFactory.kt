package com.petros.efthymiou.dailypulse.db

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.native.NativeSqliteDriver
import petros.efthymiou.dailypulse.db.DailyPulseDatabase


/**
 * Created by Peal Mazumder on 13/2/25.
 */

actual class DatabaseDriverFactory {
    actual fun createDriver(): SqlDriver {
        return NativeSqliteDriver(
            schema = DailyPulseDatabase.Schema,
            name = "DailypulseDatabase.db"
        )
    }
}
