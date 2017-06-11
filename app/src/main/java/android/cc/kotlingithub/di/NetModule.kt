package android.cc.kotlingithub.di

import android.app.Application
import com.github.aurae.retrofit2.LoganSquareConverterFactory
import dagger.Module
import dagger.Provides
import okhttp3.Cache
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import javax.inject.Singleton

/**
* Created by aditlal 24/11/16
*/

@Module
class NetModule {

    private val mBaseUrl: String

    // Constructor needs one parameter to instantiate.
    init {
        this.mBaseUrl = "https://api.github.com/"
    }


    @Provides
    @Singleton
    internal fun provideOkHttpCache(application: Application): Cache {
        val cacheSize = 10 * 1024 * 1024 // 10 MiB
        val cache = Cache(application.cacheDir, cacheSize.toLong())
        return cache
    }


    @Provides
    @Singleton
    internal fun provideOkHttpClient(cache: Cache): OkHttpClient {
        // create an instance of OkLogInterceptor using a builder()
        val client = OkHttpClient.Builder()
        client.addInterceptor { mChain ->
            val original = mChain.request()
            val builder = original.newBuilder().header("Content-Type", "application/json")
            builder.addHeader("Accept","application/vnd.github.v3+json")
            val request = builder.build()
            mChain.proceed(request)
        }
        client.cache(cache)
        return client.build()
    }

    @Provides
    @Singleton
    internal fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
                .addConverterFactory(LoganSquareConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .baseUrl(mBaseUrl)
                .client(okHttpClient)
                .build()
    }


}
