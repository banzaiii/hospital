package ws.sova.hospital;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by ololo on 12/9/14.
 */
public class Contacts {
    public String mode;
    public ArrayList<Map<String, Object>> data;
    public String error;

    @Override
    public String toString()
    {
        String tmp = "";
        for(int i = 0; i<data.size();i++) {
            tmp += data.get(i).get("cid") + " = " + data.get(i).get("name") + " " + data.get(i).get("phone") + "\n";
        }
        return tmp;
    }

    public Contacts(String mode, ArrayList<Map<String, Object>> data, String error) {
        this.mode = mode;
        this.data = data;
        this.error = error;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
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
