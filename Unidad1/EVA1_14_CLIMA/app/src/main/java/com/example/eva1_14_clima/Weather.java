package com.example.eva1_14_clima;

public class Weather {
    private String city;
    private double temp;
    private String desc;
    private int imageWeather;

    public Weather() {
    }

    public Weather(String city, double temp, String desc, int imageWeather) {
        this.city = city;
        this.temp = temp;
        this.desc = desc;
        this.imageWeather = imageWeather;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImageWeather() {
        return imageWeather;
    }

    public void setImageWeather(int imageWeather) {
        this.imageWeather = imageWeather;
    }
}
