package samuelecastaldo.provadb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import samuelecastaldo.provadb.entities.Pizza;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Long> {

}
