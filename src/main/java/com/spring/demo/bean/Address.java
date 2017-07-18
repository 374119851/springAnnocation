package com.spring.demo.bean;

import java.io.Serializable;

/**
 * Created by admin on 2017/7/18.
 */
public class Address implements Serializable {
    private Integer aId;
    private String city;
    private String town;

    public Address() {
    }

    @Override
    public String toString() {
        return "Address{" +
                "aId=" + aId +
                ", city='" + city + '\'' +
                ", town='" + town + '\'' +
                '}';
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
}
