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
   
    
        Steak("Steak", 3.00, 1),
        Hamburger("Hamburger", 1.00, 1),
        Chili("Chili",1.00, 1),
        Pizza("Pizza", 2.00, 1);
        
    private final String mealType;
    private final double mealPrice;
    private final int mealQty;
    
     private MenuList(String mealType, double mealPrice, int mealQty) {
            this.mealQty = mealQty;
            this.mealType = mealType;
            this.mealPrice = mealPrice;
        }

        public String getmealType() {
            return this.mealType;
        }

        public double getmealPrice() {
            return this.mealPrice;
        }

        public int getmealQty(){
            return this.mealQty;
        }
        

 }