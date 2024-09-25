package SIMP;

public class Chiamata {
    private long nTelefono;
    private int durata;

    public  Chiamata(int nTelefono, int durata) {
        this.nTelefono = nTelefono;
        this.durata = durata;
    }

    public long getNumeroTelefono() {
        return nTelefono;
    }

    public int getDurata() {
        return durata;
    }

    public void stampaChiamata() {
        System.out.println("Numero chiamato: " + nTelefono + ", Durata: " + durata + " minuti");
    }

}
