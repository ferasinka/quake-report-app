package com.example.android.quakereport;

public class Earthquake {
    private double magnitude;
    private String place;
    private String url;

    /**
     * Time of the earthquake
     */
    private long mTimeInMilliseconds;

    public Earthquake(double magnitude, String place, long timeInMilliseconds, String url) {
        this.magnitude = magnitude;
        this.place = place;
        mTimeInMilliseconds = timeInMilliseconds;
        this.url = url;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public String getPlace() {
        return place;
    }

    public String getUrl() {
        return url;
    }

    /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
