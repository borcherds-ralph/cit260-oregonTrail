/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Casey
 */
public class MainMenu implements Serializable {
    private String welcome;
    private char choice;

    public MainMenu() {
    }

    public String getWelcome() {
        return welcome;
    }

    public void setWelcome(String welcome) {
        this.welcome = welcome;
    }

    public char getChoice() {
        return choice;
    }

    public void setChoice(char choice) {
        this.choice = choice;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.welcome);
        hash = 29 * hash + this.choice;
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
        final MainMenu other = (MainMenu) obj;
        if (this.choice != other.choice) {
            return false;
        }
        if (!Objects.equals(this.welcome, other.welcome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MainMenu{" + "welcome=" + welcome + ", choice=" + choice + '}';
    }
    
}
