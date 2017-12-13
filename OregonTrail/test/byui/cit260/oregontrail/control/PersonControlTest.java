/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;

import byui.cit260.oregontrail.model.Player;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Br33h3rr3ra
 */
public class PersonControlTest {
    
    public PersonControlTest() {
    }

   
    /**
     * Test of personcount method, of class PersonControl.
     */
    @Test
    public void testPersoncount() {
        System.out.println("personcount");
        int personcount = 0;
        PersonControl instance = new PersonControl();
        int expResult = -1;
        //int result = instance.personcount(personcount);
        //assertEquals(expResult, result);
    }

    /**
     * Test of age method, of class PersonControl.
     */
    @Test
    public void testAge() {
        //valid test
        System.out.println("age");
        int age = 25;
        PersonControl instance = new PersonControl();
        int expResult = 25;
        //int result = instance.age(age);
       // assertEquals(expResult, result);
        System.out.println(age);
        

 //bad test
        System.out.println("age");
        age = -25;
        expResult = -1;
       // result = instance.age(age);
       // assertEquals(expResult, result);
        System.out.println(age);

        //valid test
        System.out.println("age");
        age = 98;
        expResult = 98;
        //result = instance.age(age);
       // assertEquals(expResult, result);
        System.out.println(age);
    }
    /**
     * Test of gender method, of class PersonControl.
     */
    @Test
    public void testGender() {
        //valid input
        System.out.println("gender");
        String gender = "male";
        PersonControl instance = new PersonControl();
        String expResult = "male";
       // String result = instance.genderentry(gender);
       // assertEquals(expResult, result);

        //invalid input
        System.out.println("gender");
        gender = "helicopter";
        expResult = "Error -1";
       // result = instance.genderentry(gender);
       // assertEquals(expResult, result);
    }

    /**
     * Test of health method, of class PersonControl.
     */
    @Test
    public void testHealth() {
        //valid input
        System.out.println("health");
        String health = "sick";
        PersonControl instance = new PersonControl();
        String expResult = "sick";
      //  String result = instance.health(health);
      //  assertEquals(expResult, result);
    }

    /**
     * Test of occupation method, of class PersonControl.
     */
    @Test
    public void testOccupation() {
        //valid input
        System.out.println("occupation");
        String occupation = "banker";
        PersonControl instance = new PersonControl();
        String expResult = "banker";
      //  String result = instance.occupation(occupation);
      //  assertEquals(expResult, result);
    }
    
}
