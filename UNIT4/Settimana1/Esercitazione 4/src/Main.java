public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        DIpendente dipendente1 = new DIpendente("001", 2000.00, "PRODUZIONE");
        DIpendente dipendente2 = new DIpendente("002", 2500.50, "AMMINISTRAZIONE");
        DIpendente dipendente3 = new DIpendente("003", 1800.75, "VENDITE");

        DIpendente[] arrDip = {dipendente1, dipendente2, dipendente3};

        for(DIpendente dip : arrDip) {
            System.out.println("Matricola dipendente: " + dip.getMatricola());
        }
    }
}