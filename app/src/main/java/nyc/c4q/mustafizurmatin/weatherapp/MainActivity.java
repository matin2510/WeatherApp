package nyc.c4q.mustafizurmatin.weatherapp;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import nyc.c4q.mustafizurmatin.weatherapp.api.WeatherService;
import nyc.c4q.mustafizurmatin.weatherapp.controller.WeatherAdapter;
import nyc.c4q.mustafizurmatin.weatherapp.model.WeatherJson;
import nyc.c4q.mustafizurmatin.weatherapp.model.WeatherResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {
    private static final String BASE_URL = "https://api.aerisapi.com/";
    //private static final String API_KEY = BuildConfig.API_KEY;
    private static final String CLIENT_ID = "Zsbh4hf3mEcpJWlR6CDP4";
    private static final String CLIENT_SECRET = "OPzoh3bQJE2dMHCYZjZhDHauzLAhSiNDqDaAIhf1";
    //OPzoh3bQJE2dMHCYZjZhDHauzLAhSiNDqDaAIhf1
    private String TAG = "Did you connect? ";
    private boolean mIsSuccessful;
    private List<WeatherResponse> weatherList = new ArrayList<>();
    private RecyclerView weatherRecyclerView;
    private Handler handler;
    private Runnable runnable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weatherRecyclerView = (RecyclerView) findViewById(R.id.weather_recyclerview);
        weatherRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        connectToServer(BASE_URL);

    }

    private void connectToServer(String baseUrl) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        WeatherService service = retrofit.create(WeatherService.class);
        Call<WeatherJson> call = service.getData(CLIENT_ID, CLIENT_SECRET);
        call.enqueue(new Callback<WeatherJson>() {

            @Override
            public void onResponse(Call<WeatherJson> call, retrofit2.Response<WeatherJson> response) {
                try {
                    if (response.isSuccessful()) {
                        Log.d(TAG, "~~~~~~~~~~~~~~onResponse:~~~~~~~~~~~~~~~~~ ");
                        // Log.d("OnResponse", "~~~~~~~~~~~~~~~~`"+response.body().getResponse().get(0).getPeriod().get(0).getMaxTempC()+"~~~~~~~~~~~~~~~~~~~~~`");
                        WeatherJson weatherJson = response.body();
                        weatherList = weatherJson.getResponse();
                        // Log.d(TAG, "weatherList=  " + weatherList.get(0).getPeriod().toString());
                        Log.d(TAG, "onResponse: " + weatherList.toString());
                        weatherRecyclerView.setAdapter(new WeatherAdapter(weatherList));
                    } else {
                        Log.d(TAG, "Error" + response.errorBody().string());
                    }
                } catch (IOException e) {
                    Log.e(TAG, e.getMessage());
                }

            }

            @Override
            public void onFailure(Call<WeatherJson> call, Throwable t) {
                Log.d(TAG, "Oh No you did not. " + t.getMessage());
            }
        });
    }

}
