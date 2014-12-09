package ws.sova.hospital;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by ololo on 12/9/14.
 */
public class Day {

    public String day;
    public ArrayList<Map<String,Object>> data;
    public String error;

    @Override
    public String toString()
    {
        String tmp = "";
        for(int i = 0; i<data.size();i++)
        {
            tmp += data.get(i).get("day") + "=" + data.get(i).get("weekday") + "\n";
        }
        return tmp;
    }

    public Day(String day, ArrayList<Map<String, Object>> data, String error) {
        this.day = day;
        this.data = data;
        this.error = error;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public ArrayList<Map<String, Object>> getData() {
        return data;
    }

    public void setData(ArrayList<Map<String, Object>> data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
