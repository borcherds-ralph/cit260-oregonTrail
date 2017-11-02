/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.model.Player;
import java.util.Scanner;

public class MainMenuView {

    private String displayMessage = "\n"
            + "\n-----------------------------------------"
            + "\n| Main Menu                             |"
            + "\n-----------------------------------------"
            + "\nN - Start new game"
            + "\nG - Get and start saved game"
            + "\nH - Get help on how to play the game"
            + "\nR - River Crossing View"
            + "\nS - Save game"
            + "\nQ - Quit"
            + "\n"
            + "\n-----------------------------------------";

    public MainMenuView() {
        
    }

    public String getInput() {

        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String value = null;
        Player player = null;
        
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
            case "N":
                this.startNewGame();
                break;
            case "G":
                this.startExistingGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "R":
                this.displayRiverCrossing();
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
        HelpMenu helpmenu = new HelpMenu();
        helpmenu.getChoice();
    }

    private void displayRiverCrossing() {
        RiverCrossingView rivercrossing = new RiverCrossingView();
        rivercrossing.displayRiverCrossingView();
    }

    void quitGame() {
        System.out.println("\n*** Invalid selection *** Try again");
    }

    private void startNewGame() {

        System.out.println("\n*** Invalid selection *** Try again");
    }
}
