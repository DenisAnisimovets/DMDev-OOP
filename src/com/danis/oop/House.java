package com.danis.oop;

public class House {
    int number;
    Floor[] floors;

    public House(int number, Floor[] floors) {
        this.number = number;
        this.floors = floors;
    }

    public int getNumber() {
        return number;
    }

    public Floor[] getFloors() {
        return floors;
    }

    public void print() {
        System.out.println("На доме №" + number + " " + floors.length + " этажей(а).");
    }
}
