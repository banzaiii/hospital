package ws.sova.hospital;

/**
 * Created by ololo on 12/9/14.
 */

import java.io.*;
import java.net.*;
import com.google.gson.Gson;


public class Hospital {

    private String host;


    /**
     * @param url String - URL
     * @return json string
     */
    public String getJson(String url) {
        String response = "";
        try {

            URL hospital = new URL(host + url);

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(hospital.openStream())
            );
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                response += inputLine;
            }

        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
        return response;
    }


    /**
     * Get all departments
     * @param json String
     * @return
     */
    public Departments depDeserialize(String json)
    {
        final Departments departments;
        departments = new Gson().fromJson(json, Departments.class);
        return departments;
    }

    /**
     * Get contact information
     * @param json String
     * @return
     */
    public Contacts contactDeserialize(String json)
    {
        final Contacts contacts;
        contacts = new Gson().fromJson(json, Contacts.class);
        return contacts;
    }

    /**
     * Get working day list
     * @param json String
     * @return
     */
    public Day dayDeserialize(String json)
    {
        final Day day;
        day = new Gson().fromJson(json, Day.class);
        return day;
    }

    /**
     * Get doctor list
     * @param json String
     * @return
     */
    public Doctors docsDeserialize(String json)
    {
        final Doctors docs;
        docs = new Gson().fromJson(json, Doctors.class);
        return docs;
    }

    /**
     * Constructor
     * @param host String Hospital API URL
     */
    public Hospital(String host) {
        this.host = "http://" + host + "/json";
    }
}
