/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.exceptions.GamePlayMenuException;
import byui.cit260.oregontrail.exceptions.MainMenuException;
import oregontrail.OregonTrail;
/**
 *
 * @author ralphb
 */

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

          try {
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
                         ErrorView.display("MainMenuView", "*** Invalid selection *** Try Again ***");
                         break;
               }
               
               
          } catch (MainMenuException ex) {
                ErrorView.display(this.getClass().getName(), "Error reading input" + ex.getMessage());
          } catch (GamePlayMenuException ex) {
                ErrorView.display(this.getClass().getName(), "Error reading input" + ex.getMessage());
          }
          return false;
    }

    private void startExistingGame() {
        this.console.println("\n\nEnter the file path fro the filew where the ga is saved.");
        
        String filePath = this.getInput();
        
        try {
             GameControl.getSavedGame(filePath);
             
        } catch (Exception ex) {
              ErrorView.display(this.getClass().getName(), "Error reading input" + ex.getMessage());
        }
    }

    private void saveGame() {
        this.console.println("\n\nEnter the file path for the file where the game " 
        + "is to be saved.");
        String filePath = this.getInput();
        
        try {
             GameControl.saveGame(OregonTrail.getCurrentGame(), filePath);
             
        } catch (Exception ex) {
             ErrorView.display(this.getClass().getName(), "Error reading input" + ex.getMessage());
        }
    }

    private void displayHelpMenu() {
        HelpMenu helpmenu = new HelpMenu();
        helpmenu.display();
    }
    

    private void startNewGame() throws MainMenuException, GamePlayMenuException {
        // create a new game
        int returnValue = GameControl.createNewGame(OregonTrail.getPlayer());
        if (returnValue < 0) {
            this.console.println("ERROR - Failed to create new game");
        }

        try{ 
        // display the game menu
          GamePlayMenu gameMenu = new GamePlayMenu();
          gameMenu.display();
          this.console.println("New Game has been created");
        } catch (GamePlayMenuException ex) {
                   ErrorView.display(this.getClass().getName(), "Error reading input" + ex.getMessage());
             }
        }
       
	
    }    


