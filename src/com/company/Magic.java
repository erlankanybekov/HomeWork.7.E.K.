package com.company;

public class Magic extends Hero{


    public Magic(int damage, int health, String superPowerType) {
        super(damage, health, superPowerType);
    }



    @Override
    public String applySuperAbility(String SuperAbilityType) {
        return "Magic is using Fireball";
    }
}

