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
           public double DailySupplyConsumption (double suppliessubtracted, int teamPace, int sizeofparty) {
               if (teamPace == 1) { suppliessubtracted = 3 * sizeofparty; 
                       }
               if (teamPace == 2) { suppliessubtracted = 3 * 1.25 * sizeofparty; 
                       }
               if (teamPace == 3) { suppliessubtracted = 3 * 1.50 * sizeofparty; 
                       }
               { 
               return suppliessubtracted;
           }
          
                 
}
}
