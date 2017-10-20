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
//This is to test if the person has a name that is not blank

public class PersonControl {

    public enum gender{
        MALE, FEMALE
    }
    
    public enum health {
        good, fair, poor, sick
    }
    
    public enum occupationlist {
        farmer, carpenter, banker
    }
    public String name(String name){
        if ( name == null || name.isEmpty()) {
            return "Error -1";
        }
        return name;
        
    } 
    public int personcount(int personcount) {
        if (personcount <= 0){
            return -1;
        }
        return personcount;

    }
    public int age (int age){
        if(age < 0 || age > 99) {
            return -1;
        }
        return age;
    }
    //this compares the gender given to see that if it matches with the enum that is defined in this class
    public String gender (String gender) {
        if (gender.equalsIgnoreCase(gender)) {
                return gender;
        }
        return "Error -1";
        
    }
    
    //this compares the health given to the health defined in this class
    public String health (String health){
        if (health.equalsIgnoreCase(health)) {
            return health;
        }
        return "Error -1";
                
    }
    public String occupation (String occupation){
        if (occupation.equalsIgnoreCase(occupationlist))
                return occupation;
        return "Error -1";
    }
}

