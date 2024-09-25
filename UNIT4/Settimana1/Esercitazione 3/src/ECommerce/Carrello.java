package ECommerce;

import java.util.ArrayList;

public class Carrello {
    private int clienteAssociato;
    private ArrayList<Articolo> elencoArticoli;
    private double totaleCostoArticoli;

    public Carrello(int clienteAssociato, double totaleCostoArticoli) {
        this.clienteAssociato = clienteAssociato;
        this.totaleCostoArticoli = totaleCostoArticoli;
        this.elencoArticoli = new ArrayList<>();
    }

}
