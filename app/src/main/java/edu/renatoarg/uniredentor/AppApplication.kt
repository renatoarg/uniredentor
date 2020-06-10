package edu.renatoarg.uniredentor

import android.app.Application
import edu.renatoarg.uniredentor.commons.gradeModule
import org.koin.core.context.startKoin

class AppApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(gradeModule)
        }
    }
}