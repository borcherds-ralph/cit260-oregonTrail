/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;

import byui.cit260.oregontrail.exceptions.PersonControlException;
import byui.cit260.oregontrail.model.Player;


import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author ralphb
 */
//This is to test if the person has a name that is not blank

public class PersonControl {

    public Player PersonControl;

    public String setName(String name) throws PersonControlException {
        if ( name == null || name.isEmpty()) {
            throw new PersonControlException("Error: You must enter a name longer than 2 characters.");
        }
        Player player = new Player();
        String playerName = player.setName(name);
        return playerName;

    }
    public String getPlayerName(PersonControl player) throws PersonControlException{

        Player playertmp = new Player();
        String playerName = playertmp.getName();
        return playerName;

    }
    public int personcount(int personcount) throws PersonControlException {
        if (personcount <= 0){
            throw new PersonControlException("Error: You must have one or more people.");
        }
        return personcount;

    }
    public int age (int age) throws PersonControlException{
        if (age < 0 || age > 99) {
            throw new PersonControlException("Error: The ages must be between 0 and 99 years old.");
        }
        else
        { return age; }
    }
    //this compares the gender given to see that if it matches with the enum that is defined in this class
    public String genderentry (String gender) throws  PersonControlException {
        if (gender.equalsIgnoreCase("male") || (gender.equalsIgnoreCase("female"))) {
                return gender;
        } else {
        throw new PersonControlException("Error: You must be eitehr a male or female gender.");
        }
    }

    //this compares the health given to the health defined in this class
    public String health (String health) throws  PersonControlException{
        if (health.equalsIgnoreCase("good") || (health.equalsIgnoreCase("fair") || (health.equalsIgnoreCase("poor") || (health.equalsIgnoreCase("sick"))))) {
            return health;
        } else {
        throw new PersonControlException("Error: You must be one of these health status. Good, Fair, Poor, or Sick");
        }
    }
    public String occupation (String occupation) throws  PersonControlException{
        if (occupation.equalsIgnoreCase("farmer") || (occupation.equalsIgnoreCase("carpenter") || (occupation.equalsIgnoreCase("banker")))) {
            return occupation;
        } else {
        throw new PersonControlException("Error: You must be one of these occupations. Farmer, Carpenter, or Banker");
        }
    }

    public static Player createPlayer(String name) throws  PersonControlException {
        this.console.println("\n*** createPlayer() function called ****");
       if (name == null) {
            throw new PersonControlException("Error: You must enter a valid player name.");
        }

        Player player = new Player();
        player.setName(name);

        return player;
    }

}


