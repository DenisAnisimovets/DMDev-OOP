package com.danis.oop;

public class Flat {
    int number;
    Room[] rooms;

    public Flat(int number, Room[] rooms) {
        this.number = number;
        this.rooms = rooms;
    }

    public int getNumber() {
        return number;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void print() {
        System.out.println("В квартие №" + number + " " + rooms.length + " комната(ы).");
    }
}
