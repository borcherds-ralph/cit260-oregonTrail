/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.ItemControl;
import byui.cit260.oregontrail.exceptions.ItemControlException;
import java.io.BufferedReader;
import java.io.PrintWriter;


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
          try {
               int numChoice = 0;

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
               
          } catch (ItemControlException ex) {

               System.out.println("\n ******************************************************");
               System.out.println("\n " + ex);
               System.out.println("\n ******************************************************");

          }
          return false;
     }

     private void calcVolumeBarrel(PrintWriter out) throws ItemControlException {

          ItemControl instance = new ItemControl();

          this.console.println("Please enter the top diameter of the barrel:");
          double topDiameter = this.keyInput.readDouble();
        

          this.console.println("Please enter the center diameter of the barrel:");
          double centerDiameter = this.keyInput.readInt();

          this.console.println("Please enter the height of the barrel:");
          double barrelHeight = keyInput.nextInt();
          
          try {
             double result = instance.calcVolumeOfBarrel(barrelHeight, centerDiameter, topDiameter); 
             this.console.println("The total volume of the barrel is: " + result + " cubic inches."
                  + "\n Please run #3 - Gallons from Barrel Volume to get the number of gallons. ");
          } catch (ItemControlException ex) {

               System.out.println("\n ******************************************************");
               System.out.println("\n " + ex);
               System.out.println("\n ******************************************************");

          }
          

          

     }

     private void calcWeight(PrintWriter out) throws ItemControlException {

          ItemControl instance = new ItemControl();
         
          
          
          this.console.println("Please enter the qty: ");
          double qty = this.dimensions.readDouble();
          
          this.console.println("\nPlease enter the weight of 1 item");
          double weight = this.dimensions.readDouble();
          
          try {
               double result = instance.calcWeightOfItem(qty, weight);
               this.console.println("The total weight is: " + result + " for."
                  + "\n" + qty + " Items, each weighing: " + weight);
          } catch (ItemControlException ex) {

               System.out.println("\n ******************************************************");
               System.out.println("\n " + ex);
               System.out.println("\n ******************************************************");

          }
          

     }

     private void calcGallons(PrintWriter out) throws ItemControlException {

          ItemControl instance = new ItemControl();
          
           
           this.console.println("Please enter the Cubic inces volume: ");
          double volume = this.quantity.readDouble();
          
          try {
               double result = instance.calcBarrelVolumeToGallons(volume);
               this.console.println("The total number of gallons for your barrel is: " + result);
          }
          catch (ItemControlException ex) {

               System.out.println("\n ******************************************************");
               System.out.println("\n " + ex);
               System.out.println("\n ******************************************************");

          }
     }

     private void calcCylinder(PrintWriter out) throws ItemControlException {

          ItemControl instance = new ItemControl();
          
                    
           this.console.println("Please enter the diameter of the cylendar: ");
          double cylDiameter = this.diameter.readDouble();
          
           this.console.println("Please enter the height of the cylendar: ");
          double cylHeight = this.diameter.readDouble();
          
          try {
               double result = instance.calcCylinderVolume(cylDiameter, cylHeight);
               this.console.println("\n The volume of the cylendar is: " + result );
          } catch (ItemControlException ex) {
 
               System.out.println("\n ******************************************************");
               System.out.println("\n " + ex);
               System.out.println("\n ******************************************************");

          }
     }

     private void calcCost(PrintWriter out) throws ItemControlException {

          ItemControl instance = new ItemControl();
                     
           this.console.println("Please enter the number of items: ");
          double itemQty = this.diameter.readDouble();
          
           this.console.println("Please enter the cost for one item: ");
          double itemCost = this.diameter.readDouble();
          try {
               double result = instance.getItemCost(itemQty, itemCost);
               this.console.println("\n The cost for these itesms is: " + result );
          } catch (ItemControlException ex) {

               System.out.println("\n ******************************************************");
               System.out.println("\n " + ex);
               System.out.println("\n ******************************************************");

          }
     }
}
