package com.lookweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Suggestion {

    public class Comfort{
        @SerializedName("txt")
        public String comfortInfo;
    }

    @SerializedName("comf")
    public Comfort comfort;

    public class CarWash{
        @SerializedName("txt")
        public String carWashInfo;
    }

    @SerializedName("cw")
    public CarWash carWash;

    public class Sport{
        @SerializedName("txt")
        public String sportInfo;
    }

    public Sport sport;
}
