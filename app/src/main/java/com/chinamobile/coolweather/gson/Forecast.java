package com.chinamobile.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yjj on 2017/1/6.
 */

public class Forecast {

    public String date;

    @SerializedName("tem")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{

        public String max;

        public String mix;
    }

    public class More{

        @SerializedName("text_d")
        public String info;
    }
}
