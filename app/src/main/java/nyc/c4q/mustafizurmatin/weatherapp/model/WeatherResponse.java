package nyc.c4q.mustafizurmatin.weatherapp.model;

import java.util.List;

import nyc.c4q.mustafizurmatin.weatherapp.model.Loc;
import nyc.c4q.mustafizurmatin.weatherapp.model.WeatherPeriods;
import nyc.c4q.mustafizurmatin.weatherapp.model.WeatherProfile;

/**
 * Created by c4q on 1/28/18.
 */

public class WeatherResponse {
    //Main onw
   private Loc loc;
   private String interval;
   private List<WeatherPeriods> periods;
   private WeatherProfile profile;

    public Loc getLoc() {
        return loc;
    }

    public String getInterval() {
        return interval;
    }

    public List<WeatherPeriods> getPeriods() {
        return periods;
    }

    public WeatherProfile getProfile() {
        return profile;
    }
}
