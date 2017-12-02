/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;
import java.io.BufferedReader;
import java.io.PrintWriter;
/**
 *
 * @author Br33h3rr3ra
 */
public class RecruitMemberView extends View{
    
  
    public RecruitMemberView() {
        super("\n"
            + "\n------------------------------------------------------"
            + "\n| Recruit New Team Member                            |"
            + "\n-----------------------------------------"
            + "\nArtie - Pick Artie-the heart surgeon- to join the team"
            + "\nSammy - Pick Sammy- the jailor- to join the team"
            + "\nSue - Pick Sue- the hunter- to join the team"
            + "\nCarol - Pick Carol-the Cook- to join the team"
            + "\nS - Save game"
            + "\nQ - Quit"
            + "\n-----------------------------------------");
    }
    
   
    @Override
    public boolean doAction(String choice) {

       choice = choice.toUpperCase();
       switch (choice) {
           case "Artie":
               this.pickArtie();
               break;
           case "Sammy":
               this.pickSammy();
               break;
           case "Sue":
               this.pickSue();
               break;
           case "Carol":
               this.pickCarol();
               break;
           case "S":
               this.saveGame();
               break;
           case "Q":
               this.quitGame();
               break;
           default:
               this.console.println("\n*** Invalid selection *** Try again");
               break;
       }

       return false;
    }

  private void pickArtie() {
        this.console.println("*** Pick Artie to join the team ***");
    }
 private void pickSammy() {
        this.console.println("*** Pick Sammy to join the team ***");
    }
  private void pickSue() {
        this.console.println("*** Pick Sue to join the team ***");
    }
   private void pickCarol() {
        this.console.println("*** Pick Carol to join the team ***");
    }
    private void saveGame() {
        this.console.println("*** startExistingGame or startSaveGame function called ***");
    }
   
    private void quitGame() {
        this.console.println("\n*** Are you sure you want to quit?***See you next time");
    }

    
    }
