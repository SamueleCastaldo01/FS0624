package samuelecastaldo.entities;

public class Tavolo {
    private long id;
    private int numero_coperti_massimo;
    private boolean occupato;

    public Tavolo(long id, int numero_coperti_massimo) {
        this.id = id;
        this.numero_coperti_massimo = numero_coperti_massimo;
        this.occupato = false;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumero_coperti_massimo() {
        return numero_coperti_massimo;
    }

    public void setNumero_coperti_massimo(int numero_coperti_massimo) {
        this.numero_coperti_massimo = numero_coperti_massimo;
    }

    public boolean getOccupato() {
        return occupato;
    }

    public void setOccupato(boolean occupato) {
        this.occupato = occupato;
    }

    @Override
    public String toString() {
        return "Tavolo{" +
                "id=" + id +
                ", numero_coperti_massimo=" + numero_coperti_massimo +
                ", statoTavolo=" + occupato +
                '}';
    }
}
