package com.example.android.tourguide.dataType;

public class RestaurantDataType {
    public int imag;
    public String name;
    public String detail;
    public String address;
    public String phone;
    public String email;
    public String workTime;

    public String getName() {
        return name;
    }

    public String getDetail() {
        return detail;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getWorkTime() {
        return workTime;
    }

    public RestaurantDataType(int imag, String name, String detail, String address, String phone, String email, String workTime) {
        this.imag = imag;
        this.name = name;
        this.detail = detail;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.workTime = workTime;
    }
}
