/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;

import byui.cit260.oregontrail.model.Item;

import java.util.Random;

/**
 *
 * @author ralphb
 */
public class ItemControl {

     
    public double calcVolumeOfBarrel(double height, double centerDiameter, double topDiameter ){
    
        if(height <= 0) { // height is negative?
            return -1;
        }
        if(centerDiameter <= 0 || centerDiameter > 36) { // diameter is out of range
            return -1;
        }
        double radius = centerDiameter / 2;
        double middradius = topDiameter / 2;
        double volume = ((Math.PI * height)/ 12) * (2 * Math.pow(middradius,2) + Math.pow(radius, 2));
                
        return volume;
    }
    
    public double calcWeightOfItem() {
        return -1;
    }
    

    
    
    
}
