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
public class GamePlayerControlTest {
    
    public GamePlayerControlTest() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDayofWeek method, of class GamePlayerControl.
     */
    @Test
    public void testGetDayofWeek() {
        System.out.println("getDayofWeek");
        System.out.println("\tTest 1 - Valid data");
        int dayNumber = 0;
        GamePlayerControl instance = new GamePlayerControl();
        String expResult = "";
        String result = instance.getDayofWeek(dayNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        System.out.println("/tTest 2 - inValid data");
        dayNumber = -1;
        expResult = null;
        result = instance.getDayofWeek(dayNumber);
        assertEquals(expResult, result, null);
        
        System.out.println("/tTest 3 - inValid data");
        dayNumber = 8;
        expResult = null;
        result = instance.getDayofWeek(dayNumber);
        assertEquals(expResult, result, null);
        
    }
    
}
