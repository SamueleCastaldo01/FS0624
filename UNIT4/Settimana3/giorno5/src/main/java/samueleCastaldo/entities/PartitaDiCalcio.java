package samueleCastaldo.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "partite_di_calcio")  // Specifica la tabella
@NamedQueries({
        @NamedQuery(name = "getVinteInCasa",
        query = "SELECT pc FROM PartitaDiCalcio pc WHERE pc.vincente = pc.squadra_di_casa"
        ),
        @NamedQuery(name = "getVinteInTrasferta",
        query = "SELECT pc FROM PartitaDiCalcio pc WHERE pc.vincente = pc.squadra_ospite"
        )
})
public class PartitaDiCalcio extends Evento {


    private String squadra_di_casa;
    private String squadra_ospite;
    private String vincente;
    private int numero_goal_squadra_di_casa;
    private int numero_goal_squadra_ospite;

    // Costruttore vuoto richiesto da JPA
    public PartitaDiCalcio() { }


    public PartitaDiCalcio(LocalDate data_evento, String descrizione, EventoType tipo_evento, int numero_massimo_partecipanti,
                           String squadra_di_casa, String squadra_ospite, String vincente,
                           int numero_goal_squadra_di_casa, int numero_goal_squadra_ospite) {
        super(data_evento, descrizione, tipo_evento, numero_massimo_partecipanti);
        this.squadra_di_casa = squadra_di_casa;
        this.squadra_ospite = squadra_ospite;
        this.vincente = vincente;
        this.numero_goal_squadra_di_casa = numero_goal_squadra_di_casa;
        this.numero_goal_squadra_ospite = numero_goal_squadra_ospite;
    }


    public String getSquadra_di_casa() {
        return squadra_di_casa;
    }

    public void setSquadra_di_casa(String squadra_di_casa) {
        this.squadra_di_casa = squadra_di_casa;
    }

    public String getSquadra_ospite() {
        return squadra_ospite;
    }

    public void setSquadra_ospite(String squadra_ospite) {
        this.squadra_ospite = squadra_ospite;
    }

    public String getVincente() {
        return vincente;
    }

    public void setVincente(String vincente) {
        this.vincente = vincente;
    }

    public int getNumero_goal_squadra_di_casa() {
        return numero_goal_squadra_di_casa;
    }

    public void setNumero_goal_squadra_di_casa(int numero_goal_squadra_di_casa) {
        this.numero_goal_squadra_di_casa = numero_goal_squadra_di_casa;
    }

    public int getNumero_goal_squadra_ospite() {
        return numero_goal_squadra_ospite;
    }

    public void setNumero_goal_squadra_ospite(int numero_goal_squadra_ospite) {
        this.numero_goal_squadra_ospite = numero_goal_squadra_ospite;
    }

    @Override
    public String toString() {
        return "PartitaDiCalcio{" +
                "id=" + id +
                ", squadra_di_casa='" + squadra_di_casa + '\'' +
                ", squadra_ospite='" + squadra_ospite + '\'' +
                ", vincente='" + vincente + '\'' +
                ", numero_goal_squadra_di_casa=" + numero_goal_squadra_di_casa +
                ", numero_goal_squadra_ospite=" + numero_goal_squadra_ospite +
                '}';
    }
}
