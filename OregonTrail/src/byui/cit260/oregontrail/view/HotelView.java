/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package byui.cit260.oregontrail.view;

import oregontrail.OregonTrail;
import byui.cit260.oregontrail.control.HotelControl;
import java.util.Scanner;

public class HotelView {

       private String displayMessage = "\n"
            + "\n-----------------------------------------"
            + "\n| Main Menu                             |"
            + "\n-----------------------------------------"
            + "\nD - Get a drink at the Bar"
            + "\nF - Get food to eat at the Restaurante"
            + "\nR - Get a room, Go to bed"
            + "\nB - Return back to last scene"
            + "\n-----------------------------------------";

    public HotelView() {
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

   public void displayHotelMenuView() {
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
           case "D":
               this.goToBar();
               break;
           case "F":
               this.goToRestaurante();
               break;
           case "R":
               this.getARoom();
               break;
           case "B":
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

   private void goToBar() {
       System.out.println("*** Go to Bar for a drink ***");
   }

   private void goToRestaurante() {
       System.out.println("*** Get Some Food at the Restaurante ***");
   }

   private void getARoom() {
       System.out.println("*** Get a hotel room and get some rest ***");
   }
   private void returnToPrevious() {
       
       System.out.println("This is where you were before ***");
   }
   private void quitGame() {
       System.out.println("Are you sure you want to quit the game ***");
   }
  
   }
