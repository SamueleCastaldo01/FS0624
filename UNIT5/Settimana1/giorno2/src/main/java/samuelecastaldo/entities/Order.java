package samuelecastaldo.entities;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private long id;
    private List<MenuItem> menuItems;  // Lista di articoli ordinati
    private Stato stato;
    private int numeroCoperti;
    private LocalDateTime oraAcquisizione;
    private double importoTotale;  // Variabile di istanza
    private Tavolo tavolo;
    private double costoCoperto;

    // Costruttore principale
    public Order(long id, Stato stato, int numeroCoperti, LocalDateTime oraAcquisizione, Tavolo tavolo, List<MenuItem> menuItems, double costoCoperto) {
        this.id = id;
        this.stato = stato;
        this.numeroCoperti = numeroCoperti;
        this.oraAcquisizione = oraAcquisizione;
        this.tavolo = tavolo;
        this.menuItems = menuItems;
        this.costoCoperto = costoCoperto;
        this.importoTotale = calcolaImportoTotale();  // Calcola l'importo totale al momento della creazione
    }

    // Costruttore opzionale (considera di implementarlo)
    public Order(int id, Tavolo tavolo, List<MenuItem> itemsOrdine, int numeroCoperti, double costoCoperto) {
        this.id = id;
        this.tavolo = tavolo;
        this.menuItems = itemsOrdine;
        this.numeroCoperti = numeroCoperti;
        this.costoCoperto = costoCoperto;
        this.oraAcquisizione = LocalDateTime.now(); // Imposta ora di acquisizione
        this.importoTotale = calcolaImportoTotale();  // Calcola l'importo totale
    }

    // Getter e Setter
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }

    public int getNumeroCoperti() {
        return numeroCoperti;
    }

    public void setNumeroCoperti(int numeroCoperti) {
        this.numeroCoperti = numeroCoperti;
        this.importoTotale = calcolaImportoTotale();  // Ricalcola l'importo totale quando il numero di coperti cambia
    }

    public LocalDateTime getOraAcquisizione() {
        return oraAcquisizione;
    }

    public void setOraAcquisizione(LocalDateTime oraAcquisizione) {
        this.oraAcquisizione = oraAcquisizione;
    }

    public double getImportoTotale() {
        return importoTotale;
    }

    public Tavolo getTavolo() {
        return tavolo;
    }

    public void setTavolo(Tavolo tavolo) {
        this.tavolo = tavolo;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
        this.importoTotale = calcolaImportoTotale();  // Ricalcola l'importo totale quando gli articoli cambiano
    }

    // Metodo per calcolare l'importo totale
    private double calcolaImportoTotale() {
        double totaleArticoli = menuItems.stream().mapToDouble(MenuItem::getPrice).sum();
        double totaleCoperti = numeroCoperti * costoCoperto;
        return totaleArticoli + totaleCoperti;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", stato=" + stato +
                ", numeroCoperti=" + numeroCoperti +
                ", oraAcquisizione=" + oraAcquisizione +
                ", tavolo=" + tavolo +
                ", importoTotale=" + importoTotale +
                '}';
    }
}
