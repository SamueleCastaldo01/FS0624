package samueleCastaldo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "partecipazione")
public class Partecipazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "persona_id", nullable = false)
    private Persona persona;
    @ManyToOne
    @JoinColumn(name = "evento_id", nullable = false)
    private Evento evento;
    @Column(name = "stato", nullable = false)
    @Enumerated(EnumType.STRING)
    private Stato stato;

    public Partecipazione() {
    }

    public Partecipazione(Persona persona, Evento evento, Stato stato) {
        this.persona = persona;
        this.evento = evento;
        this.stato = stato;
    }

    public long getId() {
        return id;
    }

    public Persona getPersona() {
        return persona;
    }

    public Evento getEvento() {
        return evento;
    }

    public Stato getStato() {
        return stato;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }

    @Override
    public String toString() {
        return "Partecipazione{" +
                "id=" + id +
                ", persona=" + persona +
                ", evento=" + evento +
                ", stato=" + stato +
                '}';
    }
}
