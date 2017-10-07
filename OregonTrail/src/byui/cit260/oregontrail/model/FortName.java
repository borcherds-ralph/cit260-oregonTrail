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
    
    WallaWalla("Fort Walla Walla", 300),
    Churchill("Fort Churchill", 150);
    private String name;
    private String location;

    FortName(String name, String location) {
        this.name = name;
        this.location = location;
    }
}