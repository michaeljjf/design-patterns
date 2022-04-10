package com.jiangjf.dp.builder;

/**
 * @author jiangjf
 * @date 2022/4/9
 */
public class Location {
    private String city;
    private String address;

    public Location() {
    }

    public Location(String city, String address) {
        this.city = city;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Location{" +
                "city='" + city + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
