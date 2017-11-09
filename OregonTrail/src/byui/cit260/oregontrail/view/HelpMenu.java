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
import static java.lang.Character.toUpperCase;

/**
 *
 * @author Br33h3rr3ra
 */
public class HelpMenu extends View{
    
    String filename = "tips.txt";
    String line = null;
    private char choice;
    private String tips;
    private String returnPrevious;

    
    public HelpMenu() {
        super("\n********************************************************"
            + "\n*                                                      *"
            + "\n***********************HELP MENU************************"
            + "\n*                      'T' for Tips                    *"
            + "\n*                      'X' to Exit                     *"
            + "\n*     The goal of the game is to make it to Oregon     *"
            + "\n*                                                      *"
            + "\n*                                                      *"
            + "\n*                                                      *"
            + "\n*                                                      *"
            + "\n*                                                      *"
            + "\n"
        );
    }
    

    @Override
    public boolean doAction(String menuOption) {

        String choice = menuOption.toUpperCase();
        switch (choice) {
            case "X":
                getReturnPrevious();
                break;                
            case "T":
                this.getTips();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
         

    }

    public void getTips() {
        try {
            FileReader fileReader = new FileReader(filename);
        }
        //For some reason this is not getting the file.
        catch(FileNotFoundException fileReader) {
            System.out.println(
                "Unable to open file '" + 
                filename + "'");                
        }
        catch(IOException fileReader) {
            System.out.println(
                "Error reading file '" 
                + filename + "'");  
    }
    }
        
    public void setTips(String tips) {
        this.tips = tips;
    }

    public boolean getReturnPrevious() {
        return true;

    }

    public void setReturnPrevious(String returnPrevious) {
        this.returnPrevious = returnPrevious;
    }
}
 