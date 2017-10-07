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
 * */
public class GamePlayMenu implements Serializable {
    private String menuList;

public GamePlayMenu() {
    
}
    public void setMenuList(String menuList) {
        this.menuList = menuList;
    }

    public String getMenuList() {
        return menuList;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.menuList);
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
        final GamePlayMenu other = (GamePlayMenu) obj;
        if (!Objects.equals(this.menuList, other.menuList)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GamePlayMenu{" + "menuList=" + menuList + '}';
    }
    
}
