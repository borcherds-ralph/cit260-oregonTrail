/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

/**
 *
 * @author ralphb
 */
public class HuntingView extends View {

    public HuntingView() {
        super("\n"
        + "\n *************************************************"
        + "\n *                 Supply Menu                   *"
        + "\n *************************************************"
        + "\nG - Weapon"
        + "\nA - Ammunition"
        + "\nW - Water"
        + "\nF - Flour"
        + "\nM - Meat"
        + "\nL - Lard"
        + "\nS - Sugar"
        + "\nN - Salt"
        + "\nE - Eggs"
        + "\nC - Clothing"
        + "\nB - Blankets"
        + "\nR - Rope"
        + "\nT - Tools"
        + "\nD - Shovel"
        + "\nU - Utensils"
        + "\nQ - Quit"
        + "\n *************************************************"
);
    }
    
    
    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); //convert choice to upper case
        
        switch (choice) {
            case "D": // direction to head toward
                this.direction();
                break;
            case "F": // to aim and fire the rifle
                this.fire();
                break;
            case "H": // display the help menu
                this.displayHelpMenu();
                break;  
            case "G": // display the help menu
                this.displayGuidedMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again***");
                break;
        }
        return false;
    }

    private void direction() {
        System.out.println("\n *** You chose the right direction ***");
    }

    private void fire() {
        System.out.println("\n *** You fired the weapon! ***");
    }

    private void displayGuidedMenu() {
        System.out.println("\n *** You are going on a guided hunt! Good luck! ***");
    }
    
    private void displayHelpMenu() {
        HelpMenu helpmenu = new HelpMenu();
        helpmenu.display();
    }
    
    private static class GameMenuView {
        public GameMenuView(){
        }
        private void displayMenu(){
            System.out.println("\n test() function called ***");
        }
    }
}
