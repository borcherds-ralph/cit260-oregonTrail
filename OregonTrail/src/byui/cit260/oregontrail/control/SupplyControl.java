/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;
import byui.cit260.oregontrail.model.Supplies;
import byui.cit260.oregontrail.model.Item;
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
          
                 
}
