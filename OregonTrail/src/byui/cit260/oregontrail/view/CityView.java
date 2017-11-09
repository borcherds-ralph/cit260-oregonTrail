/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;
import java.io.Serializable;
import java.util.Objects;
import byui.cit260.oregontrail.model.Locations;
import static java.lang.Character.toUpperCase;
import java.util.Scanner;
import byui.cit260.oregontrail.view.MainMenuView;
/**
 *
 * @author Br33h3rr3ra
 * */
public abstract class CityView extends View {
    private String menu;
    private String menuList;
    private char choice;
    String currentlocation;
    
public CityView () {
    displayBanner();
    doAction();
}
    public void setMenuList(String menuList) {
        this.menuList = menuList;
    }

    public String getMenuList() {
        return menuList;
    }

        private void displayBanner() {

        System.out.println(
                "\n******************************************************"
                + "\n                                                      "
                + "\n You are now in" + currentlocation
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
    public char doAction() {
        boolean valid = false;
        while (!valid) {
        displayBanner();
        Scanner reader = new Scanner(System.in);
        choice = toUpperCase(reader.next().charAt(0));

        if (choice != 'S' && choice != 'T' && choice != 'U' && choice != 'R' && choice != 'H' && choice != 'X') {
            System.out.print("\nInvalid Entry");
        continue;
        }
        if (choice == 'X' || choice == 'T') {
            valid = true;
        }
        if (choice == 'X') {
            MainMenuView quitgame = new MainMenuView();
             quitgame.displayMainMenuView();
         }
        if (choice == 'T') {
        HotelView hotel = new HotelView();
        hotel.displayHotelMenuView();
            valid = true;
        }
    }
         return choice;

   }

    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

