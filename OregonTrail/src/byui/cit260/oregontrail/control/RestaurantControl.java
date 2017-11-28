/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;

import byui.cit260.oregontrail.exceptions.ItemControlException;
import byui.cit260.oregontrail.model.Item;



/**
 *
 * @author Br33h3rr3ra
 */
public class RestaurantControl {
    private String Meals[];
    private String MealType;
    private int qty;
    private double MealPrice;
    private double PlayerMoney;
    private double total;
             
    
    public double getMealCost(String Meals, String MealType, int qty, double MealPrice, int total) throws ItemControlException {
        total = 0;
                
        if (MealPrice >  PlayerMoney) {
            throw new ItemControlException("\nYou need more money");
        }
        else {
        return total;}}}
