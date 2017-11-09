/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import static java.lang.Character.toUpperCase;
import java.util.Scanner;

/**
 *
 * @author Br33h3rr3ra
 *
 */
public class GamePlayMenu extends View {

    private String menuList;
    private char choice;
    String currentlocation;

    public GamePlayMenu() {
        super("\n******************************************************"
                + "\n                                                      "
                + "\n You are now in"
                + "\n What do you do next?"
                + "\n S - Go to store"
                + "\n T - Go to hotel"
                + "\n U - See Supplies"
                + "\n R - Rest"
                + "\n H - Help"
                + "\n X - Exit Game"
                + "\n "
                + "\n "
                + "\n "
                + "\n                                                      "
                + "\n******************************************************"
        );
    }

    public void setMenuList(String menuList) {
        this.menuList = menuList;
    }

    public String getMenuList() {
        return menuList;
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase();
        switch (choice) {
            case "S":
                break;
            case "T":
                this.displayHotelView();
                break;
            case "U":
                break;
            case "R":
                break;
            case "H":
                break;
            case "X":
                this.quitGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        } 
        return false;
    }
     private void displayHotelView() {
        HotelView hotel = new HotelView();
        hotel.display();
    }

    void quitGame() {
        return;
    }
}
