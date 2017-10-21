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
 * @author Casey
 */
public class SupplyControlTest {
    
    public SupplyControlTest() {
    }

    /**
     * Test of getweight method, of class SupplyControl.
     */
    @Test
    public void testGetweight() {
        //vaild input
        System.out.println("getweight");
        int weight = 5;
        SupplyControl instance = new SupplyControl();
        double expResult = 5;
        double result = instance.getweight(weight);
        assertEquals(expResult, result, 0.0);
        
        //invaild input 
        System.out.println("getweight");
        weight = -3;
        expResult = -1;
        result = instance.getweight(weight);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of SupplyControl method, of class SupplyControl.
     */
    @Test
    public void testSupplyControl() {
        //vaild input
        System.out.println("SupplyControl");
        int cost = 2;
        SupplyControl instance = new SupplyControl();
        double expResult = 2;
        double result = instance.SupplyControl(cost);
        assertEquals(expResult, result, 0.0);
        
               //invaild input
        System.out.println("SupplyControl");
        cost = -2;
        expResult = -1;
        result = instance.SupplyControl(cost);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of DailySupplyConsumption method, of class SupplyControl.
     */
    @Test
    public void testDailySupplyConsumption() {
        //vaild 
        System.out.println("DailySupplyConsumption");
        double suppliessubtracted = 0.0;
        int teamPace = 1;
        int sizeofparty = 4;
        SupplyControl instance = new SupplyControl();
        double expResult = 12;
        double result = instance.DailySupplyConsumption(suppliessubtracted, teamPace, sizeofparty);
        assertEquals(expResult, result, 0.0);

        //invalid input from other methods
                System.out.println("DailySupplyConsumption");
        suppliessubtracted = 0.0;
        teamPace = 8;
        sizeofparty = 8;
        expResult = -1;
        result = instance.DailySupplyConsumption(suppliessubtracted, teamPace, sizeofparty);
        assertEquals(expResult, result, 0.0);
    }
    
}
