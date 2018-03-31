package com.lookweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Now {

    @SerializedName("tmp")
    public String temprature;

    public class MoreInfo{
        @SerializedName("txt")
        public String info;
    }

    @SerializedName("cond")
    public MoreInfo moreInfo;
}
