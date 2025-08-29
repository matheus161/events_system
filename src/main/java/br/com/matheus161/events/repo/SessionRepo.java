package br.com.matheus161.events.repo;

import br.com.matheus161.events.model.Session;
import org.springframework.data.repository.ListCrudRepository;

public interface SessionRepo extends ListCrudRepository<Session, Integer> {
}
