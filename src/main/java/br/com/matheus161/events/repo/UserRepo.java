package br.com.matheus161.events.repo;

import br.com.matheus161.events.model.User;
import org.springframework.data.repository.ListCrudRepository;

import java.util.Optional;

public interface UserRepo extends ListCrudRepository<User, Integer> {
    public Optional<User> findByEmail(String email);
}
