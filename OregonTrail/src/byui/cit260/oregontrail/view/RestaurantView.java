///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.RestaurantControl;
import byui.cit260.oregontrail.exceptions.ItemControlException;
import byui.cit260.oregontrail.exceptions.RestaurantControlException;

import java.util.Random;
import java.util.Scanner;
import java.lang.String;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RestaurantView extends View {

     public RestaurantView() {
          super("\n"
                  + "\n-----------------------------------------"
                  + "\n| Food Menu                             |"
                  + "\n-----------------------------------------"
                  + "\nS - Steak and Potatoes"
                  + "\nH - Hamburger and French Fries"
                  + "\nC - Chili and Cornbread"
                  + "\nP - Pizza and Salad"
                  + "\nB - Get Bill"
                  + "\nQ - Return"
                  + "\n-----------------------------------------"
          );
     }

     @Override
     public boolean doAction(String choice) {

          

          System.out.println("\n Do not enter a number, enter a word");

          choice = choice.toUpperCase();
          switch (choice) {

              
               case "STEAK":
                    this.getSteak();
                    break;
               case "HAMBURGER":
                    this.getBurger();
                    break;
               case "CHILI":
                    this.getChili();
                    break;
               case "PIZZA":
                    this.getPizza();
                    break;
               case "B":
          {
               try {
                    this.getBill();
               } catch (RestaurantControlException ex) {
                    Logger.getLogger(RestaurantView.class.getName()).log(Level.SEVERE, null, ex);
               } catch (ItemControlException ex) {
                    Logger.getLogger(RestaurantView.class.getName()).log(Level.SEVERE, null, ex);
               }
          }
                    break;
               case "Q":
                    this.quitMenu();
                    break;
               default:
                    System.out.println("\n*** Invalid selection *** Try again");
                    break;
          }

          return false;

     }

     private void getSteak() {
          System.out.println("*** Steak and Pototoes ***");
          Scanner keyInput = new Scanner(System.in);
          String result = "Steak";
          System.out.println("Do you want yours cooked well down, medium rare or rare?");
          String steak = this.getInput();
     }

     private void getBurger() {

          String result = "Burger";
          System.out.println("Do you want yours cooked well down, medium rare or rare?");
     }

     private void getChili() {
          System.out.println("*** Chili and Cornbread ***");
         
               String result = "Chili";
               System.out.println("Do you want yours Hot, Medium or Mild?");
     }

     private void getPizza() {
          System.out.println("*** Pizza and Salad ***");
         
               String result = "Pizza";
               System.out.println("Do you want Cheese, Pepperoni or Sausage?");
     }       

     private void quitMenu() {
          System.out.println("*** Return To Previous Scene ***");
     }

     private void getBill() throws RestaurantControlException, ItemControlException {
          double[] costs = new double[10];

          RestaurantControl menucost = new RestaurantControl();
          int i;
          Random rand = new Random();
          double[] lists = new double[10];
          int n;
          for (i = 0; i < 10; i++) {
               n = rand.nextInt(50) + 1;
               lists[i] = n;
          }
          double total;
          total = menucost.getMealPrice(lists);
          
         

          System.out.println("The total bill is" + total);
     }

}
