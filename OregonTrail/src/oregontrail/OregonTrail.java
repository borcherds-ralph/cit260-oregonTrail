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
        
       Wagon playerone = new Wagon();   //  Calls contructor
       
       playerone.setQty(1);  // Set Name
       
       int playeronename = playerone.getQty();  // Get players name and set to variable
       
       System.out.println("Wagon(s) Qty: " + playeronename);  // prints name to screen
       
    }
  
}
    

