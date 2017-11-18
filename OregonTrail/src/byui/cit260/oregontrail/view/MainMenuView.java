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
	    + "\nV - View Map"
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
    

    private void startNewGame() {
        // create a new game
        int returnValue = GameControl.createNewGame(OregonTrail.getPlayer());
        if (returnValue < 0) {
            System.out.println("ERROR - Failed to create new game");
        }

        // display the game menu
        GamePlayMenu gameMenu = new GamePlayMenu();
        gameMenu.display();
	System.out.println("New Game has been created");
	
    }
    

}
