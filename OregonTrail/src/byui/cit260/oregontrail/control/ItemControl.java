/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;

import byui.cit260.oregontrail.model.Item;

/**
 *
 * @author ralphb
 */
public class ItemControl {

     
    public double calcVolumeOfBarrel(double height, double centerDiameter, double topDiameter ){
        //This is for a barrel that had a bulge in the center like a wood wine barrel today.
        if(height <= 0 || height >= 35) { // height is out of range
            return -1;
        }
        if(centerDiameter <= 0 || centerDiameter > 36) { // Center diameter is out of range
            return -1;
        }
        if (topDiameter <= 0 || topDiameter > 30) { // Top or Bottom diameter is out of range
            return -1;
        }
        
        double radius = centerDiameter / 2;
        double middradius = topDiameter / 2;
        double volume = ((Math.PI * height)/ 12) * (2 * Math.pow(middradius,2) + Math.pow(radius, 2));
                
        return volume;
    }
    
    public double calcWeightOfItem(int qty, String itemtype) {
        Item item = new Item();
        
        // qty cannot be 0
        if (qty <= 0 ) {
            return -1;
        }
        
        // Itemtype cannot be null.   There has to be a value
        if(itemtype == null ||  itemtype.isEmpty()){
            return -1;
        } 
        
        double itemWeight = item.getItemweight();
        
        double totalWeight = itemWeight * qty;
        return totalWeight;

    }
    
    public double calcBarrelVolumeToGallons(double barrelvolume) {
        // 1 cubic inch = 0.00432899 US liquid gallon
        // 1 US Gallon = 231 Cubic Inches
        // 231 * .00432899 = 0.99999669 gallons - Excact Answer.
        
        // This sets the min allowed to be 1/4 gallon of liquid
        if (barrelvolume <= 56) {
            return -1;
        }
        
        // Max galls is 45.  10395 cubic inches is 45 gallons.
        if (barrelvolume >= 10396) {
            return -1;
        }
        double gallons = barrelvolume / 231;
        return gallons;
    }
    
    public double calcCylinderVolume(double diameter, double height){
        
        // The diameter and height of the cylender needs to be greater than 1
        if (diameter <= 1 || height <= 1) {
            return -1;
        }
        
        // Set the max diameter and height
        if (diameter >= 23 || height >= 33) {
            return -1;
        }
        
        double radius = diameter / 2;
        double volume = Math.pow(radius, 2) * height * Math.PI;
        return volume;
    }

    
public double getItemCost(String itemName, double qty, double itemCost) {

       if (itemName == null && itemName.isEmpty()) {
          return -1;
       }
       if (itemCost <=0) {
          return -1;
       }
       if (qty <=0) {
          return -1;
       }     
       return 1;
   }
}
