package org.example.rpg;

public abstract class Monster {
    public  String name;
    public int hitPoints;
    public double damage;

    public Monster(String name, double damage, int hitPoints) {
        this.name = name;
        this.damage = damage;
        this.hitPoints = hitPoints;
    }
    public  abstract double attack();
    public String getName() {
        return name;
    }

    public double getDamage() {
        return damage;
    }

    public int getHitPoints() {
        return hitPoints;
    }

}
