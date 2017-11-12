/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

/**
 *
 * @author Casey
 */
import java.io.Serializable;
import java.util.Objects;
import byui.cit260.oregontrail.model.Locations;
import static java.lang.Character.toUpperCase;
import java.util.Scanner;
import byui.cit260.oregontrail.view.MainMenuView;
import byui.cit260.oregontrail.view.HelpMenu;
import byui.cit260.oregontrail.model.DailyTrailStop;

public abstract class TrailView extends View {
    int miles;
    int milestogo;
    String date;
    
    public TrailView () {
        super("\n******************************************************"
            + "\n*                                                    *"
            + "\n the date is" 
            + "\n You have traveled" +  "and you have" +  "to Go" 
            + "\n******************************************************"
            + "\nWhat Do you want to do?"
            + "\n C - Continue on the Trail"
            + "\n U - Go Hunting"
            + "\n G - Go Gather Food"
            + "\n S - See Supplies"
            + "\n R - Rest"
            + "\n H - Help"
            + "\n X - Exit Game");
    }
     @Override
    public boolean doAction(String choice) {
        switch (choice) {
            case "C":
                break;
            case "U":
                //this.HuntingView();
                break;
            case "G":
                //this.GatheringView();
                break;
            case "S":
                break;
            case "R":
                break;
            case "H":
                this.displayHelpMenuView();
                break;
            case "X":
                this.quitGame();
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;

        }
        return false;
        
    }

            private void displayHelpMenuView() {
            HelpMenu Help = new HelpMenu();
            Help.display();
        }
            
        private void displayHuntingView() {
            //HuntingView Hunting = new HuntingView();
            //Hunting.display();
        }
        
    void quitGame() {
        return;
    }

    }

