/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;


import byui.cit260.oregontrail.model.Item;
import byui.cit260.oregontrail.exceptions.ItemControlException;

/**
 *
 * @author ralphb
 */
public class ItemControl {

    public double calcVolumeOfBarrel(double height, double centerDiameter, double topDiameter) throws ItemControlException {
        //This is for a barrel that had a bulge in the center like a wood wine barrel today.
        if (height <= 0 || height >= 35) { // height is out of range
           throw new ItemControlException("\nYou cannot have a height less than 1 or higher than 35 inches");
        } else if (centerDiameter <= 0 || centerDiameter > 36) { // Center diameter is out of range
             throw new ItemControlException("\nYou cannot have a center diameter less than"
		     + "\n the top diameter or greater than 36 inches");
        } else if (topDiameter <= 0 || topDiameter > 30) { // Top or Bottom diameter is out of range
             throw new ItemControlException("\nYou cannot have a top diameter less than 1 or"
		     + "\n greater than the center diameter or greater than 30 inches");
        }

        double radius = centerDiameter / 2;
        double middradius = topDiameter / 2;
        double volume = ((Math.PI * height) / 12) * (2 * Math.pow(middradius, 2) + Math.pow(radius, 2));

        return volume;
    }

    public double calcWeightOfItem(int qty, int weight) throws ItemControlException {
        Item item = new Item();

        // qty cannot be 0
        if (qty <= 0) {
            throw new ItemControlException("\nYou cannot have a quantity less than or equal to 0");
        } else if (weight <= 0) {
            throw new ItemControlException("\nYou cannot have a weight less than or equal to 0");
        } else if (weight >= 200) {
            throw new ItemControlException("\nYou cannot have a weight greater than 200 lbs");
        }

        double totalWeight = weight * qty;
        return totalWeight;

    }

    public double calcBarrelVolumeToGallons(double barrelvolume) throws ItemControlException {
        // 1 cubic inch = 0.00432899 US liquid gallon
        // 1 US Gallon = 231 Cubic Inches
        // 231 * .00432899 = 0.99999669 gallons - Excact Answer.

        // This sets the min allowed to be 1/4 gallon of liquid
        if (barrelvolume <= 56) {
           throw new ItemControlException("\nYou cannot have a volume less than 56 cubic inches");
        }

        // Max galls is 45.  10395 cubic inches is 45 gallons.
        if (barrelvolume >= 10396) {
           throw new ItemControlException("\nYou cannot have a volume greater than 10396 cubic inches");
        }
        double gallons = barrelvolume / 231;
        return gallons;
    }

    public double calcCylinderVolume(double diameter, double height) throws ItemControlException {

        // The diameter and height of the cylender needs to be greater than 1
        if (diameter < 1 || height < 1) {
            throw new ItemControlException("\nYou cannot have a diameter less than 1 or a height less than 1");
        }

        // Set the max diameter and height
        if (diameter >= 23 || height >= 33) {
            throw new ItemControlException("\nYou cannot have a diameter greater than 23 or a height greater than 33");
        }

        double radius = diameter / 2;
        double volume = Math.pow(radius, 2) * height * Math.PI;
        return volume;
    }

    public double getItemCost(double qty, double itemCost) throws ItemControlException {

        if (itemCost <= 0 || qty <= 0) {
            throw new ItemControlException("\nYou cannot have a cost or quanity less than or equal to 0");
        }
        double totalCost = qty * itemCost;
        return totalCost;
    }
    
    public String getItemDescription(String tagName) {
        Item item = new Item();
        String itemName = item.getItemName(tagName);
        return itemName;

    }
    
    public int calcTotalSuppliesWeight(int[] list) {
	
	int total = 0;
	for(int x : list) {
	    total += x;
	}
	return total;
    } 

    

}
