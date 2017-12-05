/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.enums;

import java.io.Serializable;

/**
 *
 * @author Casey
 */
public enum ToolList implements Serializable {
    Hammer("1", "6-oz. hammer", .375),
    Matches("5", "boxes matches", .25),
    Weight("1", "Bags of Lead", 5),
	Nails("1", "Box of Nails", 1);
        
     private final String num;
        private final String itemName;
	private final double itemWeight;

    private ToolList(String num, String itemName, double itemWeight) {
        this.num = num;
        this.itemName = itemName;
        this.itemWeight = itemWeight;
    }
        
     public String getNum() {
            return this.num;
        }

        public String getName() {
            return this.itemName;
        }

        public double getWeight(){
            return this.itemWeight;
        }
        

}
