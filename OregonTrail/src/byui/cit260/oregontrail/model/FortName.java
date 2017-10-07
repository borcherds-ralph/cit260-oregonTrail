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
    
    private String ftname;
    private String ftlocation;

    FortName(String name, String location) {
        this.ftname = name;
        this.ftlocation = location;
    }

    public String getName() {
        return ftname;
    }

    public String getLocation() {
        return ftlocation;
    }
    

    @Override
    public String toString() {
        return "FortName{" + "name=" + ftname + ", location=" + ftlocation + '}';
    }

     
}