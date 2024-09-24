import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------------Esercizo 1-------------------------");
        // Prodotto e concatenazione
        int risultato = prodotto(5, 10);
        System.out.println("Il risultato è: " + risultato);

        String riString = concatena("Ciao", 2);
        System.out.println(riString);

        // Dichiarazione dell'array nomi
        String[] nomi = new String[5];
        nomi[0] = "Mario";
        nomi[1] = "Luigi";
        nomi[2] = "Peach";
        nomi[3] = "Peaky";
        nomi[4] = "Cosa devo fare";


        // Inseriamo un nuovo nome alla terza posizione
        nomi = inserisciInArray(nomi, "Toad");

        // Stampa dell'array aggiornato
        for (String nome : nomi) {
            System.out.println(nome);
        }

        System.out.println("----------------Esercizo 2-------------------------");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci la prima Stringa: ");
        String s1 = scanner.nextLine();

        // Leggi un numero intero dall'utente
        System.out.print("Inserisci la seconda Stringa: ");
        String s2 = scanner.nextLine();

        // Leggi un numero a virgola mobile (double) dall'utente
        System.out.print("Inserisci per la terza Stringa: ");
        String s3 = scanner.nextLine();

        System.out.println(s1 + s2+ s3);
        System.out.println(s3 + s2 + s1);

        System.out.println("----------------Esercizo 3-------------------------");
        double risPerimetro = perimetroRettangolo(2, 4);
        System.out.println("Perimetro del rettangolo: " + risPerimetro);

    }

    public static int prodotto(int x, int y) {
        return x * y;
    }

    public static String concatena(String s, int x) {
        return s + x;
    }

    // Metodo per inserire un nuovo valore nell'array alla terza posizione
    public static String[] inserisciInArray(String[] x, String s) {
        String[] ss = new String[x.length + 1];

        for (int i = 0; i < ss.length; i++) {
            if (i == 2) {  // Inseriamo il nuovo elemento alla terza posizione (indice 2)
                ss[i] = i + " " + s;
            } else if (i < 2) {
                ss[i] = i + " " + x[i];
            } else {
                ss[i] = i + " " + x[i - 1]; // Spostiamo gli elementi successivi di una posizione
            }
        }

        return ss;
    }

    //Esercizio 3..............................................
    public static double perimetroRettangolo(double x, double y) {
        return 2 * (x + y);
    }


} //end
