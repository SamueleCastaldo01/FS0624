package samuelecastaldo.provadb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import samuelecastaldo.provadb.entities.Toppings;

@Repository
public interface ToppingRepository extends JpaRepository<Toppings, Long> {
}
