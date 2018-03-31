package com.lookweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

    public Update update;
}
