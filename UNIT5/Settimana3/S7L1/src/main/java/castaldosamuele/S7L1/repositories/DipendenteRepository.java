package castaldosamuele.S7L1.repositories;

import castaldosamuele.S7L1.entities.Dipendente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface DipendenteRepository extends JpaRepository<Dipendente, Long> {
    Optional<Dipendente> findByEmail(String email);
    Optional<Dipendente> findByUsername(String username);
}
