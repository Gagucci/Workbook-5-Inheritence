package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Warrior player = new Warrior("YearUp Warrior", 40, 8);
        Enemy monster = new Enemy("NullPointerException", 30, 6);

        System.out.println(" Welcome to the Code Dungeon!");
        System.out.println("A wild " + monster.name + " appears!\n");

        while (player.isAlive() && monster.isAlive()) {
            System.out.println("\nYour HP: " + player.hp + " | Enemy HP: " + monster.hp);
            System.out.println("Choose an action:");
            System.out.println("1. Attack");
            System.out.println("2. Fireball");
            System.out.println("3. Heal");
            System.out.println("4. HP Spin Attack");
            System.out.println("5. Run");
            System.out.println("Enter your choice: ");

            String choice = input.nextLine();

            switch (choice) {
                case "1":
                    player.attack(monster);
                    if (monster.isAlive()) {
                        monster.makeMove(player);
                    } else {
                        System.out.println(monster.name + " has been defeated!");
                    }
                    break;
                case "2":
                    player.fireball(monster);
                    if (monster.isAlive()) {
                        monster.makeMove(player);
                    } else {
                        System.out.println(monster.name + " has been defeated!");
                    }
                    break;
                case "3":
                    player.heal();
                    if (monster.isAlive()) {
                        monster.makeMove(player);
                    } else {
                        System.out.println(monster.name + " has been defeated!");
                    }
                    break;
                case "4":
                    player.hpSpinAttack(monster);
                    if (monster.isAlive()) {
                        monster.makeMove(player);
                    } else {
                        System.out.println(monster.name + " has been defeated!");
                    }
                    break;
                case "5":
                    player.run();
                    if (monster.isAlive()) {
                        monster.makeMove(player);
                    } else {
                        System.out.println(monster.name + " has been defeated!");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}