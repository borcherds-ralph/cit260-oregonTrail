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
    private String pace;

    public TeamPaceMenu() {
    }

    public String getPace() {
        return pace;
    }

    public void setPace(String pace) {
        this.pace = pace;
    }
    

    
}