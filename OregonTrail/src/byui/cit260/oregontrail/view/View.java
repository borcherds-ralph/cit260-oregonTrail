/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import oregontrail.OregonTrail;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ralphb
 */
public abstract class View implements ViewInterface {
    protected String displayMessage;
    private boolean input = true;
    protected final BufferedReader keyboard = OregonTrail.getInFile();
    protected final PrintWriter console = OregonTrail.getOutFile();
        
    public View() {
        this.input = true;
    }

     public View(String message) {
          this.displayMessage = message;
      }
     
     
     @Override
     public void display() {

          boolean done = false;
          do {
               // prompt for and get players name
               String value = this.getInput();
               if (value.toUpperCase().equals("Q")) // user wants to quit
               {
                    return; // exit the view
               }
               // do the requested action and display the next view
               done = this.doAction(value);

          } while (!done); // exit the view when done == true

     }

     @Override
     public String getInput() {

          boolean valid = false;
          String value = null;

               // while a valid name has not been retrieved
               while (!valid) {

               try {
                    // display the prompt message
                    System.out.println("\n" + this.displayMessage);

                    // get the value entered from the keyboard
                    value = this.keyboard.readLine();
                    value = value.trim();

                    if (value.length() < 1) { // blank value entered
                         System.out.println("\n*** You must enter a value *** ");
                         continue;
                    }

                    break;
               } catch (IOException ex) {
                    Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
               }
               }
          

          return value; // return the name        
     }

     public void clearConsole() {
          try {
               final String os = System.getProperty("os.name");

               if (os.contains("Windows")) {
                    Runtime.getRuntime().exec("cls");
               } else {
                    Runtime.getRuntime().exec("clear");
               }
          } catch (final Exception e) {
               //  Handle any exceptions.
          }

     }

}
