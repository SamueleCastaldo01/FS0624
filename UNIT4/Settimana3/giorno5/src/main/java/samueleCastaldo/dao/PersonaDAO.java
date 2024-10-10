package samueleCastaldo.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import samueleCastaldo.entities.Persona;

public class PersonaDAO {
    private final EntityManager entityManager;

    public PersonaDAO(EntityManager entityManager) {
        this.entityManager =entityManager;
    }

    public void save(Persona newPersona) {
        //1 andiamo a creare prima la transazione
        EntityTransaction transaction = entityManager.getTransaction();
        //facciamo partire la transazione
        transaction.begin();
        //aggiungiamo l'evento al persistence Context
        entityManager.persist(newPersona);
        //chiudiamo la transazione
        transaction.commit();
        System.out.println("la persona "+newPersona.getNome() + " è stato salvato nel db");
    }
}
