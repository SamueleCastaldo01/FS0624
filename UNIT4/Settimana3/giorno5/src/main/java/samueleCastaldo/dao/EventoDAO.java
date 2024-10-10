package samueleCastaldo.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;
import samueleCastaldo.entities.Concerto;
import samueleCastaldo.entities.Evento;
import samueleCastaldo.entities.Genere;
import samueleCastaldo.entities.PartitaDiCalcio;

import java.util.List;

public class EventoDAO {
    private final EntityManager entityManager;

    public EventoDAO(EntityManager entityManager) {
        this.entityManager =entityManager;
    }

    public void save(Evento newEvento) {
        //1 andiamo a creare prima la transazione
        EntityTransaction transaction = entityManager.getTransaction();
        //facciamo partire la transazione
        transaction.begin();
        //aggiungiamo l'evento al persistence Context
        entityManager.persist(newEvento);
        //chiudiamo la transazione
        transaction.commit();
        System.out.println("l'evento "+newEvento.getDescrizione() + " è stato salvato nel db");
    }

    public Evento getById(long EventoId) {
        Evento found = entityManager.find(Evento.class, EventoId);
        if(found == null) throw new IllegalArgumentException("Non è stato trovato questo id: " +EventoId);
        return found;
    }

    public void deleteById(long EventoId) {
        Evento found = this.getById(EventoId);
        //1chiediamo la transazione
        EntityTransaction transaction = entityManager.getTransaction();
        //Facciamo partire
        transaction.begin();
        //rimuoviamo lo studente dal persistence. Ancora non viene rimosso nel db
        entityManager.remove(found);
        //chiudiamo, quindi lo va a salvare nello stato
        transaction.commit();
        System.out.println("L'evento " +found.getDescrizione() + " è stato rimosso dal DB");
    }

    public List<Concerto> getConcertiInStreaming(boolean b) {
        TypedQuery<Concerto> query = entityManager.createQuery("SELECT c FROM Concerto c WHERE c.in_streaming = :b", Concerto.class);
        query.setParameter("b", b);
        return query.getResultList();
    }

    public List<Concerto> getConcertiPerGenere(Genere genere) {
        TypedQuery<Concerto> query = entityManager.createQuery("SELECT c FROM Concerto c WHERE c.genere = :genere", Concerto.class);
        query.setParameter("genere", genere);
        return  query.getResultList();
    }

    public List<PartitaDiCalcio> getVinteInCasa() {
        TypedQuery<PartitaDiCalcio> query = entityManager.createNamedQuery("getVinteInCasa", PartitaDiCalcio.class);
        return query.getResultList();
    }

    public List<PartitaDiCalcio> getVinteInTrasferta() {
        TypedQuery<PartitaDiCalcio> query = entityManager.createNamedQuery("getVinteInTrasferta", PartitaDiCalcio.class);
        return query.getResultList();
    }

}
