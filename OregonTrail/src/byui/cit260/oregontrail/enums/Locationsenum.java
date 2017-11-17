/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.enums;

/**
 *
 * @author Casey
 */
public enum Locationsenum {
    
//the milage here is the miles it takes to arrive at these locations
    Independence("Independence", "Town", 0),
    FortLaramie("Laramie", "Fort", 700),
    OregonCity("Oregon City", "Town", 2500),
    FortWallaWalla("Fort Walla Walla", "Fort", 2250);
    
     public final String LocationName;
     private final String LocationType;
     public final int LocationMilage;
    
     Locationsenum(String Name, String Type, int milage) {
            LocationName = Name;
            LocationType = Type;
            LocationMilage = milage;
        }

        public String getLocationName() {
            return LocationName;
        }

        public String getLocationTypeName() {
            return LocationType;
        }

        public int getLocationMilage(){
            return LocationMilage;
        }

}
