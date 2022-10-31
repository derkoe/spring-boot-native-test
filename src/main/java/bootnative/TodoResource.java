package bootnative;

import java.util.Optional;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoResource {
    private final TodoRepository repository;

    public TodoResource(TodoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api/todos")
    public Iterable<Todo> list() {
        return repository.findAll();
    }

    @GetMapping("/api/todos/{id}")
    public Optional<Todo> item(@PathVariable UUID id) {
        return  repository.findById(id);
    }
}
