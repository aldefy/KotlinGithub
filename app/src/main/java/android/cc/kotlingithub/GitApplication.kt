package android.cc.kotlingithub

import android.app.Application
import android.cc.kotlingithub.di.AppModule
import android.cc.kotlingithub.di.DaggerNetComponent
import android.cc.kotlingithub.di.NetComponent
import android.cc.kotlingithub.di.NetModule

/**
 * Created by aditlal 11/06/17
 */
class GitApplication : Application() {

    var mNetComponent: NetComponent? = null
    var instance: GitApplication? = null


    override fun onCreate() {
        super.onCreate()
        instance = this
        mNetComponent = DaggerNetComponent.builder()
                // list of modules that are part of this component need to be created here too
                .appModule( AppModule(this)) // This also corresponds to the name of your module: %component_name%Module
                .netModule( NetModule())
        .build()
    }
}