package com.maggioni.model;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

        List brands = new ArrayList();
    public List getBrands(String color) {
        if (color.equals("amber")) {
            addAmbersBeers();
        } else {
            addRestBeer();
        }
        return brands;
    }

    private void addAmbersBeers() {
        brands.add("Jack Amber");
        brands.add("Red Moose");
    }

    private void addRestBeer() {
        brands.add("Jail Pale Ale");
        brands.add("Gout");
    }
}