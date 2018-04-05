package com.lookweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Now {

    @SerializedName("tmp")
    public String temprature;   //温度

    @SerializedName("hum")
    public String humid;        //湿度

    @SerializedName("wind_dir")
    public String windDir;      //风向

    @SerializedName("wind_spd")
    public String windSpd;      //风速

    @SerializedName("vis")
    public String visual;       //能见度

    @SerializedName("pcpn")
    public String precipitation;    //降雨量

    @SerializedName("pres")
    public String pressure;     //大气压强

    public class MoreInfo{
        @SerializedName("txt")
        public String info;     //天气情况
    }

    @SerializedName("cond")
    public MoreInfo moreInfo;
}
