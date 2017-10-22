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
 * @author ralphb
 */
public class ItemControlTest {
    
    public ItemControlTest() {
    }

    /**
     * Test of calcVolumeOfBarrel method, of class ItemControl.
     */
    @Test
    public void testCalcVolumeOfBarrel() {
        System.out.println("calcVolumeOfBarrel");
        // ------ Test case 1 ---------
        System.out.println("\tCase #1");
        
        // degine input values
        double height = 10.0;
        double centerDiameter = 36.0;
        double topDiameter = 30.0;
        
        ItemControl instance = new ItemControl();
        
        // Define the expected Result
        double expResult = 2285.50;
        
        // Call the function
        double result = instance.calcVolumeOfBarrel(height, centerDiameter, topDiameter);
        
        // Test to see if the results returned equals the expected result
        assertEquals(expResult, result, 2285.50);
        
        // ------ Test case 2 ---------
        System.out.println("\tCase #2 - Incorrect Height");
        
        // degine input values
        height = -1.0;
        centerDiameter = 36.0;
        topDiameter = 30.0;
        
        
        // Define the expected Result
        expResult = -1.0;
        
        // Call the function
        result = instance.calcVolumeOfBarrel(height, centerDiameter, topDiameter);
        
        // Test to see if the results returned equals the expected result
        assertEquals(expResult, result, -1.0);
        
        // ------ Test case 3 ---------
        System.out.println("\tCase #3 incorrect center diameter");
        
        // degine input values
        height = 10.0;
        centerDiameter = 37.0;
        topDiameter = 30.0;
        
        
        // Define the expected Result
        expResult = -1.0;
        
        // Call the function
        result = instance.calcVolumeOfBarrel(height, centerDiameter, topDiameter);
        
        // Test to see if the results returned equals the expected result
        assertEquals(expResult, result, -1.0);
        
        // ------ Test case 4 ---------
        System.out.println("\tCase #4 - Incorrect top diameter");
        
        // degine input values
        height = 10.0;
        centerDiameter = 36.0;
        topDiameter = 35.0;
        
        
        // Define the expected Result
        expResult = -1.0;
        
        // Call the function
        result = instance.calcVolumeOfBarrel(height, centerDiameter, topDiameter);
        
        // Test to see if the results returned equals the expected result
        assertEquals(expResult, result, -1.0);        
    }

    /**
     * Test of calcWeightOfItem method, of class ItemControl.
     */
    @Test
    public void testCalcWeightOfItem() {
        System.out.println("calcWeightOfItem");
        System.out.println("\tTest 1 - Valid");
        int qty = 3;
        int weight = 4;
        ItemControl instance = new ItemControl();
        double expResult = 12.0;
        double result = instance.calcWeightOfItem(qty, weight);
        assertEquals(expResult, result, 12.0);
        
        System.out.println("\tTest 2 - inValid qty");
        qty = -1;
        weight = 4;
        expResult = -1.0;
        result = instance.calcWeightOfItem(qty, weight);
        assertEquals(expResult, result, -1.0);
        
        System.out.println("\tTest 3 - inValid weight");
        qty = 3;
        weight = 0;
        expResult = -1.0;
        result = instance.calcWeightOfItem(qty, weight);
        assertEquals(expResult, result, -1.0);
        
        System.out.println("\tTest 3 - inValid weight");
        qty = 3;
        weight = 300;
        expResult = -1.0;
        result = instance.calcWeightOfItem(qty, weight);
        assertEquals(expResult, result, -1.0);
    }

    /**
     * Test of calcBarrelVolumeToGallons method, of class ItemControl.
     */
    @Test
    public void testCalcBarrelVolumeToGallons() {
        System.out.println("calcBarrelVolumeToGallons");
        System.out.println("\tTest 1 - Valid Volume");
        double barrelvolume = 231.0;
        ItemControl instance = new ItemControl();
        double expResult = 1.0;
        double result = instance.calcBarrelVolumeToGallons(barrelvolume);
        assertEquals(expResult, result, 1.0);
        
        System.out.println("\tTest 2 - too small Volume");
        barrelvolume = 50.0;
        expResult = -1.0;
        result = instance.calcBarrelVolumeToGallons(barrelvolume);
        assertEquals(expResult, result, -1.0);
        
        
        System.out.println("\tTest 3 - too large Volume");
        barrelvolume = 10400.0;
        expResult = -1.0;
        result = instance.calcBarrelVolumeToGallons(barrelvolume);
        assertEquals(expResult, result, -1.0);
    }

    /**

     * Test of calcCylinderVolume method, of class ItemControl.
     */
    @Test
    public void testCalcCylinderVolume() {
        System.out.println("calcCylinderVolume");
        System.out.println("\tTest 1 - Valid data");
        double diameter = 20.0;
        double height = 30.0;
        ItemControl instance = new ItemControl();
        double expResult = 9424.77796076938;
        double result = instance.calcCylinderVolume(diameter, height);
        assertEquals(expResult, result, 9424.77796076938);
        
        System.out.println("\tTest 2 - inValid Diameter too low");
        diameter = 0.0;
        height = 30.0;
        expResult = -1.0;
        result = instance.calcCylinderVolume(diameter, height);
        assertEquals(expResult, result, -1.0);
        
        System.out.println("\tTest 3 - inValid Diameter too high");
        diameter = 30.0;
        height = 30.0;
        expResult = -1.0;
        result = instance.calcCylinderVolume(diameter, height);
        assertEquals(expResult, result, -1.0);
        
        System.out.println("\tTest 4 - inValid Height too high");
        diameter = 10.0;
        height = 60.0;
        expResult = -1.0;
        result = instance.calcCylinderVolume(diameter, height);
        assertEquals(expResult, result, -1.0);
        
        System.out.println("\tTest 5 - inValid Height too low");
        diameter = 10.0;
        height = 0.0;
        expResult = -1.0;
        result = instance.calcCylinderVolume(diameter, height);
        assertEquals(expResult, result, -1.0);
        
    }
    
@Test
    public void testItemCost() {
        System.out.println("ItemCost");
        System.out.println("\tTest #1 - Correct Values");
        double itemCost = 10.0;
        int qnty = 1;
        ItemControl instance = new ItemControl();
        double expResult = 10.0;
        double result = instance.getItemCost(qnty, itemCost);
        assertEquals(expResult, result, 10.0);
        
        System.out.println("\tTest #2 - Cost out of bound - too low");
        itemCost = -10.0;
        qnty = 1;
        expResult = -1.0;
        result = instance.getItemCost(qnty, itemCost);
        assertEquals(expResult, result, -1.0);
        
        System.out.println("\tTest #3 - qty out of bound - too low");
        itemCost = 10.0;
        qnty = -1;
        expResult = -1.0;
        result = instance.getItemCost(qnty, itemCost);
        assertEquals(expResult, result, -1.0);
        
    }

    /**
     * Test of ItemCost method, of class ItemControl.
     */
    /*
    @Test
    public void testgetItemName() {
        System.out.println("ItemName");
        System.out.println("\tTest #1 - Correct Value");
        String itemTag = "Rope";
        ItemControl instance = new ItemControl();
        String expResult = "Rope";
        String result = instance.getNames(itemTag);
        System.out.println("\tReturned: " + result);
        assertEquals(expResult, result, "Rope");
        
        System.out.println("\tTest #2 - InCorrect Value");
        itemTag = "Alum234";
        expResult = "error";
        System.out.println("\tRequest Alum");
        result = instance.getNames(itemTag);
        System.out.println("\tReturned: " + result);
        assertEquals(expResult, result, "Alum");
    } */
}
