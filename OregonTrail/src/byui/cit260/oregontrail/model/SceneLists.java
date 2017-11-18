/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;

import java.io.Serializable;
/**
 *
 * @author Br33h3rr3ra
 */
    public class SceneLists implements Serializable {
   
    private String scene;
    private String description;
    private String mapSymbol;
    private double travelTime;
    
   
    public SceneLists() {
    }

    public SceneLists(String scene, String description, String mapSymbol, double TravelTime){
        this.scene = scene;
        this.description = description;
        this.mapSymbol = mapSymbol;
        this.travelTime = TravelTime;
          
    }

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }
    }
    
