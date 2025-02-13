package com.petros.efthymiou.dailypulse.di

import app.cash.sqldelight.db.SqlDriver
import com.petros.efthymiou.dailypulse.db.DatabaseDriverFactory
import org.koin.dsl.module
import petros.efthymiou.dailypulse.db.DailyPulseDatabase


/**
 * Created by Peal Mazumder on 13/2/25.
 */

val databaseModule = module {
    single<SqlDriver> { DatabaseDriverFactory().createDriver() }

    single<DailyPulseDatabase> { DailyPulseDatabase(get()) }
}