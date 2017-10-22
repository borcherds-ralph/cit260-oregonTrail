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
    /**
     * Test of getDayofWeek method, of class GamePlayerControl.
     */
    @Test
    public void testGetDayofWeek() {
        System.out.println("getDayofWeek");
        System.out.println("\tTest 1 - Valid data");
        int dayNumber = 0;
        GamePlayerControl instance = new GamePlayerControl();
        String expResult = "Sunday";
        String result = instance.getDayofWeek(dayNumber);
        assertEquals(expResult, result, "Sunday");
        
        System.out.println("\tTest 2 - Valid data");
        dayNumber = 1;
        expResult = "Monday";
        result = instance.getDayofWeek(dayNumber);
        assertEquals(expResult, result, "Monday");
        
        System.out.println("\tTest 3 - Valid data");
        dayNumber = 2;
        expResult = "Tuesday";
        result = instance.getDayofWeek(dayNumber);
        assertEquals(expResult, result, "Tuesday");
        
        System.out.println("\tTest 4 - Valid data");
        dayNumber = 3;
        expResult = "Wednesday";
        result = instance.getDayofWeek(dayNumber);
        assertEquals(expResult, result, "Wednesday");
        
        System.out.println("\tTest 5 - Valid data");
        dayNumber = 4;
        expResult = "Thursday";
        result = instance.getDayofWeek(dayNumber);
        assertEquals(expResult, result, "Thursday");
        
        System.out.println("\tTest 6 - Valid data");
        dayNumber = 5;
        expResult = "Friday";
        result = instance.getDayofWeek(dayNumber);
        assertEquals(expResult, result, "Friday");
        
        System.out.println("\tTest 7 - Valid data");
        dayNumber = 6;
        expResult = "Saturday";
        result = instance.getDayofWeek(dayNumber);
        assertEquals(expResult, result, "Saturday");
                
        System.out.println("/tTest 8 - inValid data");
        dayNumber = -1;
        expResult = "error";
        result = instance.getDayofWeek(dayNumber);
        assertEquals(expResult, result, "error");
        
        System.out.println("/tTest 9 - inValid data");
        dayNumber = 8;
        expResult = "error";
        result = instance.getDayofWeek(dayNumber);
        assertEquals(expResult, result, "error");
        
    }
    
}
