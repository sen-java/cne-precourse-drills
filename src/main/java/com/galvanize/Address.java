package com.galvanize;

/**
 * Created by SENTHILKUMAR.MURUGAN on 3/13/2017.
 */
public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    public Address(
            String street,
            String city,
            String state,
            String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        String address = street + ", " + city + ", " + state +" "+ zip;
        return address;
    }
}
