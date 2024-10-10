package samueleCastaldo.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "evento")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //permette di mettere in automatico l'id
    protected long id;
    @Column(name = "data_evento", nullable = false)
    protected LocalDate data_evento;
    @Column(name = "descrizione", nullable = false)
    protected String descrizione;
    @Column(name = "tipo_evento", nullable = false)
    @Enumerated(EnumType.STRING)
    protected EventoType tipo_evento;
    @Column(name = "numero_massimo_partecipanti", nullable = false)
    protected int numero_massimo_partecipanti;

    public Evento () {  //obbligatorio, per gli entities il costruttore vuoto

    }

    public Evento(LocalDate data_evento, String descrizione, EventoType tipo_evento, int numero_massimo_partecipanti) {
        this.data_evento = data_evento;
        this.descrizione = descrizione;
        this.tipo_evento = tipo_evento;
        this.numero_massimo_partecipanti = numero_massimo_partecipanti;
    }

    public long getId() {
        return id;
    }

    public LocalDate getData_evento() {
        return data_evento;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public EventoType getTipo_evento() {
        return tipo_evento;
    }

    public int getNumero_massimo_partecipanti() {
        return numero_massimo_partecipanti;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setData_evento(LocalDate data_evento) {
        this.data_evento = data_evento;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setTipo_evento(EventoType tipo_evento) {
        this.tipo_evento = tipo_evento;
    }

    public void setNumero_massimo_partecipanti(int numero_massimo_partecipanti) {
        this.numero_massimo_partecipanti = numero_massimo_partecipanti;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", data_evento='" + data_evento + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", tipo_evento=" + tipo_evento +
                ", numero_massimo_partecipanti=" + numero_massimo_partecipanti +
                '}';
    }
}
