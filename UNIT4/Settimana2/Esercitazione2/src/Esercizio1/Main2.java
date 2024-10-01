package Esercizio1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int n = 0;
        int nParoleDistinte = 0;
        ArrayList<String> lista = new ArrayList<>();
        HashSet<String> paroleDistinte = new HashSet<>();
        HashSet<String> paroleDuplicate = new HashSet<>();
        boolean flagDupli = false;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un intero: ");
        n = scanner.nextInt();

        // Consuma il carattere di nuova riga rimanente dopo nextInt()
        scanner.nextLine();

        for(int i = 0; i < n; i++) {
            System.out.print("Inserisci una parola: ");
            String s = scanner.nextLine();  // Ora funziona correttamente
            lista.add(s);
        }

        // Stampa tutte le parole duplicate; errore mi compare due volte
        for (String parola : lista) {  //vuol dire in questo caso che è gia presente
            if(paroleDistinte.add(parola)) {
                paroleDistinte.add(parola);  //qui ci sono le parole uniche
            }else {
                paroleDuplicate.add((parola)); //qui invece abbiamo le parole duplicate, una sola volta
            }
        }

        System.out.println("parole duplicate: ");
        for(String parole : paroleDuplicate) {
            System.out.println(parole);
        }
        System.out.println("---------------------");

        System.out.println("numero parole distinte: " + paroleDistinte.size());
        System.out.println("parole distinte: ");
        for(String parole : paroleDistinte) {
            System.out.println(parole);
        }
        System.out.println("---------------------");





        scanner.close();  // Chiudi lo scanner
    }
}
