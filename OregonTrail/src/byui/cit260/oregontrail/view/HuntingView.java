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
        + "\n *                 Hunting Menu                  *"
        + "\n *************************************************"
        + "\nD - Choose Direction"
        + "\nF - Fire Weapon"
        + "\nH - Display Help Menu"
        + "\nG - Display Guided Hunting Menu"
        + "\nQ - Quit"
        + "\n *************************************************"
);
    }
    
    
    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        switch (choice) {
            case "D": 
                this.direction();
                break;
            case "F": 
                this.fire();
                break;
            case "H": 
                this.displayHelpMenu();
                break;  
            case "G": 
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
