package samueleCastaldo.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import samueleCastaldo.entities.Partecipazione;

public class PartecipazioneDAO {
    private final EntityManager entityManager;

    public PartecipazioneDAO(EntityManager entityManager) {
        this.entityManager =entityManager;
    }

    public void save(Partecipazione newPartecipazione) {
        EntityTransaction transaction = entityManager.getTransaction();
        //facciamo partire la transazione
        transaction.begin();
        //aggiungiamo l'evento al persistence Context
        entityManager.persist(newPartecipazione);
        //chiudiamo la transazione
        transaction.commit();
        System.out.println("La partecipazione "+newPartecipazione.getId() + " è stato salvato nel db");
    }
}
