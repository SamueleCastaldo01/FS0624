package samueleCastaldo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import samueleCastaldo.dao.EventoDAO;
import samueleCastaldo.entities.Evento;
import samueleCastaldo.entities.EventoType;

import java.time.LocalDate;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("settimana3giorno3");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();

        EventoDAO ed = new EventoDAO(em);

        Evento evento1 = new Evento("Titolo" ,LocalDate.of(2024, 2, 10), "Conferenza Mensile", EventoType.PUBBLICO, 100);

        ed.save(evento1);

    }
}
