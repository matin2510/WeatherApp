package nyc.c4q.mustafizurmatin.weatherapp.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import nyc.c4q.mustafizurmatin.weatherapp.R;
import nyc.c4q.mustafizurmatin.weatherapp.model.Weather;

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


    public void onBind(Weather period) {
        date.setText(period.dateTimeISO);
        highTemp.setText("High: " + period.maxTempC + " deg C");
        lowTemp.setText("Low: " + period.minTempC + " deg C");
        final Weather weather = period;

    }


}
