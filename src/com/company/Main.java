package com.company;

public class Main {

    public static void main(String[] args) {
    Magic magic = new Magic(60,200,"NatureKinesis");
    Medic medic = new Medic(50,200,"Heal");
    Warrior warrior = new Warrior(60,200,"CRITICAL DAMAGE");
        HavingSuperAbility [ ] havingSuperAbilities = {magic,medic,warrior};
        for (int i = 0; i < havingSuperAbilities.length; i++) {
            AllPowers(havingSuperAbilities[i]);

        }
    }
    public static void AllPowers(HavingSuperAbility havingSuperAbility){
        System.out.println(havingSuperAbility.applySuperAbility(" is using Power: "));
    }
}
