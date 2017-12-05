/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;
import byui.cit260.oregontrail.enums.ItemList;
import byui.cit260.oregontrail.exceptions.SuppliesControlException;
import byui.cit260.oregontrail.model.Item;
import byui.cit260.oregontrail.model.InventoryItem;
import byui.cit260.oregontrail.model.Supplies;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import oregontrail.OregonTrail;

/**
 *
 * @author ralphb
 */
public class SuppliesView extends View {

    public static PrintWriter report = null;
    
    public SuppliesView() throws SuppliesControlException, IOException{
        super("\n"
                + "\n *************************************************"
                + "\n *                 Supply Menu                   *"
                + "\n *************************************************"
                + "\nP - Save Supplies Report"
                + "\nG - Display Weapon"
                + "\nA - Display Ammunition"
                + "\nW - Display Water"
                + "\nF - Display Flour"
                + "\nM - Display Meat"
                + "\nL - Display Lard"
                + "\nS - Display Sugar"
                + "\nN - Display Salt"
                + "\nE - Display Eggs"
                + "\nC - Display Clothing"
                + "\nB - Display Blankets"
                + "\nR - Display Rope"
                + "\nT - Display Tools"
                + "\nD - Display Shovel"
                + "\nU - Display Utensils"
                + "\nQ - Quit"
                + "\n *************************************************"
        );
    }

    @Override
    public boolean doAction(String choice) {          
        try {
            choice = choice.toUpperCase();
            switch (choice) {
                case "P":
                    this.displayReport();
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
                    this.console.println("Invalid Entry -- Please try again");
                    break;
            }
            return false;
        } catch (SuppliesControlException | IOException ex) {
            Logger.getLogger(SuppliesView.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        } 
    

        
    
    
private void displayReport(ArrayList<Item> InventoryItem) throws SuppliesControlException, IOException {
    try {
        this.console.println("\n\nEnter the file path to save the report.");
       String filePath = null;
        PrintWriter report = new PrintWriter(filePath, "utf-8");
        filePath = this.keyboard.readLine();
        filePath = filePath.trim();

        report.printf("%n%-20s%15s%15s", "Description", "Num in Stock", "Num Required");
        report.write("\nAloeVera" + ItemList.AloeVera);
        for(ItemList Item : ItemList.values()){
        report.writef("%n%-20s%7d%7d", Item.getDescription()
                                        , Item.getQuantityInStock()
                                        , Item.getRequiredAmount());
                }
        report.flush();
        
         this.console.println("Report created successfully");
    }
    catch (IOException ex) {
        ErrorView.display(this.getClass().getName(),
                    "Error Creating Report" + ex.getMessage());
}
finally {
                try {  
    if (report != null) {
                report.close(); }
            } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(),
                    "Error Closing File" + ex.getMessage());
            }
        }
    }


    private void displayWeapon() {
        this.console.println("***DisplayWeapon Function called ***");
    }

    private void displayAmmo() {
        this.console.println("How much ammo do you need? I know... A lot");
    }

    private void displayWater() {
        this.console.println("How many gallons of water do you need?");
    }

    private void displayFlour() {
        this.console.println("How many lbs of Flour do you need to make cookies?");
    }

    private void displayMeat() {
        this.console.println("How many lbs of Meat do you need?");
    }

    private void displayLard() {
        this.console.println("How much discusting Lard do you need?");
    }

    private void displaySugar() {
        this.console.println("How many lbs of sweetness do you need?");
    }

    private void displaySalt() {
        this.console.println("How many lbs does it take to make a pillar?");
    }

    private void displayEggs() {
        this.console.println("How many eggs do you need to scramble?");
    }

    private void displayClothing() {
        this.console.println("How many layers of clothing do you need?");
    }

    private void displayBlankets() {
        this.console.println("One can never be too warm... How many blankets?");
    }

    private void displayRope() {
        this.console.println("How many Ropes do you have to throw me?");
    }

    private void displayTools() {
        this.console.println("Please tell me you need lots of tools!");
    }

    private void displayShovel() {
        this.console.println("If you are good at diggin holes... You need a shovel!");
    }

    private void displayUtensils() {
        this.console.println("How many forks for the road?");
    }

    private void suppliesreport() {
        
        if (Supplies.report != null)
            Supplies.report.close();
        
    }
    private void quitSupplies() {
        this.console.println("quit Supplies function called... Later Gator!");
    }

}
