/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;


/**
 *
 * @author ralphb
 */
public enum RiverName {
    Missisppi("Mississippi River", 300),
    Colorado("Colorado River", 150);
    
    private String name;
    private int width;

    RiverName(String name, int width) {
        this.name = name;
        this.width = width;
}

    public String getName() {
        return name;
    }

    public int getWidth() {
        return width;
    }
    
    
    
}
