package com.example.c0773839_ex6.Model;

import java.io.Serializable;

public class CanadaAttraction implements Serializable {


        private String id;
        private String name;
        private String address;
        private String city;
        private String province;
        private String description;
        private String image_name;

    public CanadaAttraction(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public CanadaAttraction(String id, String name, String address, String city, String province, String description, String image_name) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.city = city;
        this.province = province;
        this.description = description;
        this.image_name = image_name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public String getDescription() {
        return description;
    }

    public String getImage_name() {
        return image_name;
    }
}
