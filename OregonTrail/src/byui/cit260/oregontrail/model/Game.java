/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;

import byui.cit260.oregontrail.control.MapControl;
import java.io.Serializable;

/**
 *
 * @author ralphb
 */
public class Game implements Serializable {
    
    private double totalTime;
   
    private Player player;
    private InventoryItem[] inventory; 
    private Wagon wagon;
    private Map map;
   
    

    public Game() {
        this.totalTime = 0;
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }
    
    public InventoryItem[] getInventory() {
        return inventory;
    }

    public void setInventory(InventoryItem[] inventory) {
        this.inventory = inventory;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }


    public Wagon getWagon() {
        return wagon;
    }

    public void setWagon(Wagon wagon) {
        this.wagon = wagon;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
     public void createMap(MapControl map) {
	System.out.println("Map has been created");
	
    }
    
    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", player=" + player.toString() + '}';
    }

   
   
    
}
