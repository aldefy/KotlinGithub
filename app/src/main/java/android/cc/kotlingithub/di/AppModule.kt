package android.cc.kotlingithub.di

import android.app.Application
import android.cc.kotlingithub.GitApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by aditlal on 24/11/16.
 */

@Module
class AppModule(internal var mApplication: GitApplication) {

    @Provides
    @Singleton
    internal fun providesApplication(): Application {
        return mApplication
    }


}