package com.company;

public class Medic extends Hero{


    public Medic(int damage, int health, String superPowerType) {
        super(damage, health, superPowerType);
    }





    @Override
    public String applySuperAbility(String SuperAbilityType) {
        return "Medic" + SuperAbilityType + "Healing";
    }
}
