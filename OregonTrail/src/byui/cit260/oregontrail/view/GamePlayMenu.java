/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;
import java.io.Serializable;
import java.util.Objects;
import byui.cit260.oregontrail.model.Locations;
/**
 *
 * @author Br33h3rr3ra
 * */
public class GamePlayMenu implements Serializable {
    private String menuList;

public GamePlayMenu() {
    
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
                + "\n You are now in" + this.currentlocation
                + "\n What do you do next?"
                + "\n S - Go to store"
                + "\n H - Go to hotel"
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
}