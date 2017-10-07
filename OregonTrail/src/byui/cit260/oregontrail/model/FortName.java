/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;

/**
 *
 * @author Br33h3rr3ra
 */
public enum FortName {
    
    WallaWalla("Fort Walla Walla", "Walla Walla"),
    Churchill("Fort Churchill", "Silver Springs");
    
    private String name;
    private String location;

    FortName(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
    

    @Override
    public String toString() {
        return "FortName{" + "name=" + name + ", location=" + location + '}';
    }
    
    
}