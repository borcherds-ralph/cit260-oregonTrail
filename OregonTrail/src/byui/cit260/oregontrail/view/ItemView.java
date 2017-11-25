/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.ItemControl;
import java.util.Scanner;

/**
 *
 * @author ralphb
 */
public class ItemView extends View {
    
     public ItemView() {
        super("\n******************************************************"
                + "\n                                                      "
                + "\n What do you calculate?"
                + "\n 1 - Volume of Barrel"
                + "\n 2 - Weight of Items"
                + "\n 3 - Gallons form Barrel Volume"
		+ "\n 4 - Calculate volume of cylinder"
		+ "\n 5 - Get total cost of items"
                + "\n Q - Exit Game"
                + "\n "
                + "\n                                                      "
                + "\n******************************************************"
        );
    }
     
     @Override
    public boolean doAction(String choice) {
         int numChoice = 0;

        //choice = choice.toUpperCase();
        try {
             
        numChoice = Integer.parseInt(choice);
        
        } catch (NumberFormatException nf) {
             
             System.out.println("\n You must enter a valid number choice."
             + "\n Try again or enter Q to quit.");
             
        }
        switch (numChoice) {
            
            case 1:
                this.calcVolumeBarrel();
                break;
            case 2:
		this.calcWeight();
                break;
            case 3:
		this.calcGallons();
                break;
            case 4:
		this.calcCylinder();
                break;
	    case 5:
		this.calcCost();
		break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        } 
        return false;
    }
    
    private void calcVolumeBarrel() {
         Scanner top = new Scanner(System.in);
         Scanner center = new Scanner(System.in);
         Scanner height = new Scanner(System.in);
         int topDiam = top.nextInt();
         int centerDiam = center.nextInt();
         int barrelHeight = height.nextInt();
    }
    
    private void calcWeight() {
         
    }
    
    private void calcGallons() {
         
    }
    
    private void calcCylinder() {
         
    }
    
    private void calcCost() {
         
    }
}
