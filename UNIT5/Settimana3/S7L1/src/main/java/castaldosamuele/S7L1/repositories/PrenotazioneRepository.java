package castaldosamuele.S7L1.repositories;

import castaldosamuele.S7L1.entities.Dipendente;
import castaldosamuele.S7L1.entities.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {
    Optional<Prenotazione> findByDipendenteAndDataPrenotazione(Dipendente dipendente, LocalDate dataPrenotazione);
}
