package testrisk.dictionary

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Headers

const val BASE_URL = "https://raw.githubusercontent.com/"
const val BRANCH = "master"

interface TermsApi {

    @GET("/gunesmes/testsozluk/$BRANCH/terms.json")
    fun getTerms(): Call<List<Term>>

    companion object {
        operator fun invoke(): TermsApi {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(TermsApi::class.java)
        }
    }

    @Headers("Content-Type: text/plain")
    @GET("/gunesmes/testsozluk/$BRANCH/README.md")
    fun getReadMe(): Call<ResponseBody>

    @Headers("Content-Type: text/plain")
    @GET("/gunesmes/testsozluk/$BRANCH/LICENSE")
    fun getLicense(): Call<ResponseBody>

    @GET("https://api.github.com/repos/gunesmes/testsozluk/contents?ref=$BRANCH")
    fun getLatestCommit(): Call<ResponseBody>
}
