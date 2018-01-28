package nyc.c4q.mustafizurmatin.weatherapp.api;

import nyc.c4q.mustafizurmatin.weatherapp.model.WeatherJson;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by c4q on 1/28/18.
 */

public class WeatherService {
    @GET("forecasts/11101")
    Call<WeatherJson> getData(@Query("client_id") String clientID, @Query("client_secret") String clientSecret) {
        return null;
    }
}
