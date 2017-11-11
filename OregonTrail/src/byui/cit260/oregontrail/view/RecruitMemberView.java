/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import java.util.Scanner;
/**
 *
 * @author Br33h3rr3ra
 */
public class RecruitMemberView extends View{
    
  
    public RecruitMemberView() {
        super("\n"
            + "\n-----------------------------------------"
            + "\n| Recruit New Team Member                         |"
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
    public boolean doAction(String menuOption) {

       String choice = menuOption.toUpperCase();
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
               System.out.println("\n*** Invalid selection *** Try again");
               break;
       }

       return false;
    }

  private void pickArtie() {
        System.out.println("*** Pick Artie to join the team ***");
    }
 private void pickSammy() {
        System.out.println("*** Pick Sammy to join the team ***");
    }
  private void pickSue() {
        System.out.println("*** Pick Sue to join the team ***");
    }
   private void pickCarol() {
        System.out.println("*** Pick Carol to join the team ***");
    }
    private void saveGame() {
        System.out.println("*** startExistingGame or startSaveGame function called ***");
    }
   
    private void quitGame() {
        System.out.println("\n*** Invalid selection *** Try again");
    }
    
}

