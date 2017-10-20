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
public class SupplyControlTest {
    
    public SupplyControlTest() {
    }

    /**
     * Test of getweight method, of class SupplyControl.
     */
    @Test
    public void testGetweight() {
        System.out.println("getweight");
        int weight = 0;
        SupplyControl instance = new SupplyControl();
        double expResult = 0.0;
        double result = instance.getweight(weight);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SupplyControl method, of class SupplyControl.
     */
    @Test
    public void testSupplyControl() {
        System.out.println("SupplyControl");
        int cost = 0;
        SupplyControl instance = new SupplyControl();
        double expResult = 0.0;
        double result = instance.SupplyControl(cost);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
