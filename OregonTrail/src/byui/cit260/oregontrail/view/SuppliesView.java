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
public class SuppliesView extends View {

    public SuppliesView() {
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
        if (choice.length() < 2) {
            System.out.println("\nInvalid choice:"
                    + "You must enter a value or selection");
            return false;
        }
        choice = choice.toUpperCase(); // converts choice to upper case

        switch (choice) {
            case "G":
                this.displayWeapon();
                break;
            case "A":
                this.displayAmmo();
                break;
            case "W":
                this.displayWater();
                break;
            case "F":
                this.displayFlour();
                break;
            case "M":
                this.displayMeat();
                break;
            case "L":
                this.displayLard();
                break;
            case "S":
                this.displaySugar();
                break;
            case "N":
                this.displaySalt();
                break;
            case "E":
                this.displayEggs();
                break;
            case "C":
                this.displayClothing();
                break;
            case "B":
                this.displayBlankets();
                break;
            case "R":
                this.displayRope();
                break;
            case "T":
                this.displayTools();
                break;
            case "D":
                this.displayShovel();
                break;
            case "U":
                this.displayUtensils();
                break;
            case "Q": //to quit this menu
                this.quitSupplies();
                break;
            default:
                System.out.println("Invalid Entry -- Please try again... Ox");
                break;
        }

        return false;
    }

    private void displayWeapon() {
        System.out.println("***DisplayWeapon Function called ***");
    }

    private void displayAmmo() {
        System.out.println("How much ammo do you need? I know... A lot");
    }

    private void displayWater() {
        System.out.println("How many gallons of water do you need?");
    }

    private void displayFlour() {
        System.out.println("How many lbs of Flour do you need to make cookies?");
    }

    private void displayMeat() {
        System.out.println("How many lbs of Meat do you need?");
    }

    private void displayLard() {
        System.out.println("How much discusting Lard do you need?");
    }

    private void displaySugar() {
        System.out.println("How many lbs of sweetness do you need?");
    }

    private void displaySalt() {
        System.out.println("How many lbs does it take to make a pillar?");
    }

    private void displayEggs() {
        System.out.println("How many eggs do you need to scramble?");
    }

    private void displayClothing() {
        System.out.println("How many layers of clothing do you need?");
    }

    private void displayBlankets() {
        System.out.println("One can never be too warm... How many blankets?");
    }

    private void displayRope() {
        System.out.println("How many Ropes do you have to throw me?");
    }

    private void displayTools() {
        System.out.println("Please tell me you need lots of tools!");
    }

    private void displayShovel() {
        System.out.println("If you are good at diggin holes... You need a shovel!");
    }

    private void displayUtensils() {
        System.out.println("How many forks for the road?");
    }

    private void quitSupplies() {
        System.out.println("quit Supplies function called... Later Gator!");
    }

}
