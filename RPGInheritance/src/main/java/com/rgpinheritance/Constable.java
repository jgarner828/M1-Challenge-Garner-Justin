package com.rgpinheritance;

public class Constable extends Character{

    boolean jurisdiction;

    public Constable() {
        super();
        this.setStrength(60);
        this.setHealth(100);
        this.setStamina(60);
        this.setSpeed(20);
        this.setAttackPower(5);
        this.setRunning(false);
        this.setArrested(false);
    }

    public boolean getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(boolean jurisdiction) {
        this.jurisdiction = jurisdiction;
    }


    public void attack(Character opponent) {
        opponent.setHealth(opponent.getHealth()-this.getAttackPower());
        System.out.println(this.getName() + " just attacked " + opponent);
    }


    public void arrestCharacter(Character criminal) {
        if(this.getJurisdiction()) {
            criminal.setArrested(true);
            System.out.println(this.getName() + " has arrested the outlaw named " + criminal.getName() + "!");
        } else {
            System.out.println(this.getName() + " has no jurisdiction here! Time for payback! says " + criminal.getName());
            criminal.attack(this);
        }


    }
}
