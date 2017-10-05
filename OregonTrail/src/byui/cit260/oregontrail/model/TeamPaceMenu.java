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
public class TeamPaceMenu implements Serializable {
    private String slow;
    private String average;
    private String fast;
    
public TeamPaceMenu() {
    
}

    public void setSlow(String slow) {
        this.slow = slow;
    }

    public void setAverage(String average) {
        this.average = average;
    }

    public void setFast(String fast) {
        this.fast = fast;
    }

    public String getSlow() {
        return slow;
    }

    public String getAverage() {
        return average;
    }

    public String getFast() {
        return fast;
    }
}