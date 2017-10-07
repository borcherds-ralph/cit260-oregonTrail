/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Br33h3rr3ra
 */
public class HelpMenu implements Serializable {
    private String tips;
    private String returnPrevious;

    public HelpMenu() {
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    public String getReturnPrevious() {
        return returnPrevious;
    }

    public void setReturnPrevious(String returnPrevious) {
        this.returnPrevious = returnPrevious;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.tips);
        hash = 37 * hash + Objects.hashCode(this.returnPrevious);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HelpMenu other = (HelpMenu) obj;
        if (!Objects.equals(this.tips, other.tips)) {
            return false;
        }
        if (!Objects.equals(this.returnPrevious, other.returnPrevious)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HelpMenu{" + "tips=" + tips + ", returnPrevious=" + returnPrevious + '}';
    }
    

}