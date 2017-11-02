/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package byui.cit260.oregontrail.view;

import oregontrail.OregonTrail;
import byui.cit260.oregontrail.control.RestauranteControl;
import byui.cit260.oregontrail.control.MenuItems;

import java.util.Scanner;

public class RestaurantView {

       private String displayMessage = "\n"
            + "\n-----------------------------------------"
            + "\n| Food Menu                             |"
            + "\n-----------------------------------------"
            + "\nS - Steak and Potatoes"
            + "\nH - Hamburger and French Fries"
            + "\nC - Chili and Cornbread"
            + "\nP - Pizza and Salad"
            + "\nQ - Leave Menu"
            + "\n-----------------------------------------";

    public RestaurantView() {
    }

   public String getInput() {

        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String value = null;

        // while a valid name has not been retrieved
        while (!valid) {

            // display the prompt message
            System.out.println("\n" + this.displayMessage);

            // get the value entered from the keyboard
            value = keyboard.nextLine();
            value = value.trim();

            if (value.length() < 1) { // blank value entered
                System.out.println("\n*** You must enter a value *** ");
                continue;
            }
            
            break;
        }

        return value; // return the name        
    }

   public void displayMainMenuView() {
       boolean done = false;
       do {
           String menuOption = this.getInput();
           if (menuOption.toUpperCase().equals("Q")) {
               return;
           }
           done = this.doAction(menuOption);
       } while (!done);
   }

   

   private boolean doAction(String menuOption) {

       String choice = menuOption.toUpperCase();
       switch (choice) {
           case "Steak":
               this.getSteak();
               break;
           case "Hamburger":
               this.getBurger();
               break;
           case "Chili":
               this.getChili();
               break;
           case "Pizza":
               this.getPizza();
               break;
           case "Quit":
               this.leaveFoodMenu();
               break;
           default:
               System.out.println("\n*** Invalid selection *** Try again");
               break;
       }

       return false;
   }

   private void getSteak() {
       System.out.println("*** Steak and Pototoes ***");
   }

   private void getBurger() {
       System.out.println("*** Hamburger and French Fries ***");
   }
   
   private void getChili() {
       System.out.println("*** Chili and Cornbread ***");
   }
   
   private void getPizza() {
       System.out.println("*** Pizza and Salad ***");
   }
   private void leaveFoodMenu() {
       System.out.println("*** Return To Previous Scene ***");
   }
 
   }
