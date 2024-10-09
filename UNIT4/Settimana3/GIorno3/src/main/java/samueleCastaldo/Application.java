package samueleCastaldo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import samueleCastaldo.dao.EventoDAO;
import samueleCastaldo.dao.LocationDAO;
import samueleCastaldo.dao.PartecipazioneDAO;
import samueleCastaldo.dao.PersonaDAO;
import samueleCastaldo.entities.*;

import java.time.LocalDate;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("settimana3giorno3");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();

        EventoDAO ed = new EventoDAO(em);

        //vado prima a creare una location
        Location newLocation = new Location();
        newLocation.setNome("Teatro Comunale");
        newLocation.setCitta("Milano");

        LocationDAO ld = new LocationDAO(em);
        // Salvataggio della location
        ld.save(newLocation);

        //poi vado a creare un evento e ci aggiungo la location di sopra
        Evento newEvento = new Evento();
        newEvento.setTitolo("Concerto di Primavera");
        newEvento.setData_evento(LocalDate.of(2024, 5, 15));
        newEvento.setDescrizione("Un fantastico concerto di primavera.");
        newEvento.setTipo_evento(EventoType.PUBBLICO); // Assicurati di avere un valore valido per il tuo enum
        newEvento.setNumero_massimo_partecipanti(500);
        newEvento.setLocation(newLocation);

        ed.save(newEvento);

        PersonaDAO pd = new PersonaDAO(em);
        Persona newPersona = new Persona("Gino", "rossi", "mario.rossi@gmail.com", LocalDate.of(1999, 1,1), Sesso.M);
        pd.save(newPersona);

        Partecipazione newPartecipazione = new Partecipazione();
        newPartecipazione.setPersona(newPersona);
        newPartecipazione.setEvento(newEvento);
        newPartecipazione.setStato(Stato.DA_CONFERMARE); // Assicurati di avere un valore valido per il tuo enum

        PartecipazioneDAO partd = new PartecipazioneDAO(em);
        partd.save(newPartecipazione);

        em.close();
        emf.close();
    }
}
