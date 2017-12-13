/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Br33h3rr3ra
 */
public class HelpMenu extends View {

    String line = null;
    private char choice;
    private String tips;
    private String returnPrevious;
    String filename = new File("src/byui/cit260/oregontrail/view/tips.txt").getAbsolutePath();

    public HelpMenu() {
        super("\n********************************************************"
                + "\n*                                                      *"
                + "\n***********************HELP MENU************************"
                + "\n*                                                      *"
                + "\n*                      'T' for Tips                    *"
                + "\n*                      'Q' to Exit                     *"
                + "\n*                                                      *"
                + "\n*                                                      *"
                + "\n*     The goal of the game is to make it to Oregon     *"
                + "\n*                                                      *"
                + "\n*                                                      *"
                + "\n*                                                      *"
                + "\n*                                                      *"
                + "\n********************************************************"
                + "\n"
        );
    }

    @Override
    public boolean doAction(String menuOption) {

        String choice = menuOption.toUpperCase();
        switch (choice) {
//           Ra                
            case "T":
                this.getTips();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;

    }

    public void getTips() {
        try {
            FileReader filereader = new FileReader(filename);
            BufferedReader bfReader = new BufferedReader(filereader);
            this.console.println("File Opened Sucessfully!");
            //while there are lines left in the file, it will read another line and stop when no lines are found.
            while ((line = bfReader.readLine()) != null) {
                this.console.println(line);
            }
            bfReader.close();
        } catch (FileNotFoundException filereader) {
            this.console.println(
                    "Unable to open file '"
                    + filename + "'");
        } catch (IOException filereader) {
            this.console.println(
                    "Error reading file '"
                    + filename + "'");
        }
    }

    public void setTips(String tips) {
        this.tips = tips;
    }
//
//    public boolean getReturnPrevious() {
//        return true;
//
//    }
//
//    public void setReturnPrevious(String returnPrevious) {
//        this.returnPrevious = returnPrevious;
//    }
}
