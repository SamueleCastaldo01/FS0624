public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        /*  se non è astratta la classe. Esercizio 1
        DIpendente dipendente1 = new DIpendente("001", 2000.00, "PRODUZIONE");
        DIpendente dipendente2 = new DIpendente("002", 2500.50, "AMMINISTRAZIONE");
        DIpendente dipendente3 = new DIpendente("003", 1800.75, "VENDITE");

        DIpendente[] arrDip = {dipendente1, dipendente2, dipendente3};

        for(DIpendente dip : arrDip) {
            System.out.println("Matricola dipendente: " + dip.getMatricola());
        }
         */

        //Esercizio 2
        DIpendente dipFUll = new DipendenteFullTime("001", 200, "PRODUZIONE");
        DIpendente dipParT = new DipendentePartTime("002", 0, "VENDITE", 120, 15);
        DIpendente diri = new Dirigente("003", 300, "AMMINISTRAZIONE", 20);

        DIpendente[] dip = {dipFUll, dipParT, diri};

        for (DIpendente dippo : dip) {
            System.out.println("Matricola: " + dippo.getMatricola());
            System.out.println("Salario: " + dippo.calculateSalary() + "\n");
        }

    }
}