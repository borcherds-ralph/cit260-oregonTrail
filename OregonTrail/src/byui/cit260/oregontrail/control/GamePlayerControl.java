/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;
//import byui.cit260.oregontrail.model.GamePlayer;

/**
 *
 * @author ralphb
 */
public class GamePlayerControl {

    public String getDayofWeek(int dayNumber) {
        String day1 = "Sunday";
        String day2 = "Monday";
        String day3 = "Tuesday";
        String day4 = "Wednesday";
        String day5 = "Thursday";
        String day6 = "Friday";
        String day7 = "Saturday";
           
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
