package nyc.c4q.mustafizurmatin.weatherapp.model;

import java.util.List;

import nyc.c4q.mustafizurmatin.weatherapp.model.WeatherResponse;

/**
 * Created by c4q on 1/28/18.
 */

public class WeatherJson {
    private Boolean success;
    private String error;
    private List<WeatherResponse> response;

    public Boolean getSuccess() {
        return success;
    }

    public String getError() {
        return error;
    }

    public List<WeatherResponse> getResponse() {
        return response;
    }
}
