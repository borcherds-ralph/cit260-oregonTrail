/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package byui.cit260.oregontrail.view;

import oregontrail.OregonTrail;
import byui.cit260.oregontrail.control.GameControl;

public class MainMenuView {

   public MainMenuView() {
   }

   public char getInputs(char menuOption) {
       

       System.out.println(
               "\n"
               + "\n-----------------------------------------"
               + "\n| Main Menu                             |"
               + "\n-----------------------------------------"
               + "\nN - Start new game"
               + "\nG - Get and start saved game"
               + "\nH - Get help on how to play the game"
               + "\nS - Save game"
               + "\nQ - Quit"
               + "\n-----------------------------------------"
       );

       inputs = this.getInputs(char);

       return menuOption;

   }

   public void displayMainMenuView() {
       boolean done = false;
       do {
           String menuOption = this.getMenuOption();
           if (menuOption.toUpperCase().equals("Q")) {
               return;
           }
           done = this.doAction(menuOption);
       } while (!done);
   }

   private String getMenuOption() {
       System.out.println("n*** getMenuOption() function called ***");
       return "N";
   }

   private boolean doAction(String menuOption) {

       String choice = menuOption.toUpperCase();
       switch (choice) {
           case "N":
               this.startNewGame();
               break;
           case "G":
               this.startExistingGame();
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

   private void startExistingGame() {
       System.out.println("*** startExistingGame function called ***");
   }

   private void saveGame() {
       System.out.println("*** startExistingGame or startSaveGame function called ***");
   }

   private void displayHelpMenu() {
       System.out.println("*** displayHelpMenu function called ***");
       HelpMenu HelpMenu = new HelpMenu();
       HelpMenu.HelpMenu();
   }

   private void quitGame() {
       System.out.println("\n*** Invalid selection *** Try again");
   }
   private void startNewGame() {
       
       System.out.println("\n*** Invalid selection *** Try again");   }}