/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.RestaurantControl;
import byui.cit260.oregontrail.exceptions.ItemControlException;
import byui.cit260.oregontrail.exceptions.RestaurantControlException;

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
    public boolean doAction(String Choice) {
          try {
               Choice = "";}
          catch (int){
              System.out.println("\n Do not enter a number, enter a word");
          }
    
               try {   
                    Choice = String.Choice(Choice);
               } catch (Number format nf) {  
                    System.out.println("\n Enter a valid String choice."
                            + "\n Try again.");  
               }
               switch (Choice) {
      choice = choice.toUpperCase();{
       switch (Choice) {
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
             }
          return false;
     }
   }

   private void getSteak() Throws RestaurantExceptionControl {
       System.out.println("*** Steak and Pototoes ***");
       try {
             String result = "Steak"; 
             System.out.println("Do you want yours cooked well down, medium rare or rare?");
          } catch (RestauranteControlException) {
               System.out.println("\n\t***************************************");
          
   }

   private void getBurger() Throws RestaurantExceptionControl{
       Throws RestaurantExceptionControl {
       System.out.println("*** Hamburger and Fries ***");
       try {
             String result = "Burger"; 
             System.out.println("Do you want yours cooked well down, medium rare or rare?");
          } catch (RestauranteControlException) {
               System.out.println("\n\t***************************************");
          
   }
   
   private void getChili() Throws RestaurantExceptionControl{
       System.out.println("*** Chili and Cornbread ***");
       try {
             String result = "Chili"; 
             System.out.println("Do you want yours Hot, Medium or Mild?");
          } catch (RestauranteControlException) {
               System.out.println("\n\t***************************************");
   
   private void getPizza() {Throws RestaurantExceptionControl{
       System.out.println("*** Pizza and Salad ***");
       try {
             String result = "Pizza"; 
             System.out.println("Do you want Cheese, Pepperoni or Sausage?");
          } catch (RestauranteControlException) {
               System.out.println("\n\t***************************************");

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
	total = menucost.getMealPrice(lists);
                       
       
        System.out.println("The total bill is" + total);
   }
 
}
