package nyc.c4q.mustafizurmatin.weatherapp.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import nyc.c4q.mustafizurmatin.weatherapp.R;
import nyc.c4q.mustafizurmatin.weatherapp.model.WeatherResponse;

/**
 * Created by c4q on 1/28/18.
 */

public class WeatherViewHolder extends RecyclerView.ViewHolder {
    private TextView date;
    private ImageView weatherImage;
    private TextView highTemp;
    private TextView lowTemp;
    public WeatherViewHolder(View itemView) {
        super(itemView);
        date = (TextView) itemView.findViewById(R.id.date_textview);
        highTemp = (TextView) itemView.findViewById(R.id.temp_high_textview);
        lowTemp = (TextView) itemView.findViewById(R.id.temp_low_textview);

    }


    public void onBind(WeatherResponse weatherResponse) {
        // date.setText(period.dateTimeISO);
//        Log.d("OnBind", "~~~~~~~~~~~~~~~~`"+weatherResponse.getPeriod().get(0).getMaxTempC()+"~~~~~~~~~~~~~~~~~~~~~`");
        try {
            highTemp.setText("High: " + weatherResponse.getPeriods().get(0).getMaxTempC() + " deg C");
            lowTemp.setText("Low: " + weatherResponse.getPeriods().get(0).getMinTempC() + " deg C");
            date.setText("City: " + weatherResponse.getProfile().getTz());

        }catch (Exception e){
            e.printStackTrace();
        }
        // final WeatherResponse weather = period;

    }
}
