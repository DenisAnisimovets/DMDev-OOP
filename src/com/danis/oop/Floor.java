package com.danis.oop;

public class Floor {
    int floor;
    Flat[] flats;

    public Floor(int floor, Flat[] flats) {
        this.floor = floor;
        this.flats = flats;
    }

    public int getFloor() {
        return floor;
    }

    public Flat[] getFlats() {
        return flats;
    }

    public void print() {
        System.out.println("На этаже №" + floor + " " + flats.length + " квартира(ы).");
    }
}
