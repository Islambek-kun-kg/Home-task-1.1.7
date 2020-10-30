package com.company;

import com.company.Heroes.Magic;
import com.company.Heroes.Medic;
import com.company.Heroes.Warrior;

public class Main {

    public static void main(String[] args) {
        HavingSuperAbility hero[] = {new Magic(), new Medic(), new Warrior()};
        for (int i = 0; i < hero.length; i++) {
            superAbilityUse(hero[i]);

        }

    }

    public static void superAbilityUse(HavingSuperAbility use) {

        System.out.println(use.applySuperAbility(""));

    }
}
