package SIMP;

import java.util.ArrayList;

public class SIM {
    private long nTelefono;
    private double creditoDisp;
    private ArrayList<Chiamata> listChiamate;

    //costruttore
    public SIM(int nTelefono) {
        this.nTelefono = nTelefono;
        this.creditoDisp = creditoDisp = 0;
        this.listChiamate = new ArrayList<>(); //inizializza la lista che sarà vuota
    }

    //per aggiungere una chiamata
    public void aggiungiChiamata(int  numero, int durata) {
        Chiamata chiamata = new Chiamata(numero, durata);
        listChiamate.add(chiamata);
    }

    // Metodo per stampare tutte le chiamate
    public void stampaChiamate() {
        if (listChiamate.isEmpty()) {
            System.out.println("Nessuna chiamata effettuata.");
        } else {
            for (Chiamata chiamata : listChiamate) {
                chiamata.stampaChiamata(); // Usa il metodo della classe SIMP.Chiamata per stampare i dettagli
            }
        }
    }

    public void stampaDati() {
        System.out.println("il tuo numero di Telefono: " + nTelefono);
        System.out.println("il tuo credito disponibile: " + creditoDisp);
        stampaChiamate();
    }

}
