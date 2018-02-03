package nyc.c4q.mustafizurmatin.weatherapp.model;

/**
 * Created by c4q on 1/28/18.
 */

public class WeatherPeriods
{
    private int timestamp;
    private String validTime;
    private String dateTimeISO;
    private int maxTempC;
    private int maxTempF;
    private int minTempC;
    private int minTempF;
    private int avgTempC;
    private int avgTempF;
   // private object tempC;
   // private object tempF;
    private int pop;
    private double precipMM;
    private double precipIN;
    private int iceaccum;
    private int iceaccumMM;
    private int iceaccumIN;
    private int maxHumidity;
    private int minHumidity;
    private int humidity;
    private int uvi;
    private int pressureMB;
    private double pressureIN;
    private int sky;
    private double snowCM;
    private double snowIN;
    private int feelslikeC;
    private int feelslikeF;
    private int minFeelslikeC;
    private int minFeelslikeF;
    private int maxFeelslikeC;
    private int maxFeelslikeF;
    private int avgFeelslikeC;
    private int avgFeelslikeF;
    private int dewpointC;
    private int dewpointF;
    private int maxDewpointC;
    private int maxDewpointF;
    private int minDewpointC;
    private int minDewpointF;
    private int avgDewpointC;
    private int avgDewpointF;
    private int windDirDEG;
    private String windDir;
    private int windDirMaxDEG;
    private String windDirMax;
    private int windDirMinDEG;
    private String windDirMin;
    private int windGustKTS;
    private int windGustKPH;
    private int windGustMPH;
    private int windSpeedKTS;
    private int windSpeedKPH;
    private int windSpeedMPH;
    private int windSpeedMaxKTS;
    private int windSpeedMaxKPH;
    private int windSpeedMaxMPH;
    private int windSpeedMinKTS;
    private int windSpeedMinKPH;
    private int windSpeedMinMPH;
    private int windDir80mDEG;
    private String windDir80m;
    private int windDirMax80mDEG;
    private String windDirMax80m;
    private int windDirMin80mDEG;
    private String windDirMin80m;
    private int windGust80mKTS;
    private int windGust80mKPH;
    private int windGust80mMPH;
    private int windSpeed80mKTS;
    private int windSpeed80mKPH;
    private int windSpeed80mMPH;
    private int windSpeedMax80mKTS;
    private int windSpeedMax80mKPH;
    private int windSpeedMax80mMPH;
    private int windSpeedMin80mKTS;
    private int windSpeedMin80mKPH;
    private int windSpeedMin80mMPH;
    private String weather;
  //  private List<WeatherCoded> weatherCoded;
    private String weatherPrimary;
    private String weatherPrimaryCoded;
    private String cloudsCoded;
    private String icon;
    private boolean isDay;
    private int sunrise;
    private String sunriseISO;
    private int sunset;
    private String sunsetISO;

    public int getTimestamp() {
        return timestamp;
    }

    public String getValidTime() {
        return validTime;
    }

    public String getDateTimeISO() {
        return dateTimeISO;
    }

    public int getMaxTempC() {
        return maxTempC;
    }

    public int getMaxTempF() {
        return maxTempF;
    }

    public int getMinTempC() {
        return minTempC;
    }

    public int getMinTempF() {
        return minTempF;
    }

    public int getAvgTempC() {
        return avgTempC;
    }

    public int getAvgTempF() {
        return avgTempF;
    }

    public int getPop() {
        return pop;
    }

    public double getPrecipMM() {
        return precipMM;
    }

    public double getPrecipIN() {
        return precipIN;
    }

    public int getIceaccum() {
        return iceaccum;
    }

    public int getIceaccumMM() {
        return iceaccumMM;
    }

    public int getIceaccumIN() {
        return iceaccumIN;
    }

    public int getMaxHumidity() {
        return maxHumidity;
    }

