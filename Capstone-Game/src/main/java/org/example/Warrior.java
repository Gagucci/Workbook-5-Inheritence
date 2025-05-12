package org.example;

public class Warrior extends Character {

    void hpSpinAttack(Character target) {
        System.out.println(name + " unleashes HP SPINNING ATTACK!  " + target.name + " is wiped out instantly!");
        target.hp = 0;
    }

    public Warrior(String name, int hp, int attack) {
        super(name, hp, attack);
    }


}


