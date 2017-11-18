/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.GameControl;
import oregontrail.OregonTrail;

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
            + "\nA - Trail View"
            + "\nS - Save game"
            + "\nQ - Quit"
            + "\n"
            + "\n-----------------------------------------");
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
            case "A":
                this.displayTrailView();
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

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void saveGame() {
        System.out.println("*** startExistingGame or startSaveGame function called ***");
    }

    private void displayHelpMenu() {
        HelpMenu helpmenu = new HelpMenu();
        helpmenu.display();
    }
    
    private void displayTrailView() {
        TrailView trailview = new TrailView() {};
        trailview.display();
    }

    private void displayRiverCrossing() {
        RiverCrossingView rivercrossing = new RiverCrossingView();
        rivercrossing.display();
    }
    
    private void displayHotelView() {
        HotelView hotel = new HotelView();
        hotel.display();
    }

    private void startNewGame() {
        // create a new game
        int returnValue = GameControl.createNewGame(OregonTrail.getPlayer());
        if (returnValue < 0) {
            System.out.println("ERROR - Failed to create new game");
        }

        // display the game menu
        GamePlayMenu gameMenu = new GamePlayMenu();
        gameMenu.display();
    
    }

}
