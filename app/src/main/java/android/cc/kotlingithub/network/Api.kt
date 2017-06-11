package android.cc.kotlingithub.network

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable

/**
 * Created by aditlal 11/06/17
 */

interface Api {

    @GET("search/repositories")
    fun getRepos(@Query("q") query: String, @Query("per_page") per_page: Int): Observable<Response<*>>
}
