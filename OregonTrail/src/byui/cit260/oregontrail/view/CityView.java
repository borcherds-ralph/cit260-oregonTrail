/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;
import byui.cit260.oregontrail.enums.ItemList;
import byui.cit260.oregontrail.exceptions.SuppliesControlException;
import byui.cit260.oregontrail.model.Item;
import byui.cit260.oregontrail.model.InventoryItem;
import byui.cit260.oregontrail.model.Supplies;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import oregontrail.OregonTrail;

/**
 *
 * @author Br33h3rr3ra
 *
 */
public abstract class CityView extends View {

    private String menu;
    private String menuList;
    String currentlocation;

    public CityView() {
        super("\n******************************************************"
                + "\n                                                      "
                + "\n You are now in "
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
                + "\n******************************************************");
    }

    public void setMenuList(String menuList) {
        this.menuList = menuList;
    }

    public String getMenuList() {
        return menuList;
    }

    private void displayBanner() {

        this.console.println();
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
