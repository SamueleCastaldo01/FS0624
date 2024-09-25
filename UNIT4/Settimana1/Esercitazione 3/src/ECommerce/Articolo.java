package ECommerce;

public class Articolo {
    private long codiceArticolo;
    private String descrizioneArticolo;
    private double prezzo;
    private int numeroPezziDispMagazzino;

    public Articolo(long codiceArticolo, String descrizioneArticolo, double prezzo, int numeroPezziDispMagazzino) {
        this.codiceArticolo = codiceArticolo;
        this.descrizioneArticolo = descrizioneArticolo;
        this.prezzo = prezzo;
        this.numeroPezziDispMagazzino = numeroPezziDispMagazzino;
    }


}
