package com.example.android.tourguide.dataType;

public class RentCarDataType {
    public String name;
    public String address;
    public String phone;
    public String workTime;

    public RentCarDataType(String name, String address, String phone, String workTime) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.workTime = workTime;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getWorkTime() {
        return workTime;
    }
}
