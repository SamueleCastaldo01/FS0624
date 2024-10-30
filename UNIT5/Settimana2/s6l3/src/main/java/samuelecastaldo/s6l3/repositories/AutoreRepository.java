package samuelecastaldo.s6l3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import samuelecastaldo.s6l3.entities.Autore;

@Repository
public interface AutoreRepository extends JpaRepository<Autore, Long> {

}
