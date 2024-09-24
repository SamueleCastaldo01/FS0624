import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Proviamo");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero da 0 a 3: ");
        String numero = scanner.nextLine();

        switch (numero) {
            case "0":
                System.out.println("zero");
                break;
            case "1":
                System.out.println("uno");
                break;
            case "2":
                System.out.println("due");
                break;
            case "3":
                System.out.println("tre");
                break;
            default:
                System.out.println("Errore nell'inserimento");
                break;
        }

        //Esercizio 3
        String s = "";
        while(!s.equals(":q")) {
            String conc = "";
            System.out.print("Inserisci una stringa: ");
             s = scanner.nextLine();
            for(int i =0; i < s.length(); i++) {
                conc += s.charAt(i) + ",";
            }
            System.out.println(conc);
        }

        //Esercizio 4
        System.out.print("Inserisci un numero per il conto alla rovescia: ");
        int numRovescia = scanner.nextInt();

        for(int i = numRovescia; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static boolean stringaParioDispari(String s) {
        if(s.length() % 2 == 0 ) {  //lunghezza pari
            return true;
        } else {
            return false;
        }
    }

    public static boolean annoBisestile(int n) {
        if(n % 4 == 0) {
            return true;
        } else if (n % 100 == 0) {
            return true;
        }else {
            return false;
        }
    }

}