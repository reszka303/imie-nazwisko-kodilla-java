package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
    boolean end = false;
    int wynik1 = 0;
    int wynik2 = 0;
    GameProcessor game = new GameProcessor();
    game.menu();
        System.out.println("Podaj swoje imię: ");
        Scanner name = new Scanner(System.in);
        String nick = name.nextLine();
        Gamer gamer1 = new Gamer(nick);
        Gamer gamer2 = new Gamer("Computer");

        while (!end) {
            System.out.println("Podaj ile rund chcesz rozegrać");

        }

    }
}
