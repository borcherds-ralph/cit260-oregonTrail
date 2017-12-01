package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.RestaurantControl;
import byui.cit260.oregontrail.exceptions.ItemControlException;
import byui.cit260.oregontrail.exceptions.RestaurantControlException;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;




public class RestaurantView extends View {

    private int Meal;

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
               
               
          } catch (RestaurantControlException ex) {
               Logger.getLogger(RestaurantView.class.getName()).log(Level.SEVERE, null, ex);
          }
          return false;
     }

     private void getSteak() throws RestaurantControlException {
          System.out.println("*** Steak and Pototoes ***");
          String result = "Steak";
          System.out.println("Do you want yours cooked well down, medium rare or rare?");

     }

     private void getBurger() throws RestaurantControlException {

          System.out.println("*** Hamburger and Fries ***");
          String result = "Burger";
          System.out.println("Do you want yours cooked well down, medium rare or rare?");
     }

     private void getChili() throws RestaurantControlException {
          System.out.println("*** Chili and Cornbread ***");
          String result = "Chili";
          System.out.println("Do you want yours Hot, Medium or Mild?");
     }

     private void getPizza() throws RestaurantControlException {
          System.out.println("*** Pizza and Salad ***");
          String result = "Pizza";
          System.out.println("Do you want Cheese, Pepperoni or Sausage?");
     }

     private void quitMenu() throws RestaurantControlException {
          System.out.println("*** Return To Previous Scene ***");
     }

     private void getBill(int qty) throws RestaurantControlException, ItemControlException {
          double[] costs = new double[10];

          RestaurantControl mealprice = new RestaurantControl();
          
          Random rand = new Random();

          System.out.println("Please enter your meal");
         
      //  double mealprice = this.mealprice.readLine();
          System.out.println(//"Enter the qty");
         
         int qty = this.qty.readLine();

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

    private void getBill() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private class keyInput {

        public int readLine() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public keyInput() {
        }
    }

    private class MealType {

        private String readLine() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public MealType() {
        }
    }

    private class qty {

        private int readLine() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public qty() {
        }
    }

    private class mealprice {

        private double readLine() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public mealprice() {
        }
    }

}
