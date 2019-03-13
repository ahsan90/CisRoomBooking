/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis.bo;

import cis.util.CisUtility;

/**
 *
 * @author thickey2
 */
public class Room {
    
    private int roomNumber;
    private String roomType;
    private int numberOfSeats;
    private boolean booked;
    
    public Room() {
        getDetails();
    }
    
    public void getDetails() {
        
        roomType = CisUtility.getInputString("Enter the room type:");
        roomNumber = CisUtility.getInputInt("Enter the room number:");
        numberOfSeats = CisUtility.getInputInt("Enter the number of seats:");
        booked = false;
        
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }
    
    @Override
    public String toString() {
        return "Room number: #"+roomNumber+", Room type: "+roomType+", Number of seats: "+numberOfSeats+", Booked: "+booked;
    }
    
}
