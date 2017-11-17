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
public enum Deathenum implements Serializable {

     measles("Town"), 
     snakebite("River"),
     exhaustion("Supply"), 
     typhoid("River"), 
     cholera("River"), 
     dysentery("River"),
     drowning("River"),
     gunshot("Town"),; 
    
        private final String location;


        private Deathenum(String location) {
            this.location = location;    
        }
        
        public String getlocation() {
            return this.location;
        }

 }

    
