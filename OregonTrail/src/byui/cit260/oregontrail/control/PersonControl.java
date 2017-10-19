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
public class PersonControl {
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
}

