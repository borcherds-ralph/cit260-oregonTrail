/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;

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
     * Test of name method, of class PersonControl.
     */
    @Test
    public void testName() {
        System.out.println("name");
        String name = "";
        PersonControl instance = new PersonControl();
        String expResult = "";
        String result = instance.name(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of personcount method, of class PersonControl.
     */
    @Test
    public void testPersoncount() {
        System.out.println("personcount");
        int personcount = 0;
        PersonControl instance = new PersonControl();
        int expResult = 0;
        int result = instance.personcount(personcount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of age method, of class PersonControl.
     */
    @Test
    public void testAge() {
        System.out.println("age");
        int age = 0;
        PersonControl instance = new PersonControl();
        int expResult = 0;
        int result = instance.age(age);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gender method, of class PersonControl.
     */
    @Test
    public void testGender() {
        System.out.println("gender");
        String gender = "";
        PersonControl instance = new PersonControl();
        String expResult = "";
        String result = instance.gender(gender);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of health method, of class PersonControl.
     */
    @Test
    public void testHealth() {
        System.out.println("health");
        String health = "";
        PersonControl instance = new PersonControl();
        String expResult = "";
        String result = instance.health(health);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
