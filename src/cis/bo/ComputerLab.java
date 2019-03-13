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
public class ComputerLab extends Room {
    
    private int numberOfComputers;
    
    @Override
    public void getDetails() {
        super.getDetails();
        numberOfComputers = CisUtility.getInputInt("Enter the number of computers:");
    }

    public int getNumberOfComputers() {
        return numberOfComputers;
    }

    public void setNumberOfComputers(int numberOfComputers) {
        this.numberOfComputers = numberOfComputers;
    }
    
    @Override
    public String toString() {
        return super.toString()+", Number of computers: "+numberOfComputers;
    }
    
}
