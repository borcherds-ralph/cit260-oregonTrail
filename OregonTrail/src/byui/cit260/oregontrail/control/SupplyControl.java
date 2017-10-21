/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;
import byui.cit260.oregontrail.model.Supplies;
import byui.cit260.oregontrail.model.Item;
import byui.cit260.oregontrail.model.Party;
/**
 *
 * @author Casey
 */
public class SupplyControl {
    //this simply tests weight and cost, but it does not check if the values are correct like they are 
    //defined in the 
           public double getweight(int weight){
           if(weight <= 0 ) {
               return -1;
           }
           return weight;

           }
                      
           public double SupplyControl(int cost){
               if(cost <= 0 ){
               return -1;
           }
               return cost;
       }

           //Team pace is 1 for slow, 2 for medium and 3 for fast. 
           //if the party goes faster, it will result in more supplies being consumed
           //Teampace and size of party are defined in a another portion of this program, so the check is redundent and included in groupcontrol.
           public double DailySupplyConsumption (double suppliessubtracted, int teamPace, int sizeofparty) {
                //Calculations
               if (teamPace == 1) { suppliessubtracted = 3 * sizeofparty; 
                       }
               if (teamPace == 2) { suppliessubtracted = 3 * 1.25 * sizeofparty; 
                       }
               if (teamPace == 3) { suppliessubtracted = 3 * 1.50 * sizeofparty; 
                       }
               //tests for vaild input
               if (suppliessubtracted <= 0) { suppliessubtracted = -1;
               }
               //37 is the theoretical max as the most in a party is 8 and at the most draw is 36
               if (suppliessubtracted > 37) { suppliessubtracted = -1;
               }
               { 
               return suppliessubtracted;
           }

}
}
