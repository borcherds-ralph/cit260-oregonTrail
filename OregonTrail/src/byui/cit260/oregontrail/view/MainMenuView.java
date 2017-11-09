/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import java.util.Scanner;

public class MainMenuView extends View {

     private String menu;

    public MainMenuView() {
         super("\n"
            + "\n-----------------------------------------"
            + "\n| Main Menu                             |"
            + "\n-----------------------------------------"
            + "\nN - Start new game"
            + "\nG - Get and start saved game"
            + "\nH - Get help on how to play the game"
            + "\nR - River Crossing View"
            + "\nT - Hotel View"
            + "\nS - Save game"
            + "\nQ - Quit"
            + "\n"
            + "\n-----------------------------------------");
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
    
    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase();
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
            case "T":
                this.displayHotelView();
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
    
     private void displayHotelView() {
        HotelView hotel = new HotelView();
        hotel.displayHotelMenuView();
    }

    void quitGame() {
        return;
    }

    private void startNewGame() {
        System.out.println("\n*** Invalid selection *** Try again");
    }

}
