/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;

/**
 *
 * @author ralphb
 */
public class GamePlayerControl {

    public String getDayofWeek(int dayNumber) {
          
           switch (dayNumber) {
            case 0:
               return "Sunday";
            case 1:
                return "Monday";
            case 2:
               return "Tuesday";
            case 3:
                return "Wednesday";  
            case 4:
                return "Thursday";
            case 5:
               return "Friday";
            case 6:
                return "Saturday"; 
 }  
        return "error";
   }
}