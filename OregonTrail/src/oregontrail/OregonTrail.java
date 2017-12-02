/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail;

import byui.cit260.oregontrail.view.StartProgramView;
import byui.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.Player;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import sun.util.logging.PlatformLogger;

/**
 *
 * @author ralphb
 */
public class OregonTrail {

     private static Game currentGame = null;
     private static Player player = null;

     private static PrintWriter outFile = null;
     private static BufferedReader inFile = null;
     
     private static PrintWriter logFile = null;

     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) throws Exception {

          try {
               OregonTrail.inFile = new BufferedReader(new InputStreamReader(System.in));
               OregonTrail.outFile = new PrintWriter(System.out, true);

               //log file
               String filePath = "log.txt";
               OregonTrail.logFile = new PrintWriter(filePath);
               
               StartProgramView startProgramView = new StartProgramView();
               startProgramView.display();
          } catch (Throwable te) {
               System.out.println("Exception: " + te.toString()
                       + "\nCause: " + te.getCause()
                       + "\nMessage: " + te.getMessage());
               
//             startProgramView.display();
          }
          
         
          finally {
               try {
                   if (OregonTrail.inFile != null)
                        OregonTrail.inFile.close();

                   if (OregonTrail.outFile != null)
                        OregonTrail.outFile.close();
                   
                   if (OregonTrail.logFile != null)
                        OregonTrail.logFile.close();
                   
              } catch (IOException ex) {
              System.out.println("Error closing files");
              return;
               }
          }
     }

     
        public static PrintWriter getLogFile() {
            return logFile;
        }
        
        public static void setLogFile(PrintWriter logFile) {
            OregonTrail.logFile = logFile;
        }
        
     public static Player getPlayer() {
          return player;
     }

     public static void setPlayer(Player player) {
          OregonTrail.currentGame = currentGame;
     }

     public static Game getCurrentGame() {
          Game currentGame = OregonTrail.currentGame;
          return currentGame;
     }

     public static void setCurrentGame(Game currentGame) {
          OregonTrail.currentGame = currentGame;
     }

     public static BufferedReader getInFile() {
          return inFile;
     }

     public static void setInFile(BufferedReader inFile) {
          OregonTrail.inFile = inFile;
     }

     public static PrintWriter getOutFile() {
          return outFile;
     }

     public static void setOutFile(PrintWriter outFile) {
          OregonTrail.outFile = outFile;
     }

}
