/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;
import byui.cit260.oregontrail.view.MainMenuView;
import byui.cit260.oregontrail.view.StartProgramView;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Br33h3rr3ra
 */
public class HelpMenu implements Serializable {
    
    public void HelpMenu() {
    
    }
    String filename = "tips.txt";
    String line = null;
    private char choice;
    private String tips;
    private String returnPrevious;

    private final String HelpMenu;

    public HelpMenu() {
        this.HelpMenu
                = "\n********************************************************"
                + "\n*                                                      *"
                + "\n***********************HELP MENU************************"
                + "\n*                      'T' for Tips                    *"
                + "\n*                      'X' to Exit                     *"
                + "\n*     The goal of the game is to make it to Oregon     *"
                + "\n*                                                      *"
                + "\n*                                                      *"
                + "\n*                                                      *"
                + "\n*                                                      *"
                + "\n*                                                      *";
        
        
    }

     public void displayHelpMenuView() {
       boolean valid = false;
       do {
           char menuOption = getChoice();
           if (menuOption == 'X' ) {
               return;
           }
       } while (!valid);
   }
     
    public char getChoice() {
        boolean valid = false;
        while (!valid) {
            System.out.print(this.HelpMenu);
        Scanner reader = new Scanner(System.in);
        choice = reader.next().charAt(0);

        if (choice != 'X' && choice != 'T') {
            System.out.print("\nInvalid Entry");
        continue;
        }
        if (choice == 'X' || choice == 'T') {
            valid = true;
        }
        if (choice == 'X') {
             getReturnPrevious();
         }
        if (choice == 'T') {
            getTips();
            valid = false;
        }
    }
         return choice;
         

    }

    public void getTips() {
        try {
            FileReader fileReader = new FileReader(filename);
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                filename + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + filename + "'");  
    }
    }
        
    public void setTips(String tips) {
        this.tips = tips;
    }

    public String getReturnPrevious() {
        MainMenuView mainMenuView = new MainMenuView();

        mainMenuView.displayMainMenuView();
        return returnPrevious;

    }

    public void setReturnPrevious(String returnPrevious) {
        this.returnPrevious = returnPrevious;
    }
}
 