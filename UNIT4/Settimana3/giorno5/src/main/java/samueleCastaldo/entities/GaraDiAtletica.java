package samueleCastaldo.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "gara_di_atletica")
public class GaraDiAtletica extends Evento{
    @ManyToOne
    @JoinColumn(name = "vincitore_id")
    private Persona vincitore;

    @ManyToMany
    @JoinTable(name = "gara_atleti", joinColumns = @JoinColumn(name = "gara_id"), inverseJoinColumns = @JoinColumn(name = "atleta_id"))
    private Set<Persona> atleti = new HashSet<>();

    public GaraDiAtletica() {}

    public GaraDiAtletica(LocalDate data_evento, String descrizione, EventoType tipo_evento, int numero_massimo_partecipanti, Persona vincitore, Set<Persona> atleti) {
        super(data_evento, descrizione, tipo_evento, numero_massimo_partecipanti);
        this.vincitore = vincitore;
        this.atleti = atleti;
    }

    public Persona getVincitore() {
        return vincitore;
    }

    public Set<Persona> getAtleti() {
        return atleti;
    }

    public void setVincitore(Persona vincitore) {
        this.vincitore = vincitore;
    }

    public void setAtleti(Set<Persona> atleti) {
        this.atleti = atleti;
    }

    public void addAtleta(Persona atleta) {
        atleti.add(atleta);
    }

    @Override
    public String toString() {
        return "GaraDiAtletica{" +
                "vincitore=" + vincitore +
                ", atleti=" + atleti +
                '}';
    }
}