    public int getMinHumidity() {
        return minHumidity;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getUvi() {
        return uvi;
    }

    public int getPressureMB() {
        return pressureMB;
    }

    public double getPressureIN() {
        return pressureIN;
    }

    public int getSky() {
        return sky;
    }

    public double getSnowCM() {
        return snowCM;
    }

    public double getSnowIN() {
        return snowIN;
    }

    public int getFeelslikeC() {
        return feelslikeC;
    }

    public int getFeelslikeF() {
        return feelslikeF;
    }

    public int getMinFeelslikeC() {
        return minFeelslikeC;
    }

    public int getMinFeelslikeF() {
        return minFeelslikeF;
    }

    public int getMaxFeelslikeC() {
        return maxFeelslikeC;
    }

    public int getMaxFeelslikeF() {
        return maxFeelslikeF;
    }

    public int getAvgFeelslikeC() {
        return avgFeelslikeC;
    }

    public int getAvgFeelslikeF() {
        return avgFeelslikeF;
    }

    public int getDewpointC() {
        return dewpointC;
    }

    public int getDewpointF() {
        return dewpointF;
    }

    public int getMaxDewpointC() {
        return maxDewpointC;
    }

    public int getMaxDewpointF() {
        return maxDewpointF;
    }

    public int getMinDewpointC() {
        return minDewpointC;
    }

    public int getMinDewpointF() {
        return minDewpointF;
    }

    public int getAvgDewpointC() {
        return avgDewpointC;
    }

    public int getAvgDewpointF() {
        return avgDewpointF;
    }

    public int getWindDirDEG() {
        return windDirDEG;
    }

    public String getWindDir() {
        return windDir;
    }

    public int getWindDirMaxDEG() {
        return windDirMaxDEG;
    }

    public String getWindDirMax() {
        return windDirMax;
    }

    public int getWindDirMinDEG() {
        return windDirMinDEG;
    }

    public String getWindDirMin() {
        return windDirMin;
    }

    public int getWindGustKTS() {
        return windGustKTS;
    }

    public int getWindGustKPH() {
        return windGustKPH;
    }

    public int getWindGustMPH() {
        return windGustMPH;
    }

    public int getWindSpeedKTS() {
        return windSpeedKTS;
    }

    public int getWindSpeedKPH() {
        return windSpeedKPH;
    }

    public int getWindSpeedMPH() {
        return windSpeedMPH;
    }

    public int getWindSpeedMaxKTS() {
        return windSpeedMaxKTS;
    }

    public int getWindSpeedMaxKPH() {
        return windSpeedMaxKPH;
    }

    public int getWindSpeedMaxMPH() {
        return windSpeedMaxMPH;
    }

    public int getWindSpeedMinKTS() {
        return windSpeedMinKTS;
    }

    public int getWindSpeedMinKPH() {
        return windSpeedMinKPH;
    }

    public int getWindSpeedMinMPH() {
        return windSpeedMinMPH;
    }

    public int getWindDir80mDEG() {
        return windDir80mDEG;
    }

    public String getWindDir80m() {
        return windDir80m;
    }

    public int getWindDirMax80mDEG() {
        return windDirMax80mDEG;
    }

    public String getWindDirMax80m() {
        return windDirMax80m;
    }

    public int getWindDirMin80mDEG() {
        return windDirMin80mDEG;
    }

    public String getWindDirMin80m() {
        return windDirMin80m;
    }

    public int getWindGust80mKTS() {
        return windGust80mKTS;
    }

    public int getWindGust80mKPH() {
        return windGust80mKPH;
    }

    public int getWindGust80mMPH() {
        return windGust80mMPH;
    }

    public int getWindSpeed80mKTS() {
        return windSpeed80mKTS;
    }

    public int getWindSpeed80mKPH() {
        return windSpeed80mKPH;
    }

    public int getWindSpeed80mMPH() {
        return windSpeed80mMPH;
    }

    public int getWindSpeedMax80mKTS() {
        return windSpeedMax80mKTS;
    }

    public int getWindSpeedMax80mKPH() {
        return windSpeedMax80mKPH;
    }

    public int getWindSpeedMax80mMPH() {
        return windSpeedMax80mMPH;
    }

    public int getWindSpeedMin80mKTS() {
        return windSpeedMin80mKTS;
    }

    public int getWindSpeedMin80mKPH() {
        return windSpeedMin80mKPH;
    }

    public int getWindSpeedMin80mMPH() {
        return windSpeedMin80mMPH;
    }

    public String getWeather() {
        return weather;
    }

    public String getWeatherPrimary() {
        return weatherPrimary;
    }

    public String getWeatherPrimaryCoded() {
        return weatherPrimaryCoded;
    }

    public String getCloudsCoded() {
        return cloudsCoded;
    }

    public String getIcon() {
        return icon;
    }

    public boolean isDay() {
        return isDay;
    }

    public int getSunrise() {
        return sunrise;
    }

    public String getSunriseISO() {
        return sunriseISO;
    }

    public int getSunset() {
        return sunset;
    }

    public String getSunsetISO() {
        return sunsetISO;
    }
}
