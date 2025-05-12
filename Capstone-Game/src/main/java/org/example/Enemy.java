package org.example;

public class Enemy extends Character {

    public Enemy(String name, int hp, int attack) {
        super(name, hp, attack);
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
                heal();
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


