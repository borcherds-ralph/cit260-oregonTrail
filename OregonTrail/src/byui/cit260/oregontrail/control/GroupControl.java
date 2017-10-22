/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;
import byui.cit260.oregontrail.model.Party;
/**
 *
 * @author ralphb
 */
public class GroupControl {

    /*
    getSize() Method
    Purpose: Verify that the size of the groups is at lease 1 and not greater than 8
    Parameters:  Number of people
    return:  Size of group if within range else an error message
    */
   public int getSize(int groupSize) {

       

       if (groupSize < 0 || groupSize > 8) {
           return -1;
       }

       return groupSize;
       
   }

    /*
    getPace() Method
    Purpose: Verify that the pace of the group is not a negaive and not faster than 2 mph
    Parameters:  pace
    return:  Size of group if within range else an error message
    */
   public int getPace(int teamPace) {


       if (teamPace < 1 || teamPace > 3) {
           return -1;
       }

       return teamPace;
   }

   public String getName(String name) {

       return name;

   }
   
}