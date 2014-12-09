package ws.sova.hospital;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by ololo on 12/9/14.
 */
public class Departments {

    public String mode;
    public ArrayList<Map<String,Object>> data;
    public String error;

    @Override
    public String toString()
    {
        String tmp = "";
        for(int i = 0; i<data.size();i++) {
            tmp += data.get(i).get("uid") + " = " + data.get(i).get("name") + "\n";
        }
        return tmp;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public ArrayList<Map<String, Object>> getData() {
        return data;
    }

    public void setData(ArrayList<Map<String, Object>> data) {
        this.data = data;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
}

