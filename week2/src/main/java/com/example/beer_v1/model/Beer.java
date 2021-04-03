package com.example.beer_v1.model;

public class Beer {
    private String band;
    private int year_of_birth;

    public Beer(String band, int year_of_birth) {
        this.band = band;
        this.year_of_birth = year_of_birth;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public int getSize() {
        return year_of_birth;
    }

    public void setSize(int year_of_birth) {
        this.year_of_birth =year_of_birth;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "band:'" + band + '\'' +
                ", year_of_birth:" + year_of_birth+
                '}';
    }
}
