/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

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

        System.out.println();
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
