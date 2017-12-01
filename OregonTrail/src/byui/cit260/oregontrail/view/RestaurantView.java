package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.RestaurantControl;
import byui.cit260.oregontrail.exceptions.ItemControlException;
import byui.cit260.oregontrail.exceptions.RestaurantControlException;
import java.util.Scanner;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;




public class RestaurantView extends View {

     public RestaurantView() {
          super("\n"
                  + "\n-----------------------------------------"
                  + "\n| Food Menu |"
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

          try {
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
               
               
          } catch (RestaurantControlException | ItemControlException ex) {
               Logger.getLogger(RestaurantView.class.getName()).log(Level.SEVERE, null, ex);
          }
          return false;
     }

     private void getSteak() throws RestaurantControlException {
          System.out.println("*** Steak and Pototoes ***");
          try {
               String result = "Steak";
               System.out.println("Do you want yours cooked well down, medium rare or rare?");
          } catch (RestaurantControlException w) {
               System.out.println("\n ******************************************************");
               System.out.println("\n " + w);
          }

     }

     private void getBurger() throws RestaurantControlException {

          System.out.println("*** Hamburger and Fries ***");
          try {
               String result = "Burger";
               System.out.println("Do you want yours cooked well down, medium rare or rare?");
          } catch (RestaurantControlException w) {
               System.out.println("\n ******************************************************");
               System.out.println("\n " + w);
          }
     }

     private void getChili() throws RestaurantControlException {
          System.out.println("*** Chili and Cornbread ***");
          try {
               String result = "Chili";
               System.out.println("Do you want yours Hot, Medium or Mild?");
          } catch (RestaurantControlException w) {
               System.out.println("\n ******************************************************");
               System.out.println("\n " + w);
          }
     }

     private void getPizza() throws RestaurantControlException {
          System.out.println("*** Pizza and Salad ***");
          try {
               String result = "Pizza";
               System.out.println("Do you want Cheese, Pepperoni or Sausage?");
          } catch (RestaurantControlException w) {
               System.out.println("\n ******************************************************");
               System.out.println("\n " + w);
          }
     }

     private void quitMenu() throws RestaurantControlException {
          System.out.println("*** Return To Previous Scene ***");
     }

     private void getBill() throws RestaurantControlException, ItemControlException {
          double[] costs = new double[10];

          RestaurantControl mealprice = new RestaurantControl();
          
          Random rand = new Random();

          System.out.println("Please enter your meal");
          String Meal = this.keyInput.readLine();
          System.out.println("Enter the qty");
          int qty = this.keyInput.readLine();

               Double[] lists;
               lists = new Double[10];
               double n;
               for(int i=0; i < qty; i++){
                    n = rand.nextInt(50) + 1;
                    lists[i] = n;
                }

               double total;
               total = mealprice.getMealPrice(lists);
               System.out.println("The total bill is" + total);

     }

}
