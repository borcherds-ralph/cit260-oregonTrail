/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;

import byui.cit260.oregontrail.model.Player;
/**
 *
 * @author ralphb
 */
//This is to test if the person has a name that is not blank

public class PersonControl {

    public Player PersonControl; 
    
    public String setName(String name){
        if ( name == null || name.isEmpty()) {
            return "Error: You must enter a name longer than 2 characters.";
        }
        Player player = new Player();
        String playerName = player.setName(name);
        return playerName;
        
    } 
    public String getPlayerName(PersonControl player){
        
        Player playertmp = new Player();
        String playerName = playertmp.getName();
        return playerName;
        
    } 
    public int personcount(int personcount) {
        if (personcount <= 0){
            return -1;
        }
        return personcount;

    }
    public int age (int age){
        if (age < 0 || age > 99) {
            return -1;}
        else
        { return age; }
    }
    //this compares the gender given to see that if it matches with the enum that is defined in this class
    public String genderentry (String gender) {
        if (gender.equalsIgnoreCase("male") || (gender.equalsIgnoreCase("female"))) {
                return gender;
        }
        return "Error -1";
        
    }
    
    //this compares the health given to the health defined in this class
    public String health (String health){
        if (health.equalsIgnoreCase("good") || (health.equalsIgnoreCase("fair") || (health.equalsIgnoreCase("poor") || (health.equalsIgnoreCase("sick"))))) {
            return health;
        }
        return "Error -1";
                
    }
    public String occupation (String occupation){
        if (occupation.equalsIgnoreCase("farmer") || (occupation.equalsIgnoreCase("carpenter") || (occupation.equalsIgnoreCase("banker")))) {
            return occupation;
        } else {
        }
        return "Error -1";
    }
    
    public static Player createPlayer(String name) {
        System.out.println("\n*** createPlayer() function called ****");
       if (name == null) {
            return null;
        }      
        
        Player player = new Player();
        player.setName(name);
        
        return player;
    }

}


