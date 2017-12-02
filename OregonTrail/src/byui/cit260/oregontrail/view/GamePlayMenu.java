/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.ItemControl;
import java.util.Random;

import byui.cit260.oregontrail.exceptions.GamePlayMenuException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Br33h3rr3ra
 *
 */
public class GamePlayMenu extends View {

    private String menuList;
    private char choice;
    String currentlocation;

    public GamePlayMenu() throws GamePlayMenuException {
        super("\n******************************************************"
                + "\n                                                      "
                + "\n You are now in"
                + "\n What do you do next?"
                + "\n S - Go to store"
                + "\n T - Go to hotel"
                + "\n U - See Supplies"
		+ "\n W - Get Total Weight of Supplies"
		+ "\n I - Calculate item dimensions"
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
    
     @Override
    public boolean doAction(String choice) {

         try {
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
                        this.console.println("\n*** This has not been implemented yet *** Try again");
                        break;
                   case "H":
                        this.console.println("\n*** This has not been implemented yet *** Try again");
                        break;
                   case "V":
                        this.displayMap();
                        break;
                   case "W":
                        this.calcSupplyWeight();
                        break;
                   case "I":
                        this.calcItemDimensions();
                   case "X":
                        this.quitGame();
                        break;
                   default:
                        this.console.println("\n*** Invalid selection *** Try again");
                        break;
              }
              return false;
         } catch (GamePlayMenuException ex) {
              this.console.println("\n Please make a valid selection");
         }
         return false;
    }

    public void setMenuList(String menuList) throws GamePlayMenuException {
         this.menuList = menuList;
    }

    public String getMenuList() throws GamePlayMenuException {
        return menuList;
    }

   
    
    private void displayHotelView() throws GamePlayMenuException {
        HotelView hotel = new HotelView();
        hotel.display();
    }
    
    public void displayMap() throws GamePlayMenuException {
        MapView map = new MapView();
	map.display();
        
    }  
    
    private void displaySupplies() throws GamePlayMenuException {
        
    }
    
    private void calcSupplyWeight() throws GamePlayMenuException {
	ItemControl weights = new ItemControl();
	int i;
	Random rand = new Random();
	int[] lists = new int[10];
	int n;
	for(i=0; i < 10; i++){
	    n = rand.nextInt(50) + 1;
	    lists[i] = n;
	    this.console.println(n);
	}
	int total;
	total = weights.calcTotalSuppliesWeight(lists);
	
	this.console.println("The total weight for the 50 items is: " + total + " lbs" );
    }
    
    public void calcItemDimensions() throws GamePlayMenuException{
        ItemView item = new ItemView();
	item.display();
        
    } 

    void quitGame() throws GamePlayMenuException {
        return;
    }
    
    
}
