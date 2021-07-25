package com.company;

public class Warrior extends Hero{


    public Warrior(int damage, int health, String superPowerType) {
        super(damage, health, superPowerType);
    }



    @Override
    public String applySuperAbility(String SuperAbilityType) {
        return "Warrior" + SuperAbilityType + "Critical Damage";
    }
}

