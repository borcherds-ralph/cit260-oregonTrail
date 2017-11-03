 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;

import byui.cit260.oregontrail.model.Meals;

/**
 *
 * @author Br33h3rr3ra
 */
public class MenuItems {
    
    private Meals[] orderMeals() {
        Meals[] menu = new Meals[4];
        
        Meals steak = new Meals();
        steak.setMealType("Steak");
        steak.setMealPrice(3.00);
   // public double getItemCost(String mealType, double mealPrice, int mealQty); 

        Meals hamburger = new Meals();
       hamburger.setMealType("Hamburger");
        hamburger.setMealPrice(1.00);
   // public double getItemCost(double qty, double itemCost); 
   
        Meals chili = new Meals();
       chili.setMealType("Chili");//     Chili.setMealPrice(1.00);
    //    public double getItemCost(String MealType, double mealPrice, int mealQty) 
        
        
       Meals pizza = new Meals();
        pizza.setMealType("Pizza");
        pizza.setMealPrice(2.00);
    //    public double getItemCost(String MealType, double mealPrice, int mealQty){
            
   //     if (itemCost <= 0 || qty <= 0) {
    //        return -1;
    //   }
    //    double totalCost = mealPrice * mealQty;
   //   return totalCost;
    //}
    
   // public String getItemDescription(String tagName) {
    //    Item item = new Item();
    //    String itemName = item.getItemName(tagName);
    //    return itemName;

    //}

//}


