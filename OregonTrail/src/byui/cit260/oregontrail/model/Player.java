/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;

import byui.cit260.oregontrail.control.PersonControl.gender;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author ralphb
 */
public class Player implements Serializable {
    private String name;
    private int age;
    private int health;

    private String occupation;
    private double money;
    private boolean living;
    private String gender;

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public boolean isLiving() {
        return living;
    }

    public void setLiving(boolean living) {
        this.living = living;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + this.age;
        hash = 71 * hash + this.health;
        hash = 71 * hash + Objects.hashCode(this.occupation);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.money) ^ (Double.doubleToLongBits(this.money) >>> 32));
        hash = 71 * hash + (this.living ? 1 : 0);
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
        final Player other = (Player) obj;
        if (this.age != other.age) {
            return false;
        }
        if (this.health != other.health) {
            return false;
        }
        if (this.gender != other.gender) {
            return false;
        }
        if (Double.doubleToLongBits(this.money) != Double.doubleToLongBits(other.money)) {
            return false;
        }
        if (this.living != other.living) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.occupation, other.occupation)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", age=" + age + ", health=" + health + ", gender=" + gender + ", occupation=" + occupation + ", money=" + money + ", living=" + living + '}';
    }

    
    
}
