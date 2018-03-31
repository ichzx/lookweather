package com.lookweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {

    public String date;

    public class Temperature{
        public String max;
        public String min;
    }
    @SerializedName("tmp")
    public Temperature temperature;

    public class MoreInfo{
        @SerializedName("txt_d")
        public String info;
    }
    @SerializedName("cond")
    public MoreInfo moreInfo;
}
