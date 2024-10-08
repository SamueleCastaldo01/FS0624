package samueleCastaldo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import samueleCastaldo.dao.EventoDAO;
import samueleCastaldo.entities.Evento;
import samueleCastaldo.entities.EventoType;

import java.time.LocalDate;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneeventi");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        EventoDAO ed = new EventoDAO(em);

        Evento evento1 = new Evento(LocalDate.of(2024, 2, 10), "Conferenza Mensile", EventoType.PUBBLICO, 100);

        ed.save(evento1);

        try{
            Evento fromDb = ed.getById(1);
            System.out.println(fromDb);
            ed.deleteById(1);
        }catch (IllegalArgumentException error) {
            System.out.println(error.getMessage());
        }

        em.close();
        emf.close();
    }
}
