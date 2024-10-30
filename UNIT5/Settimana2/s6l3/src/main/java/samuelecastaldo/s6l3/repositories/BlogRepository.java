package samuelecastaldo.s6l3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import samuelecastaldo.s6l3.entities.Blog;

public interface BlogRepository extends JpaRepository<Blog, Long> {
}
