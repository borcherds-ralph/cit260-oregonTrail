/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.ItemControl;
import byui.cit260.oregontrail.control.MapControl;
import java.util.Random;

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
		+ "\n W - Get Total Weight of Supplies"
		+ "\n V - View Map"
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
		this.displaySupplies();
                break;
            case "R":
		System.out.println("\n*** This has not been implemented yet *** Try again");
                break;
            case "H":
		System.out.println("\n*** This has not been implemented yet *** Try again");
                break;
	    case "V":
		this.displayMap();
		break;
	    case "W":
		this.calcSupplyWeight();
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
    
    public void displayMap() {
        MapView map = new MapView();
	map.display();
        
    }  
    
    private void displaySupplies() {
        
    }
    
    private void calcSupplyWeight() {
	ItemControl weights = new ItemControl();
	int i;
	Random rand = new Random();
	int[] lists = new int[10];
	int n;
	for(i=0; i < 10; i++){
	    n = rand.nextInt(50) + 1;
	    lists[i] = n;
	}
	int total;
	total = weights.calcTotalSuppliesWeight(lists);
	
	System.out.println("The total weight for the 50 items is: " + total + " lbs" );
    }

    void quitGame() {
        return;
    }
    
    
}
