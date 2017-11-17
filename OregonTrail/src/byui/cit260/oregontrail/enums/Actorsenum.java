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

        Banker("500", "2"),
        Farmer("300", "5"),
        Carpenter("200", "3"),;
        
        private final String cash;
        private final String familyMembers;
        
        private Actorsenum(String cash, String familyMembers) {
            this.cash = cash;
            this.familyMembers = familyMembers;
        }
        
        public String getcash() {
            return this.cash;
        }

        public String getfamilyMembers() {
            return this.familyMembers;
        }

 }
