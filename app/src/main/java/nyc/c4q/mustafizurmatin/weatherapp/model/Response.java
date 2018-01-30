package nyc.c4q.mustafizurmatin.weatherapp.model;

import java.util.List;

/**
 * Created by c4q on 1/28/18.
 */

public class Response {
    public Loc loc;
    public String interval;
    public List<Weather> periods = null;
    public Profile profile;
}
