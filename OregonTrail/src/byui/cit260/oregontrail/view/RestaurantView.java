/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.RestaurantControl;
import java.util.Random;

public class RestaurantView extends View {

    public RestaurantView() {
        super("\n"
            + "\n-----------------------------------------"
            + "\n| Food Menu                             |"
            + "\n-----------------------------------------"
            + "\nS - Steak and Potatoes"
            + "\nH - Hamburger and French Fries"
            + "\nC - Chili and Cornbread"
            + "\nP - Pizza and Salad"
            + "\nB - Get Bill"
            + "\nQ - Return"
            + "\n-----------------------------------------"
            );
    }
    

    @Override
    public boolean doAction(String choice) {

      choice = choice.toUpperCase();
       switch (choice) {
           case "STEAK":
               this.getSteak();
               break;
           case "HAMBURGER":
               this.getBurger();
               break;
           case "CHILI":
               this.getChili();
               break;
           case "PIZZA":
               this.getPizza();
               break;
           case "B":
               this.getBill();
               break;
           case "Q":
               this.quitMenu();
               break;
           default:
               System.out.println("\n*** Invalid selection *** Try again");
               break;
       }

       return false;
   }

   private void getSteak() {
       System.out.println("*** Steak and Pototoes ***");
   }

   private void getBurger() {
       System.out.println("*** Hamburger and French Fries ***");
   }
   
   private void getChili() {
       System.out.println("*** Chili and Cornbread ***");
   }
   
   private void getPizza() {
       System.out.println("*** Pizza and Salad ***");
   }
   private void quitMenu() {
       System.out.println("*** Return To Previous Scene ***");
   }
   
   private void getBill() {
        double[] costs = new double[10];
         
       RestaurantControl menucost = new RestaurantControl();
	int i;
	Random rand = new Random();
	double[] lists = new double[10];
	int n;
	for(i=0; i < 10; i++){
	    n = rand.nextInt(50) + 1;
	    lists[i] = n;
	}
	double total;
	total = menucost.calcMealCosts(lists);
                       
       
        System.out.println("The total bill is" + total);
   }
 
}
