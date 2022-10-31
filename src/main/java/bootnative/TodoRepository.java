package bootnative;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, UUID> {

}
