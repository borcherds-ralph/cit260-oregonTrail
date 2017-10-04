/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail;

import byui.cit260.oregontrail.model.Wagon;

/**
 *
 * @author ralphb
 */
public class OregonTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Wagon wagon = new Wagon();   //  Calls contructor
       
       wagon.setName("Wagon Team 1");  // Set Name
       
       String playeronename = wagon.getName();  // Get players name and set to variable
       
       System.out.println("Wagon Name: " + playeronename);  // prints name to screen
       
       // this is caseys test comment
       //  THis is a new comment
    }
  
}
    

