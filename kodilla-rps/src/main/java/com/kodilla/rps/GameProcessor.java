package com.kodilla.rps;

import java.util.Scanner;

public class GameProcessor {
    public void menu() {
        System.out.println("==========>> GRA W PAPIER, KAMIEŃ, NOŻYCE <<==========");
        System.out.println();
        System.out.println("Zagranie kamień - klawisz '1'");
        System.out.println("Zagranie papier - klawisz '2'");
        System.out.println("Zagranie nożyce - klawisz '3'");
        System.out.println(">> Nowa gra - klawisz 'n");
        System.out.println(">> Koniec gry - klawisz 'x");

        System.out.println();
    }

    public int scanerInt() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        return x;
    }


}
