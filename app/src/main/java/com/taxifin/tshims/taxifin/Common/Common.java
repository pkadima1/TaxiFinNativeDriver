package com.taxifin.tshims.taxifin.Common;

import com.taxifin.tshims.taxifin.Remote.IGoogleAPI;
import com.taxifin.tshims.taxifin.Remote.RetrofitClient;

public class Common {
    public static final String baseURL = "https://maps.googleapis.com";
    public static IGoogleAPI getGooleAPI()
    {
        return RetrofitClient.getClient(baseURL).create(IGoogleAPI.class);

    }
}
