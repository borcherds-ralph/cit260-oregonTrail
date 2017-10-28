/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;
import byui.cit260.oregontrail.view.HelpMenu;
import byui.cit260.oregontrail.view.StartMenu;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainMenuView {

    void displayMainMenuView() {
        throw new UnsupportedOperationExcetpion("Not Supported yet.");
        void displayMainMenuView
        
        
        
            () {
System.out.println("\n*** displayMenu() function called ***");
        }


    

    

    private void displayNextView(Player player) {

//display a custom welcome message
        System.out.println("\n ==============================================="
                + "n\ Welcome to Oregon or Bust " + player.getName()
                + "\n We hope you have a lot of fun!"
		+ "\n================================================"
				 );
				 
				 //Create MainMenuView object
				 MainMenuView mainMenuView = new MainMenuView();

        //Display the main menu view
        mainMenuView.displayMainMenuView();
    }

    public class MainMenuView {

        private String menu;

        public MainMenuView() {
            this.menu
                    = "\n***"
                    + "\n---------------------------------------------------"
                    + "\n| Main Menu                                       |"
                    + "\n---------------------------------------------------"
                    + "\nN - Start new game"
                    + "\nG - Get and start saved game"
                    + "\nH - Get help on how to play the game"
                    + "\nS - Save game"
                    + "\nQ - Quit"
                    + "\n--------------------------------------------------"
       

            public void displayMainMenuView() {
                System.out.println("\n*** displayMainMenuView() function called ***");
            }
            public


            void displayMainMenuView() {
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
                System.out.println("\n*** doAction() function called ***)");
                return true;
            }


            public boolean doAction(String choice)[]
	choice = choice.toUpperCase(); 
            switch (choice) {
				 case "N": this.startNewGame();
				 break;
				 case"G": this.startExistingGame();
				 break;
				 case "H": this.displayHelpMenu();
				 break;
			         case "S": this.saveGame();
				 break;
                                 case "Q": this.quitGame();
				 default:System.out.println("\n*** Invalid selection *** Try again");
			         break;
					 }
        return false;
	}
	 private void startNewGame() {
            System.out.println("*** startNewGame ");
        }

        private void startExistingGame() {
            Systemlout.println("*** startExistingGame function called ***");
        }

        private void saveGame() {
            System.out.println("*** startExistingGame or startSaveGame function called ***");
        }

        private void displayHelpMenu() {
            System.out.println("*** displayHelpMenu function called ***")
        }

        private void startNewGame() {
            GameControl.createNewGame(CuriousWorkmanship.getPlayer());
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.displayMenu();
        }
        private void quitGame() {
            System.out.println("***Quit Game ***");

}}