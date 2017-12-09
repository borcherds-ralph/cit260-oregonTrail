/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.ItemControl;
import byui.cit260.oregontrail.enums.ItemList;
import byui.cit260.oregontrail.exceptions.ItemControlException;
import java.io.IOException;
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
                  + "\n 6 - Print recommeded list of supplies"
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
                    this.console.println("\n You must enter a valid number choice."
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
                    case 6:
                         this.outputRecommSupplies();
                         break;
                    default:
                         this.console.println("\n*** Invalid selection *** Try again");
                         break;
               }
               
          } catch (ItemControlException | IOException ex ) {

              ErrorView.display(this.getClass().getName(), "Error reading input" + ex.getMessage());


          }
          return false;
     }

     private void calcVolumeBarrel() throws ItemControlException, IOException {

          ItemControl instance = new ItemControl();
         
          double barrelHeight;
          double centerDiameter;
          double topDiameter;
          boolean valid = false;
          
          try {
               
               do {
                     this.console.println("Please enter the top diameter of the barrel:");
               String topDiameterString = this.keyboard.readLine();
               
              
                    topDiameter = Double.parseDouble(topDiameterString); 
                    if (topDiameter <= 0 || topDiameter > 30) { // Top or Bottom diameter is out of range
                         this.console.println("\nYou cannot have a top diameter less than 1 or greater than 30 inches");
                    } else valid = true;
               } while (!valid);
               
               valid = false;
               
               do {
                    this.console.println("Please enter the center diameter of the barrel:");
                    String centerDiameterString = this.keyboard.readLine();
               
                    centerDiameter = Double.parseDouble(centerDiameterString);
                    if (centerDiameter <= 0 || centerDiameter > 36) { // Center diameter is out of range
                         this.console.println("\nYou cannot have a center diameter less than"
                          + "\n the top diameter or greater than 36 inches");
                    } else valid = true;
               } while (!true);
               
               valid = false;
               
               do {
                    this.console.println("Please enter the height of the barrel:");
                    String barrelHeightString = this.keyboard.readLine();
              
                    barrelHeight = Double.parseDouble(barrelHeightString);
                    if (barrelHeight < 1 || barrelHeight >= 35) { // height is out of range
                         this.console.println("\nYou cannot have a height less than 1 or higher than 35 inches");
                    }  else valid = true;
               } while (!true);
               
             double result = instance.calcVolumeOfBarrel(barrelHeight, centerDiameter, topDiameter); 
             this.console.println("\nThe total volume of the barrel is: " + result + " cubic inches."
                  + "\n Please run #3 - Gallons from Barrel Volume to get the number of gallons. ");
          

          } catch (ItemControlException ex) {

              ErrorView.display(this.getClass().getName(), "Error reading input" + ex.getMessage());

          } catch (NumberFormatException nx) {
               this.console.println("\n You have enter an invalid number. Try Again");
          }
          

          

     }

     private void calcWeight() throws ItemControlException, IOException {

          ItemControl instance = new ItemControl();
          double qty;
          double weight;
                  
          try {
               do {
                    this.console.println("Please enter the qty: ");
                    String qtyString = this.keyboard.readLine();
                    qty = Double.parseDouble(qtyString);
               } while (!true);
               
               do {
                    this.console.println("\nPlease enter the weight of 1 item");
                    String weightString = this.keyboard.readLine();
                    weight = Double.parseDouble(weightString);
               } while (!true);
               
         
               double result = instance.calcWeightOfItem(qty, weight);
               this.console.println("The total weight is: " + result + " for."
                  + "\n" + qty + " Items, each weighing: " + weight);
          } catch (ItemControlException ex) {

              ErrorView.display(this.getClass().getName(), "Error reading input" + ex.getMessage());

          } catch (NumberFormatException nx) {
               this.console.println("\n You have enter an invalid number. Try Again");
          }
          

     }

     private void calcGallons() throws ItemControlException, IOException {

          ItemControl instance = new ItemControl();
          double volume;
          
          try { 
               do {
                    this.console.println("Please enter the Cubic inces volume: ");
                    String volumeString = this.keyboard.readLine();
                    volume = Double.parseDouble(volumeString);
               } while (!true);
               
          
        
               double result = instance.calcBarrelVolumeToGallons(volume);
               this.console.println("The total number of gallons for your barrel is: " + result);
          }
          catch (ItemControlException ex) {

              ErrorView.display(this.getClass().getName(), "Error reading input" + ex.getMessage());

          } catch (NumberFormatException nx) {
               this.console.println("\n You have enter an invalid number. Try Again");
          }
     }

     private void calcCylinder() throws ItemControlException, IOException {

          ItemControl instance = new ItemControl();
          
          double cylHeight;
          double cylDiameter;
                  
          try {     
               do {
                    this.console.println("Please enter the diameter of the cylendar: ");
                    String cylDiameterString = this.keyboard.readLine();
                    cylDiameter = Double.parseDouble(cylDiameterString);

               } while (!true);
               
               do {
                   this.console.println("Please enter the height of the cylendar: ");
                    String cylHeightString = this.keyboard.readLine();
                    cylHeight = Double.parseDouble(cylHeightString); 
               } while (!true);
               
          
          
               double result = instance.calcCylinderVolume(cylDiameter, cylHeight);
               this.console.println("\n The volume of the cylendar is: " + result );
               
          } catch (ItemControlException ex) {
 
              ErrorView.display(this.getClass().getName(), "Error reading input" + ex.getMessage());

          }
     }

     private void calcCost() throws ItemControlException, IOException {

          ItemControl instance = new ItemControl();
          double itemQty;
          double itemCost;
            
          try {  
               do {
                    this.console.println("Please enter the number of items: ");
                    String itemQtyString;

                    itemQtyString = this.keyboard.readLine();
                    itemQty = Double.parseDouble(itemQtyString);
               } while (!true);
               

               do {
                    this.console.println("Please enter the cost for one item: ");
                    String itemCostString;
                    itemCostString = this.keyboard.readLine();
                    itemCost = Double.parseDouble(itemCostString);
               } while (!true);
               

               double result = instance.getItemCost(itemQty, itemCost);
               this.console.println("\n The cost for these itesms is: " + result );
          } catch (ItemControlException ex) {

              ErrorView.display(this.getClass().getName(), "Error reading input" + ex.getMessage());

          }
     }
     
     public void outputRecommSupplies() throws ItemControlException {
         ItemControl recomSupplies = new ItemControl();
         
         // Get where to write the file
          this.console.println("\n\nEnter the file path for the file where the game is to be saved.");
          String filePath = this.getInput();
          
                
          try (PrintWriter out = new PrintWriter(filePath)) { 
               
               out.println("\n\n                                         List of recommended items");
               out.printf("%n%-35s%10s%10s", "Item Description", "Recommended Qty", "Weight");
               out.printf("%n%-35s%10s%10s", "----------------", "---------------", "------");

               for (ItemList itemList : ItemList.values()) {
                    out.printf("%n%-35s%10s%13.3f",itemList.getItemName(),
                            itemList.getQty(),
                            itemList.getWeight());
               }
               
               this.console.println("File created successfully");
          } catch (IOException ex) {
               ErrorView.display(this.getClass().getName(), "Error creating file: " + ex.getMessage());
          }
         
          
         
    }
}
