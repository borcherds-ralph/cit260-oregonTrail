/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

public class HotelView extends View {

    public HotelView() {
        super("\n"
            + "\n-----------------------------------------"
            + "\n| Main Menu                             |"
            + "\n-----------------------------------------"
            + "\nD - Get a drink at the Bar"
            + "\nF - Get food to eat at the Restaurante"
            + "\nR - Get a room, Go to bed"
            + "\nA - Add a new team member"    
            + "\nC - See Cost of Bill"
            + "\nB - Return back to last scene"   
            + "\n-----------------------------------------"
        );
    }

    @Override
    public boolean doAction(String choice) {

    choice = choice.toUpperCase();
       switch (choice) {
           case "D":
               this.goToBar();
               break;
           case "F":
               this.goToRestaurante();
               break;
           case "R":
               this.getARoom();
               break;
           case "A":
               this.RecruitMemberView();
               break;
           case "C":
               this.Bill();
               break;
           case "B":
               this.returnToPrevious();
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

    private void goToBar() {
        this.console.println("*** Go to Bar for a drink ***");
    }

    private void goToRestaurante() {
        this.console.println("*** Get Some Food at the Restaurante ***");
    }

    private void getARoom() {
        this.console.println("*** Get a hotel room and get some rest ***");
    }
    
    private void RecruitMemberView() {
        RecruitMemberView recruit = new RecruitMemberView();
        recruit.display();
    }
    private void returnToPrevious() {    
        this.console.println("*** return to previous page ***");
    }
    private void Bill() {
        this.console.println("*** See the bill for the meal ***");
    }
    private void quitGame() {
        this.console.println("Are you sure you want to quit the game ***");
    }

    }
