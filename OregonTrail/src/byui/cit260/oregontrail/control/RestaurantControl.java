/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;



/**
 *
 * @author Br33h3rr3ra
 */
public class RestaurantControl {
    private String Meals[];
    private String MealType[];
    private double MealPrice[];
    
    public double calcMealCosts(double[] list) {
	
	double total = 0;
	for(double x : list) {
	    total += x;
	}
	return total;
    } 
}