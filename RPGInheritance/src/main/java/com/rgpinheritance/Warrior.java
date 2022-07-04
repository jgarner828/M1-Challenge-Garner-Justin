package com.rgpinheritance;

public class Warrior extends Character {

    int shieldStrength;

    public Warrior() {
        super();
        this.setStrength(75);
        this.setHealth(100);
        this.setStamina(100);
        this.setSpeed(50);
        this.setAttackPower(10);
        this.setShieldStrength(100);
        this.setRunning(false);
        this.setArrested(false);
    }


    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    public void attack(Character opponent) {
        opponent.setHealth(opponent.getHealth()-this.getAttackPower());
        System.out.println(this.getName() + " just attacked " + opponent);
    }
}
