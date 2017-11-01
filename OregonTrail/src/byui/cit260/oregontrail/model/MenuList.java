/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;

import java.io.Serializable;

/**
 *
 * @author Br33h3rr3ra
 */
public enum MenuList  implements Serializable {
   
    
    Hamburger("Hamburger", 1.00, 1),
        Alum("1", "8-oz botle of alum"),
        Bacon("308", "Bacon"),
        Bullets("3 boxes", "20 bullets");
        
    private final String mealType;
    private final double mealPrice;
    private final int mealQty;
    
     private MenuList(String mealType, double mealPrice, int mealQty) {
            this.mealQty = mealQty;
            this.mealType = mealType;
            this.mealPrice = mealPrice;
        }
}
