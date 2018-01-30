package nyc.c4q.mustafizurmatin.weatherapp.model;

import java.util.List;

/**
 * Created by c4q on 1/28/18.
 */

public class Weather {
    public Integer timestamp;
    public String validTime;
    public String dateTimeISO;
    public Integer maxTempC;
    public Integer maxTempF;
    public Integer minTempC;
    public Integer minTempF;
    public Integer avgTempC;
    public Integer avgTempF;
    public Object tempC;
    public Object tempF;
    public Integer pop;
    public Double precipMM;
    public Double precipIN;
    public Object iceaccum;
    public Integer maxHumidity;
    public Integer minHumidity;
    public Integer humidity;
    public Object uvi;
    public Integer pressureMB;
    public Double pressureIN;
    public Integer sky;
    public Integer snowCM;
    public Integer snowIN;
    public Integer feelslikeC;
    public Integer feelslikeF;
    public Integer minFeelslikeC;
    public Integer minFeelslikeF;
    public Integer maxFeelslikeC;
    public Integer maxFeelslikeF;
    public Integer avgFeelslikeC;
    public Integer avgFeelslikeF;
    public Integer dewpointC;
    public Integer dewpointF;
    public Integer maxDewpointC;
    public Integer maxDewpointF;
    public Integer minDewpointC;
    public Integer minDewpointF;
    public Integer avgDewpointC;
    public Integer avgDewpointF;
    public Integer windDirDEG;
    public String windDir;
    public Integer windDirMaxDEG;
    public String windDirMax;
    public Integer windDirMinDEG;
    public String windDirMin;
    public Integer windGustKTS;
    public Integer windGustKPH;
    public Integer windGustMPH;
    public Integer windSpeedKTS;
    public Integer windSpeedKPH;
    public Integer windSpeedMPH;
    public Integer windSpeedMaxKTS;
    public Integer windSpeedMaxKPH;
    public Integer windSpeedMaxMPH;
    public Integer windSpeedMinKTS;
    public Integer windSpeedMinKPH;
    public Integer windSpeedMinMPH;
    public Integer windDir80mDEG;
    public String windDir80m;
    public Integer windDirMax80mDEG;
    public String windDirMax80m;
    public Integer windDirMin80mDEG;
    public String windDirMin80m;
    public Integer windGust80mKTS;
    public Integer windGust80mKPH;
    public Integer windGust80mMPH;
    public Integer windSpeed80mKTS;
    public Integer windSpeed80mKPH;
    public Integer windSpeed80mMPH;
    public Integer windSpeedMax80mKTS;
    public Integer windSpeedMax80mKPH;
    public Integer windSpeedMax80mMPH;
    public Integer windSpeedMin80mKTS;
    public Integer windSpeedMin80mKPH;
    public Integer windSpeedMin80mMPH;
    public String weather;
    public List<WeatherCoded> weatherCoded = null;
    public String weatherPrimary;
    public String weatherPrimaryCoded;
    public String cloudsCoded;
    public String icon;
    public Boolean isDay;
    public Integer sunrise;
    public String sunriseISO;
    public Integer sunset;
    public String sunsetISO;
}