/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.ItemControl;
import byui.cit260.oregontrail.exceptions.ItemControlException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                  + "\n 3 - Gallons from Barrel Volume"
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

               case 1: {
                    try {
                         this.calcVolumeBarrel();
                    } catch (ItemControlException ex) {
                         Logger.getLogger(ItemView.class.getName()).log(Level.SEVERE, null, ex);
                    }
               }

               break;
               case 2: {
                    try {
                         this.calcWeight();
                    } catch (ItemControlException ex) {
                         Logger.getLogger(ItemView.class.getName()).log(Level.SEVERE, null, ex);
                    }
               }
               break;
               case 3: {
                    try {
                         this.calcGallons();
                    } catch (ItemControlException ex) {
                         Logger.getLogger(ItemView.class.getName()).log(Level.SEVERE, null, ex);
                    }
               }
                    break;
               case 4: {
                    try {
                         this.calcCylinder();
                    } catch (ItemControlException ex) {
                         Logger.getLogger(ItemView.class.getName()).log(Level.SEVERE, null, ex);
                    }
               }
                    break;
               case 5: {
                    try {
                         this.calcCost();
                    } catch (ItemControlException ex) {
                         Logger.getLogger(ItemView.class.getName()).log(Level.SEVERE, null, ex);
                    }
               }
                    break;
               default:
                    System.out.println("\n*** Invalid selection *** Try again");
                    break;
          }
          return false;
     }

     private void calcVolumeBarrel() throws ItemControlException {

          ItemControl instance = new ItemControl();

          Scanner dimensions = new Scanner(System.in);

          System.out.println("Please enter the top diameter of the barrel:");
          double topDiameter = dimensions.nextInt();

          System.out.println("Please enter the center diameter of the barrel:");
          double centerDiameter = dimensions.nextInt();

          System.out.println("Please enter the height of the barrel:");
          double barrelHeight = dimensions.nextInt();

          double result = instance.calcVolumeOfBarrel(barrelHeight, centerDiameter, topDiameter);

          System.out.println("The total volume of the barrel is: " + result + " cubic inches."
                  + "\n Please run #3 - Gallons from Barrel Volume to get the number of gallons. ");

     }

     private void calcWeight() throws ItemControlException {

          ItemControl instance = new ItemControl();
         
          Scanner dimensions = new Scanner(System.in);
          
          System.out.println("Please enter the qty: ");
          double qty = dimensions.nextDouble();
          
          System.out.println("\nPlease enter the weight of 1 item");
          double weight = dimensions.nextDouble();
          
          double result = instance.calcWeightOfItem(qty, weight);

          System.out.println("The total weight is: " + result + " for."
                  + "\n" + qty + " Items, each weighing: " + weight);

     }

     private void calcGallons() throws ItemControlException {

          ItemControl instance = new ItemControl();
          
           Scanner quantity = new Scanner(System.in);
           System.out.println("Please enter the Cubic inces volume: ");
          double volume = quantity.nextDouble();
          
          double result = instance.calcBarrelVolumeToGallons(volume);
          
          System.out.println("The total number of gallons for your barrel is: " + result);

     }

     private void calcCylinder() throws ItemControlException {

          ItemControl instance = new ItemControl();
          
           Scanner diameter = new Scanner(System.in);
           
           System.out.println("Please enter the diameter of the cylendar: ");
          double cylDiameter = diameter.nextDouble();
          
           System.out.println("Please enter the height of the cylendar: ");
          double cylHeight = diameter.nextDouble();
          
          double result = instance.calcCylinderVolume(cylDiameter, cylHeight);
          
          System.out.println("\n The volume of the cylendar is: " + result );
     }

     private void calcCost() throws ItemControlException {

          ItemControl instance = new ItemControl();
          Scanner diameter = new Scanner(System.in);
           
           System.out.println("Please enter the number of items: ");
          double itemQty = diameter.nextDouble();
          
           System.out.println("Please enter the cost for one item: ");
          double itemCost = diameter.nextDouble();
          
          double result = instance.getItemCost(itemQty, itemCost);
          
          System.out.println("\n The cost for these itesms is: " + result );
     }
}
