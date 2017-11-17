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
public enum Actorsenum implements Serializable {

        Banker("The banker has  the most money and only a spouse", "1,000", "2"),
        Farmer("The farmer has some money but a spouse and 3 children", "500", "5"),
        Carpenter("The carpenter has a little money, 1 spouse and 1 child", "300", "3"),;
        
        private final String description;
        private final String cash;
        private final String familyMembers;
        
        private Actorsenum(String description, String cash, String familyMembers) {
            this.description = description;
            this.cash = cash;
            this.familyMembers = familyMembers;
        }

        public String getdescription() {
        return this.description;
        }
        
        public String getcash() {
            return this.cash;
        }

        public String getfamilyMembers() {
            return this.familyMembers;
        }

 }
