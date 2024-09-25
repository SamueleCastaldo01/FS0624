package RettangoloP;

public class Rettangolo {
    private double altezza;
    private double larghezza;

    //costruttore
    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    private double perimetro() {
        return 2 * (altezza + larghezza);
    }

    private double area() {
        return altezza * larghezza;
    }

    public void stampaRettangolo() {
        System.out.println("Perimetro del rettangolo: " + perimetro() + " cm");
        System.out.println("Area del rettangolo: " + area() + "cm 2");
    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        // Stampa del primo rettangolo
        System.out.println("\nRettangoloP.Rettangolo 1:");
        r1.stampaRettangolo();

        // Stampa del secondo rettangolo
        System.out.println("\nRettangoloP.Rettangolo 2:");
        r2.stampaRettangolo();

        // Somma delle aree e dei perimetri
        double sommaAree = r1.area() + r2.area();
        double sommaPerimetri = r1.perimetro() + r2.perimetro();

        // Stampa delle somme
        System.out.println("\nSomma delle aree: " + sommaAree + " cm²");
        System.out.println("Somma dei perimetri: " + sommaPerimetri + " cm");
    }

}
