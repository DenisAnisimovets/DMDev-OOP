package com.danis.oop;

public class Room {
    boolean isCommunicatingRoom;

    public Room(boolean isCommunicatingRoom) {
        this.isCommunicatingRoom = isCommunicatingRoom;
    }

    public boolean isCommunicatingRoom() {
        return isCommunicatingRoom;
    }

    public void print() {
            System.out.println("Комната " + (isCommunicatingRoom ? "": "не ") + "проходная");
    }
}
