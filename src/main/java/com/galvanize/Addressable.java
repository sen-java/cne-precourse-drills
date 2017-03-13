package com.galvanize;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SENTHILKUMAR.MURUGAN on 3/13/2017.
 */
public interface Addressable {

    public List<Address> getAddresses();
    public void addAddress(Address address);
}