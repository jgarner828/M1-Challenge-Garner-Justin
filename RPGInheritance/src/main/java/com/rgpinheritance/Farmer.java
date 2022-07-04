package com.rgpinheritance;

public class Farmer extends Character {

    private boolean plowing = false;
    private boolean harvesting = false;

    public Farmer() {
        super();
        this.setStrength(75);
        this.setHealth(100);
        this.setStamina(75);
        this.setSpeed(10);
        this.setAttackPower(1);
        this.setRunning(false);
        this.setArrested(false);
    }


    public void attack(Character opponent) {
        opponent.setHealth(opponent.getHealth()-this.getAttackPower());
        System.out.println(this.getName() + " just attacked " + opponent);
    }

    public boolean isPlowing() {
        return plowing;
    }

    public void setPlowing(boolean plowing) {
        this.plowing = plowing;
    }

    public boolean isHarvesting() {
        return harvesting;
    }

    public void setHarvesting(boolean harvesting) {
        this.harvesting = harvesting;
    }
}
