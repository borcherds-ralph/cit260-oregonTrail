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

   public int getSize(int groupSize) {

       

       if (groupSize < 0 || groupSize > 8) {
           return -1;
       }

       return groupSize;
       
   }


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