package com.company;

public abstract class Hero implements HavingSuperAbility{
    private int damage;
    private int health;
    String SuperPowerType;

    public Hero(int damage, int health, String superPowerType) {
        this.damage = damage;
        this.health = health;
        SuperPowerType = superPowerType;
    }
}
