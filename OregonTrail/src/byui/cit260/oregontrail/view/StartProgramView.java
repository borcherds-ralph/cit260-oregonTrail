/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.PersonControl;
import byui.cit260.oregontrail.model.Player;
import java.util.Scanner;

/**
 *
 * @author ralphb
 */
public class StartProgramView {

    private final String promptMessage;

    public StartProgramView() {

        this.promptMessage = "\nPlease enter your name: ";
        this.displayBanner();
    }

    public void displayBanner() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                      *"
                + "\n* This is the game of                                  *"
        );

    }

    public void displayStartProgramView() {
        System.out.println("\n*** displayStartProgram() function called ***");

        boolean done = false;

        do {
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) {
                return;
            }

            done = this.doAction(playersName);

        } while (!done);

    }

    private String getPlayersName() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;

        while (!valid) {
            System.out.println("\n" + this.promptMessage);
            value = keyboard.nextLine();
            value = value.trim();

            if (value.length() < 1) {
                System.out.println("\nInvalid value: vlaue cannot be blank");
                continue;
            }

            break;
        }
        return value;
    }

    private boolean doAction(String playersName) {

        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name: "
                    + "The name must be greater than one character in length");
            return false;
        }
        Player player = PersonControl.createPlayer(playersName);

        if (player == null) {
            System.out.println("\nError creating the player.");
            return false;
        }

        this.displaNextView(player);

        return true;
    }

    private void displaNextView(Player player) {
        System.out.println("*** displayNextView() called ***");

    }

}

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
                + "\n We hope you have a lot of fun!
				 + "\n================================================"
				 );
				 
				 //Create MainMenuView object
				 MainMenuView mainMenuView = new MainMenuView();

        //Display the main menu view
        mainMenuView.displayMainMenuView();
    }

    public class MainMenuView {

        private String menu;

        Public MainMenuView() {
            this.menu = 

        "\n***
				             +"\n---------------------------------------------------"
							 +"\n| Main Menu                                       |"
							 +"\n---------------------------------------------------"
							 +"\nN - Start new game"
							 +"\nG - Get and start saved game"
							 +"\nH - Get help on how to play the game"
							 +"\nS - Save game"
							 +"\nQ - Quit"
							 +"\n--------------------------------------------------"
							 
				public class MainMenuView {

            public void displayMainMenuView() {
                System.out.println("\n*** displayMainMenuView() function called ***");
            }
            publi

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
            // getInput(): value
            // BEGIN
            // WHILE 
            // Display
            // Get
            // IF
            // ENDIF
            // Break
            // endwhile
            // return value 
            // End//

            public boolean doAction (String choice)
            [
					 choice = choice.toUpperCase();
            switch (choice

            
            
            ) {
					 case "N"
					 this.startNewGame();
					 break;
					 case"G":
					 this.startExistingGame();
					 break;
					 case "H":
					 this.displayHelpMenu();
					 break;
					 case "S":
					 this.saveGame();
					 break;
					 default:
					 System.out.println("\n*** Invalid selection *** Try again");
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

        public class GameMenuView {

            void displayMenu() {
                System.out.println("\n*** displayMenu sub function called ***");
            }
        }
    }
}
