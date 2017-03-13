package com.galvanize;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SENTHILKUMAR.MURUGAN on 3/13/2017.
 */
public class Business implements Addressable {

    private final String name;
    private final ArrayList<Address> addresses = new ArrayList<Address>();

    public Business(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void addAddress(Address address) {
        addresses.add(address);
    }


    public List<Address> getAddresses() {
        return addresses;
    }
}
