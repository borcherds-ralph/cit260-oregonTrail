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
public class MapView extends View {
  

    public MapView() {
        super("\n"
                + "\n---------------------------------"
                + "\n| Map Menu                     |"
                + "\n---------------------------------"
                + "\nM - Full Map View"
                + "\nD - Distance to next town, fort, or checkpoint"
                + "\nE - Distance to final destination"
                + "\nT - Distance Traveled "
                + "\nQ - Return to previous menu"
                + "\n ---------------------------------");

    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase();

        switch (choice) {
            case "M":
                this.displayMapView();
                break;
            case "D":
                this.displayDistanceNext();
                break;
            case "E":
                this.displayDistanceFinal();
                break;
            case "T":
                this.displayDistanceTraveled();
                break;
            case "R":
                this.returnToMainMenu();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;
    }

    private void displayMapView() {
        System.out.println("\n*** displayMapView stub function called ***");

    }

    private void displayDistanceNext() {
        System.out.println("\n*** displayDistanceNext stub function called ***");

    }

    private void displayDistanceFinal() {
        System.out.println("\n*** displayDistanceFinal stub function called ***");

    }

    private void displayDistanceTraveled() {
        System.out.println("\n*** displayDistanceTraveled stub function called "
                + "***");
    }

    void returnToMainMenu() {
        return;
		
    }

      
}
