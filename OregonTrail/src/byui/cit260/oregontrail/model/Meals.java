/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.ArrayList;
import byui.cit260.oregontrail.model.MenuList;

/**
 *
 * @author Casey
 */
public class Meals implements Serializable {

    private String MealType;
    private double mealPrice;
    private int mealQty;
    

    public Meals() {
    }

    // @Override
    // public String toString() {
    //     return "Meals{" + "weight=" + weight + ", maxcapacity=" + maxcapacity + ", type=" + type + ", Size=" + Size + '}';
    //  }
    public Meals(String MealType, int mealPrice, int mealQty, int TotalPrice) {
        this.MealType = MealType;
        this.mealPrice = mealPrice;
        this.mealQty = mealQty;
    }

    public String getMealType() {
        return MealType;
    }

    public void setMealType(String MealType) {
        this.MealType = MealType;
    }

   

    public void setMealPrice(double mealPrice) {
        this.mealPrice = mealPrice;
    }

    public int getMealQty() {
        return mealQty;
    }

    public void setMealQty(int mealQty) {
        this.mealQty = mealQty;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.MealType);
        hash = 97 * hash + this.mealQty;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Meals other = (Meals) obj;
        if (this.mealPrice != other.mealPrice) {
            return false;
        }
        if (this.mealQty != other.mealQty) {
            return false;
        }
        if (!Objects.equals(this.MealType, other.MealType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Meals{" + "MealType=" + MealType + ", mealPrice=" + mealPrice + ", mealQty=" + mealQty  + '}';
    }

}
