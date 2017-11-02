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

public class RestauranteView {

       private String displayMessage = "\n"
            + "\n-----------------------------------------"
            + "\n| Main Menu                             |"
            + "\n-----------------------------------------"
            + "\nF - Order Food"
            + "\nR - Return to previous scene"
            + "\nQ - Quit game"
            + "\n-----------------------------------------";

    public RestauranteView() {
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
           case "F":
               this.getMeal();
               break;
           case "R":
               this.returnToPrevious();
               break;
           case "Q":
               this.quitGame();
               break;
           default:
               System.out.println("\n*** Invalid selection *** Try again");
               break;
       }

       return false;
   }

   private void getMeal() {
       System.out.println("*** Order Food Here ***");
   }

   private void returnToPrevious() {
       System.out.println("*** Return To Previous Scene ***");
   }

   private void quitGame() {
       System.out.println("Are you sure you want to quit the game ***");
   }
  
   }
