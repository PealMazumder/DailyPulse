package com.petros.efthymiou.dailypulse.db


/**
 * Created by Peal Mazumder on 13/2/25.
 */
actual class DatabaseDriverFactory {
    actual fun createDriver(): SqlDriver {
        NativeSqliteDriver(
            schema = DailyPulseDatabase.Schema,
            name = "DailypulseDatabase.db"
        )
    }
}