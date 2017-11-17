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
    Independence("Independence", "Missouri", 0),
    FortLaramie("Laramie", "Wyoming", 700),
    OregonCity("Oregon City", "Oregon", 2500),
    FortWallaWalla("Fort Walla Walla", "Washington", 2250);
    
     public final String LocationName;
     private final String LocationState;
     private final int Locationmilage;
    
     Locationsenum(String Name, String State, int milage) {
            LocationName = Name;
            LocationState = State;
            Locationmilage = milage;
        }

        public String getLocationName() {
            return LocationName;
        }

        public String getItemName() {
            return LocationState;
        }

        public int getLocationMilage(){
            return Locationmilage;
        }

}
