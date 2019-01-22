package com.example.android.tourguide.dataType;

public class HistoricalDataType {
    public int imag;
    public String title;
    public String detail;

    public String getTitle() {
        return title;
    }

    public String getDetail() {
        return detail;
    }

    public HistoricalDataType(int imag, String title, String detail) {
        this.imag = imag;
        this.title = title;
        this.detail = detail;
    }
}
