package Esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<Integer> random = new ArrayList<>();
        random = randomList(10);

        System.out.println("lista ordinata numeri casuali: ");
        for (int i : random) {
            System.out.println(i);
        }


    }

    public static ArrayList<Integer> randomList(int n) {
        ArrayList<Integer> lista = new ArrayList<>();

        for(int i = 0; i < n; i++) { //inserisci n numeri casuali all'interno della lista
            int numeroCasuale = (int) (Math.random() * 101);
            lista.add(numeroCasuale);
        }

        //ordiniamo la lista
        Collections.sort(lista);

        return lista;
    }
}