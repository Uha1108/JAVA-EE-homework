package com.example.beer_v1.model;
import java.util.ArrayList;
import java.util.List;
public class BeerExpert {
    public List<Beer> getBeers(String color) {
        List<Beer> beers = new ArrayList<>();
        if (color.equals("amber")) {
            beers.add(new Beer("Jack Amber", 1995));
            beers.add(new Beer("Red Moose", 2002));
        }else {
                beers.add(new Beer("Jali Pale Ale",1982));
                beers.add(new Beer("Gout Stout",1984));
            }
            return beers;
        }
    }

