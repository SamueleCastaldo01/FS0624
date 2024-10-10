package samueleCastaldo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "concerto")
public class Concerto extends  Evento {
    @Enumerated(EnumType.STRING)
    private Genere genere;
    private boolean in_streaming;

    public Concerto() {
    }

    public Concerto(LocalDate data_evento, String descrizione, EventoType tipo_evento, int numero_massimo_partecipanti, Genere genere, boolean in_streaming) {
        super(data_evento, descrizione, tipo_evento, numero_massimo_partecipanti);
        this.genere = genere;
        this.in_streaming = in_streaming;
    }

    public Genere getGenere() {
        return genere;
    }

    public boolean isIn_streaming() {
        return in_streaming;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    public void setIn_streaming(boolean in_streaming) {
        this.in_streaming = in_streaming;
    }

    @Override
    public String toString() {
        return "Concerto{" +
                "genere=" + genere +
                ", in_streaming=" + in_streaming +
                ", " + super.toString() + // Include i dettagli ereditati
                '}';
    }
}
