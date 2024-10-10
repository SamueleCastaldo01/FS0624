package samueleCastaldo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import samueleCastaldo.dao.EventoDAO;
import samueleCastaldo.entities.Concerto;
import samueleCastaldo.entities.EventoType;
import samueleCastaldo.entities.Genere;
import samueleCastaldo.entities.PartitaDiCalcio;

import java.time.LocalDate;
import java.util.List;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("settimana3giorno4");
    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();

        System.out.println("Hello World!");

        EventoDAO eventoda = new EventoDAO(em);

        /*
        Concerto concerto1 = new Concerto(LocalDate.of(2024, 10, 15), "Concerto Rock di Primavera", EventoType.PUBBLICO, 1000, Genere.ROCK, true);
        Concerto concerto2 = new Concerto(LocalDate.of(2024, 10, 20), "Concerto Jazz al Tramonto", EventoType.PRIVATO, 500, Genere.ROCK, false);
        Concerto concerto3 = new Concerto(LocalDate.of(2024, 11, 5), "Concerto Pop per Beneficenza", EventoType.PUBBLICO, 2000, Genere.POP, true);
        Concerto concerto4 = new Concerto(LocalDate.of(2024, 11, 10), "Concerto Classico di Natale", EventoType.PRIVATO, 1500, Genere.POP, false);

        eventoda.save(concerto1);
        eventoda.save(concerto2);
        eventoda.save(concerto3);
        eventoda.save(concerto4); */

        /* Inserimento partite di calcio nel database
        PartitaDiCalcio partita1 = new PartitaDiCalcio(
                LocalDate.of(2024, 10, 10),
                "Match 1",
                EventoType.PRIVATO,
                5000,
                "Squadra A",
                "Squadra B",
                "Squadra A", // Vincente
                2,
                1
        );

        PartitaDiCalcio partita2 = new PartitaDiCalcio(
                LocalDate.of(2024, 10, 15),
                "Match 2",
                EventoType.PRIVATO,
                5000,
                "Squadra C",
                "Squadra D",
                "Squadra D", // Vincente
                1,
                2
        );
        eventoda.save(partita1);
        eventoda.save(partita2); */

        //test esercizio 2 ok funziona, perfetto
         List<PartitaDiCalcio> partiteVinteInCasa = eventoda.getVinteInCasa();
         for (PartitaDiCalcio partite : partiteVinteInCasa){
             System.out.println(partite);
         }

        //test metodo ricerca streaming
        boolean streaming = true;
        List<Concerto> concertiInStreaming = eventoda.getConcertiInStreaming(streaming);
        for (Concerto concerto : concertiInStreaming) {
            System.out.println(concerto);
        }




    }
}
