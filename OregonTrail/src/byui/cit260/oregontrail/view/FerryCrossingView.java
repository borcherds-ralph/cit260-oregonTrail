/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import java.util.Scanner;

/**
 *
 * @author ralphb
 */
public class FerryCrossingView extends View {

    public FerryCrossingView() {
        super("\n"
                + "\n--------------------------------------------------"
                + "\n| Ferry Crossing                                 |"
                + "\n--------------------------------------------------"
                + "\n You are about to cross the river using a ferry."
                + "\n"
                + "\n"
                + "\n Please type \"continue\" to proceed."
                + "\n-------------------------------------------------");
    }

    public void displayFerryCrossingView() {
        boolean done = false;
        
        do {
            String menuOption = this.getInput();
            if (menuOption.toUpperCase().equals("Q")) {
                return;
            }

            done = this.doAction(menuOption);
        } while (!done);
    }

    public void displayCrossMenu() {
        boolean done = false;
        String displayMessgae = "\n"
                + "\n--------------------------------------------------"
                + "\n| River Crossed by Ferry                         |"
                + "\n--------------------------------------------------"
                + "\n Thank you for crossing the river using our ferry."
                + "\n By using the ferry you have lost one day of travel"
                + "\n and you are camping next to the river you just"
                + "\n crossed. Please type \"Q\" to go back to the."
                + "\n river crossing menu."
                + "\n-----------------------------------------";
        do {
            String menuOption = this.getInput();
            if (menuOption.toUpperCase().equals("Q")) {
                return;
            }

            done = this.doAction(menuOption);
        } while (!done);
    }

    public boolean doAction(String menuOption) {

        String choice = menuOption.toUpperCase();
        switch (choice) {
            case "CONTINUE":
                this.displayCrossMenu();
                break;
            case "Q":
                this.returnMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }

    void returnMenu() {
        return;
    }

}
