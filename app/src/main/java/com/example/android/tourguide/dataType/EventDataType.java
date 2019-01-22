package com.example.android.tourguide.dataType;


public class EventDataType {
    String date;
    String address;
    int image;

    public EventDataType(String date, String address, int image) {
        this.date = date;
        this.address = address;
        this.image = image;
    }

    public String getDate() {
        return date;
    }

    public String getAddress() {
        return address;
    }

    public int getImage() {
        return image;
    }
}
