package shofi.pertama.android.mysunsine;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import shofi.pertama.android.mysunsine.data.WeatherResult;

/**
 * Created by asus on 20/08/2017.
 */

public interface WeatherApi {

   @GET("forcash/daily")
    Call<WeatherResult>getWeatherList(@Query("q")String City,@Query("units")String units,@Query("cnt")int count, @Query("appip")String ApiKey)
}
