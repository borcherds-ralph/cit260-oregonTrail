/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import java.util.Scanner;

/**
 *
 * @author ralphb
 */
public class RiverCrossingView  {
    
    public String getInput(String displayMessage) {

        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String value = null;

        // while a valid name has not been retrieved
        while (!valid) {

            // display the prompt message
            System.out.println("\n" + displayMessage);

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

   public void displayRiverCrossingView() {
       boolean done = false;
       String displayMessgae = "\n"
            + "\n-----------------------------------------"
            + "\n| River Crossing                         |"
            + "\n-----------------------------------------"
            + "\nW - Wade across river"
            + "\nG - Get details about river"
            + "\nF - Use a Ferry to cross the river"
            + "\nH - Display Help Menu"
            + "\nS - Save game"
            + "\nQ - Quit"
            + "\n-----------------------------------------";
       do {
           String menuOption = this.getInput(displayMessgae);
           if (menuOption.toUpperCase().equals("Q")) {
               return;
           }
           done = this.doAction(menuOption);
       } while (!done);
   }

   

   private boolean doAction(String menuOption) {

       String choice = menuOption.toUpperCase();
       switch (choice) {
           case "W":
               this.wadeAcrossRiver();
               break;
           case "G":
               this.getRiverDetails();
               break;
           case "F":
               this.ferryAccrossRiver();
               break;
           case "H":
               this.displayHelpMenu();
               break;
           case "S":
               this.saveGame();
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

   private void wadeAcrossRiver() {
       System.out.println("*** startExistingGame function called ***");
   }

   private void saveGame() {
       System.out.println("*** startExistingGame or startSaveGame function called ***");
   }
   private void getRiverDetails() {
       System.out.println("*** Get River Details function called ***");
   }
   private void ferryAccrossRiver() {
       FerryCrossingView ferry = new FerryCrossingView();
       ferry.displayFerryCrossingView();
       
   }

   private void displayHelpMenu() {
       HelpMenu helpmenu = new HelpMenu();
       helpmenu.getChoice();
   }
   

   void quitGame() {
       System.out.println("\n*** Invalid selection *** Try again");
   }
    
}
