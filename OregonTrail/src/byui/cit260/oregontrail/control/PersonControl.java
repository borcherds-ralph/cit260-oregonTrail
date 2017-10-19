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
    public String name(String name){
        if ( name == null || name.isEmpty()) {
            return "Error -1";
        
            }else {
             return name;
            }
    } 
    public int personcount(int personcount) {
    if (personcount <= 0){
        return -1;
        }
    else {return personcount;
    }
}
    public int age (int age){
        if(age < 0 || age > 99)
            return -1;
       else return age;
    }
    public String gender (String gender) {
        if(gender.equalsIgnoreCase(gender)|| gender.isEmpty())
                return "Error -1";
    else {
    return gender;
            }
}
}

