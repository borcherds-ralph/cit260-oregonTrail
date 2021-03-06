/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.exceptions.SuppliesControlException;
import byui.cit260.oregontrail.model.Shops;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import oregontrail.OregonTrail;
 
public class ShopView extends View {

    private char choice;
    private int quantity;
    private String item;
    private int totalcost;
    public int choicecost;

    String quantityMenu
            = "\n********************************************************"
            + "\n                        Quantity?                       "
            + "\n********************************************************"
            + "\n";

    String purchasedmessage
            = "/n You purchased" + quantity + item;

    

    public ShopView() {
        super("\n********************************************************"
            + "\n*                 Welcome to the Shop!                 *"
            + "\n***********************SHOP MENU************************"
            + "\n*                   'F' for Supplies                   *"
            + "\n*                                                      *"
            + "\n*                       'X' to Exit                    *"
            + "\n*                                                      *"
            + "\n*                                                      *"
            + "\n*                                                      *"
            + "\n*                                                      *"
            + "\n*                                                      *"
            + "\n"
        );
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase();
        switch (choice) {
            case "F":
                this.costCalc();
                break;
            case "X":
                this.quitGame();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        } 
        return false;
    }    
     
    //lots of items need added to this portion. Supplies will cost 2 for now. Also need to test so that money on hand is not negative
    public int costCalc() {
        boolean valid = false;
        while (!valid) {
            this.console.print(quantityMenu);
            
            // choicecost = this.choicecost.readLine();
            if (100 >= choicecost && 1 <= choicecost);
            {
                totalcost = choicecost * 2;
                valid = true;
                this.console.print(purchasedmessage);
            }
            if (choicecost % 1 != 0) {
                this.console.print("\nInvalid Entry");
            }
        }
        return totalcost;
    }
    
    void quitGame() {
        return;
    }
}
