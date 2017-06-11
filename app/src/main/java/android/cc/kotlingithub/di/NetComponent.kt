package android.cc.kotlingithub.di

import dagger.Component
import retrofit2.Retrofit
import javax.inject.Singleton

/**
 * Created by aditlal on 24/11/16.
 */
@Singleton
@Component(modules = arrayOf(AppModule::class, NetModule::class))
interface NetComponent {
    fun retrofit(): Retrofit
}
