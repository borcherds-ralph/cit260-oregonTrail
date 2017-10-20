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
        //working test
        System.out.println("getweight");
        int weight = 15;
        SupplyControl instance = new SupplyControl();
        double expResult = 15;
        double result = instance.getweight(weight);
        assertEquals(expResult, result, 0.0);

        //invalid test
        System.out.println("getweight");
        weight = -5;
        expResult = -1;
        result = instance.getweight(weight);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of SupplyControl method, of class SupplyControl.
     */
    @Test
    public void testSupplyControl() {
        
        //valid test
        System.out.println("SupplyControl");
        int cost = 75;
        SupplyControl instance = new SupplyControl();
        double expResult = 75;
        double result = instance.SupplyControl(cost);
        assertEquals(expResult, result, 0.0);

        //invalid test
                System.out.println("SupplyControl");
        cost = -50;
        expResult = -1;
        result = instance.SupplyControl(cost);
        assertEquals(expResult, result, 0.0);
    }
    
}
