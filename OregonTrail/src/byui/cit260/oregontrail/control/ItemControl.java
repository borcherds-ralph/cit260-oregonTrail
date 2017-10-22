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

    private static String itemName;

    public enum ItemList {

        AloeVera("1", "8-oz jar of aloe vera"),
        Alum("1", "8-oz bottle of alum"),
        Bacon("308", "Bacon"),
        Bullets("3 boxes", "20 bullets"),
        Cheese("16 lbs", "cheese"),
        CofeeBeans("20 lbs", "coffee beans"),
        CoffeeMill("1", "coffee mill"),
        CoffeePot("1", "coffee pot"),
        CornMeal("8", "10-lb. sacks of cornmeal"),
        Crackers("8", "5-lb. tin of crackers"),
        DriedBeans("16", "10-lb. sacks of dried beans"),
        DriedBread("8", "5-lb. tins of dried bread"),
        DriedFruit("24", "5-lb. sacks of dried fruit"),
        DriedVegtables("20", "5-lb. sacks of dried vegetables"),
        Flour("16", "10-lb. sacks of flour"),
        Gunpowder("2", "25-lb kegs of gunpowder"),
        Iodine("1", "4-oz. bottle of iodine"),
        Kettle("1", "kettle"),
        Lard("3", "5-lb. slabs of lard"),
        Laudanum("1", "4-oz. bottle of laudanum"),
        Matches("5", "boxes matches"),
        Pemmican("152 lbs", "pemmican"),
        Pepper("2", "8-oz. bottles of pepper"),
        Peppermint("1", "4-oz. bottle of peppermint"),
        Pickles("1", "25-lb. keg of pickles"),
        Potatoes("16", "5-lb. tins of preserved potatoes"),
        Rice("8", "20-lb. sacks of rice"),
        Rifle("1", "rifle"),
        Rope("1", "30-lb. length of rope"),
        Saleratus("2", "3-lb. boxes of saleratus"),
        Clothing("12 sets", "clothing"),
        CookingUtensils("1 set", "cooking utensils"),
        EatingUtensils("1 set", "eating utensils"),
        Shoes("4 pairs", "shoes"),
        Soap("1", "10-lb. boxes of soap"),
        Socks("12 pairs", "socks"),
        Yoke("1", "spare ox yoke"),
        WagonTonge("1", "spare wagon tongue"),
        WagonAxel("1", "spare wagon axle"),
        WagonWheel("1", "spare wagon wheel"),
        Sugar("12", "10-lb. sacks of sugar"),
        Sulfur("1", "6-oz. bottle of sulfur"),
        Tea("12 lbs", "tea"),
        TinCups("4", "tin cups"),
        TinPlates("4", "tin plates"),
        YeastCake("1", " 5-lb. box of yeast cake");

        private String qty;
        private String itemName;
        
        private ItemList(String qty, String itemName) {
            this.qty = qty;
            this.itemName = itemName;
        }
        
        public String getQty() {
            return this.qty;
        }

        public String getItemName() {
            return this.itemName;
        }

        public String getValue(){
            return this.itemName;
        }
        
  
        
    }

    public double calcVolumeOfBarrel(double height, double centerDiameter, double topDiameter) {
        //This is for a barrel that had a bulge in the center like a wood wine barrel today.
        if (height <= 0 || height >= 35) { // height is out of range
            return -1;
        }
        if (centerDiameter <= 0 || centerDiameter > 36) { // Center diameter is out of range
            return -1;
        }
        if (topDiameter <= 0 || topDiameter > 30) { // Top or Bottom diameter is out of range
            return -1;
        }

        double radius = centerDiameter / 2;
        double middradius = topDiameter / 2;
        double volume = ((Math.PI * height) / 12) * (2 * Math.pow(middradius, 2) + Math.pow(radius, 2));

        return volume;
    }

    public double calcWeightOfItem(int qty, int weight) {
        Item item = new Item();

        // qty cannot be 0
        if (qty <= 0) {
            return -1;
        }
        
        if (weight <= 0) {
            return -1;
        }
        
        if (weight >= 200) {
            return -1;
        }

        double totalWeight = weight * qty;
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

    public double calcCylinderVolume(double diameter, double height) {

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

    public double getItemCost(double qty, double itemCost) {

        if (itemCost <= 0 || qty <= 0) {
            return -1;
        }
        double totalCost = qty * itemCost;
        return totalCost;
    }

}
