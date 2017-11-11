/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import java.util.Scanner;

public class HotelView extends View {

    public HotelView() {
        super("\n"
            + "\n-----------------------------------------"
            + "\n| Main Menu                             |"
            + "\n-----------------------------------------"
            + "\nD - Get a drink at the Bar"
            + "\nF - Get food to eat at the Restaurante"
            + "\nR - Get a room, Go to bed"
            + "\nA - Add a new team member"    
            + "\nB - Return back to last scene"
            + "\n-----------------------------------------"
        );
    }

    @Override
    public boolean doAction(String menuOption) {

       String choice = menuOption.toUpperCase();
       switch (choice) {
           case "D":
               this.goToBar();
               break;
           case "F":
               this.goToRestaurante();
               break;
           case "R":
               this.getARoom();
               break;
           case "A":
               this.addTeamMember();
               break;
           case "B":
               this.returnToPrevious();
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

    private void goToBar() {
        System.out.println("*** Go to Bar for a drink ***");
    }

    private void goToRestaurante() {
        System.out.println("*** Get Some Food at the Restaurante ***");
    }

    private void getARoom() {
        System.out.println("*** Get a hotel room and get some rest ***");
    }
    
    private void addTeamMember() {
        System.out.println("***Recruit a new Team member");
    }
    private void returnToPrevious() {    
        return;
    }
    private void quitGame() {
        System.out.println("Are you sure you want to quit the game ***");
    }

    }
