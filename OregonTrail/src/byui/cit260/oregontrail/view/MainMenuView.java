/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.exceptions.GamePlayMenuException;
import byui.cit260.oregontrail.exceptions.MainMenuException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
                         this.console.println("\n*** Invalid selection *** Try again");
                         break;
               }
               
               
          } catch (MainMenuException ex) {
               Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
          } catch (GamePlayMenuException ex) {
               Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
          }
          return false;
    }

    private void startExistingGame() {
        this.console.println("*** startExistingGame function called ***");
    }

    private void saveGame() {
        this.console.println("*** startExistingGame or startSaveGame function called ***");
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
                  Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        ErrorView.display(this.getClass().getName(), "Error reading input" + ex.getMessage());     
        }
        }
       
	
    }    


