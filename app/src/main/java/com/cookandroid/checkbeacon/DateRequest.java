package com.cookandroid.checkbeacon;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by HAEUN on 2017-11-21.
 */

public class DateRequest extends StringRequest {

    final static private String URL = "http://192.168.203.45/Timedata.php";
    private Map<String, String> parameters;

    public DateRequest(String inTime, String userID, String userName, String checkIn, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("inTime", inTime);
        parameters.put("userID", userID);
        parameters.put("userName", userName);
        parameters.put("checkIn", checkIn);
    }

    @Override
    public Map<String, String> getParams() {
        return parameters;

    }

}
