package org.example;

public class Enemy extends Character {

    public Enemy(String name, int hp, int attack) {
        super(name, hp, attack);
    }

    void stealHealth(Character target) {
        int stealAmount = 5;
        System.out.println(name + " steals " + stealAmount + " HP from " + target.name + "!");
        hp += stealAmount;
        target.hp -= stealAmount;
    }

    void makeMove(Character target) {

        int move = (int) (Math.random() * 5);
        switch (move) {
            case 0:
                attack(target);
                break;
            case 1:
                block();
                break;
            case 2:
                stealHealth(target);
                break;
            case 3:
                run();
                break;
            case 4:
                fireball(target);
                break;
            default:
                System.out.println(name + " is confused and does nothing!");
        }
    }
}


