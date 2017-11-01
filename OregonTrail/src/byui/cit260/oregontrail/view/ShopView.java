/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.model.Supplies;
import byui.cit260.oregontrail.model.Shops;
import byui.cit260.oregontrail.model.Item;
import byui.cit260.oregontrail.model.ItemList;
import static java.lang.Character.toUpperCase;
import java.util.Scanner;
import byui.cit260.oregontrail.view.MainMenuView;
import byui.cit260.oregontrail.view.StartProgramView;
/**
 *
 * @author Casey
 */
public class ShopView {
    private char choice;
    private int quantity;
    private String item;
    
    String displayMenu 
                = "\n********************************************************"
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
            + "\n";

    
    String quantityMenu
                = "\n********************************************************"
                + "\n                        Quantity?                       "
                + "\n********************************************************"
            + "\n";
    
    String purchasedmessage
                = "/n You purchased" + quantity + item;
    
public ShopView() {
    getChoice();
}


public void getChoice() {
        boolean valid = false;
        while (!valid) {
        System.out.print(displayMenu);
        Scanner reader = new Scanner(System.in);
        choice = toUpperCase(reader.next().charAt(0));

        if (choice != 'F' && choice != 'X') {
            System.out.print("\nInvalid Entry");
        continue;
        }
        if (choice == 'X' || choice == 'F') {
            valid = true;
        }
        if (choice == 'X') {
             getReturnPrevious();
         }
        if (choice == 'F') {
            getTips();
            valid = false;
        }
    }
}
}

