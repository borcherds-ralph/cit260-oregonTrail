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
public class HelpMenu implements Serializable {
    private String tips;
    private String returnPrevious;
    
public HelpMenu() {
    
}

    public void setTips(String tips) {
        this.tips = tips;
    }

    public void setReturnPrevious(String returnPrevious) {
        this.returnPrevious = returnPrevious;
    }

    public String getTips() {
        return tips;
    }

    public String getReturnPrevious() {
        return returnPrevious;
    }
}