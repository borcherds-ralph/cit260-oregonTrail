/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.enums;

import java.io.Serializable;
/**
 *
 * @author ralphb
 */
public enum ItemList implements Serializable {

        AloeVera("1", "8-oz jar of aloe vera", .2),
        Alum("1", "8-oz bottle of alum", .2),
        Bacon("308 lbs", "Bacon", 1),
        Bullets("3 boxes", "20 bullets", 2),
        Cheese("16 lbs", "cheese", 1),
        CoffeeBeans("20 lbs", "coffee beans", 20),
        CoffeeMill("1", "coffee mill",1 ),
        CoffeePot("1", "coffee pot", 1),
        CornMeal("8", "10-lb. sacks of cornmeal", 10),
        Crackers("8", "5-lb. tin of crackers", 5),
        DriedBeans("16", "10-lb. sacks of dried beans", 10),
        DriedBread("8", "5-lb. tins of dried bread", 5),
        DriedFruit("24", "5-lb. sacks of dried fruit", 5),
        DriedVegtables("20", "5-lb. sacks of dried vegetables", 5),
        Flour("16", "10-lb. sacks of flour", 10),
        Gunpowder("2", "25-lb kegs of gunpowder", 25),
        Hammer("1", "6-oz. hammer", .375),
        Kettle("1", "kettle", 1),
        Lard("3", "5-lb. slabs of lard", 5),
        Laudanum("1", "4-oz. bottle of laudanum", .25),
        Matches("5", "boxes matches", .25),
	Nails("1", "Box of Nails", 1),
        Pemmican("152 lbs", "pemmican", 1),
        Pepper("2", "8-oz. bottles of pepper", .2),
        Peppermint("1", "4-oz. bottle of peppermint", .25),
        Pickles("1", "25-lb. keg of pickles", 25),
        Potatoes("16", "5-lb. tins of preserved potatoes", 5),
        Rice("8", "20-lb. sacks of rice", 20),
        Rifle("1", "rifle", 3),
        Rope("1", "30-ft. length of rope", 3),
        Saleratus("2", "3-lb. boxes of saleratus", 3),
	Shovel("1", "Long handled shovel", 3),
        Clothing("12 sets", "clothing", 5),
        CookingUtensils("1 set", "cooking utensils", 1),
        EatingUtensils("1 set", "eating utensils", 1),
	Saw("1", "Large toothed hand saw", 2),
        Shoes("4 pairs", "shoes", 2),
        Soap("1", "10-lb. boxes of soap", 10),
        Socks("12 pairs", "socks", 1),
        Yoke("1", "spare ox yoke", 50),
        WagonTongue("1", "Wagon tongue", 30),
        WagonAxel("1", "spare wagon axle", 20),
        WagonWheel("1", "spare wagon wheel", 15),
        Sugar("12", "10-lb. sacks of sugar", 10),
        Sulfur("1", "6-oz. bottle of sulfur", .375),
        Tea("12 lbs", "tea", 12),
        TinCups("4", "tin cups", 1),
        TinPlates("4", "tin plates", 1),
        YeastCake("1", " 5-lb. box of yeast cake", 1);

        private final String recomQty;
        private final String itemName;
	private final double itemWeight;
        
        private ItemList(String qty, String itemName, double itemWeight) {
            this.recomQty = qty;
            this.itemName = itemName;
	    this.itemWeight = itemWeight;
        }
        
        public String getQty() {
            return this.recomQty;
        }

        public String getItemName() {
            return this.itemName;
        }

        public double getWeight(){
            return this.itemWeight;
        }
        

 }
