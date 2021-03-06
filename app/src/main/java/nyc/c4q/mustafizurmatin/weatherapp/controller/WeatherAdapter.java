package nyc.c4q.mustafizurmatin.weatherapp.controller;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.mustafizurmatin.weatherapp.R;
import nyc.c4q.mustafizurmatin.weatherapp.model.WeatherResponse;
import nyc.c4q.mustafizurmatin.weatherapp.view.WeatherViewHolder;

/**
 * Created by c4q on 1/28/18.
 */

public class WeatherAdapter extends RecyclerView.Adapter<WeatherViewHolder> {
    private List<WeatherResponse> periodList = new ArrayList<>();

    public WeatherAdapter(List<WeatherResponse> periodList) {
        this.periodList = periodList;
    }

    @Override
    public WeatherViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.weather_item_detail, parent, false);
        return new WeatherViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(WeatherViewHolder holder, int position) {
        Log.d("ViewHolderOnBind", "~~~~~~~~~"+periodList.size()+"~~~~~~~~~~~~");
        holder.onBind(periodList.get(position));

    }

    @Override
    public int getItemCount() {
          return periodList.size();
    }
}
