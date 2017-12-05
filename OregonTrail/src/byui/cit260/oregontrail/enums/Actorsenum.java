/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.enums;
import java.io.Serializable;
/**
 *
 *   @author Br33h3rr3ra

 */
public enum Actorsenum {

        Bob_Banker("Bob Banker","The banker has  the most money and only a spouse", 1000.00, 2),
        Fred_Farmer("Fred Farmer", "The farmer has some money but a spouse and 3 children", 500, 5),
        Chris_Carpenter("Chris Carpenter","The carpenter has a little money, 1 spouse and 1 child", 300.00, 3);
        
        private final String name;
        private final String description;
        private final double cash;
        private final int familyMembers;
        
        private Actorsenum(String name, String description, double cash, int familyMembers) {
            this.name = name;
             this.description = description;
            this.cash = cash;
            this.familyMembers = familyMembers;
        }

        public String getdescription() {
        return this.description;
        }
        
        public double getcash() {
            return this.cash;
        }

        public int getfamilyMembers() {
            return this.familyMembers;
        }
        
        public String getName() {
             return this.name;
        }

 }
