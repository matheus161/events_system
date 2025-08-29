package br.com.matheus161.events.service;

import br.com.matheus161.events.exception.NotFoundException;
import br.com.matheus161.events.model.User;
import br.com.matheus161.events.repo.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    private UserRepo repo;

    public UserServiceImpl(UserRepo repo) {
        this.repo = repo;
    }

    @Override
    public User addUser(User user) {
        return repo.save(user);
    }

    @Override
    public User getUserById(Integer id) {
        return repo.findById(id).orElseThrow(() ->
                new NotFoundException("User not found: " + id)
        );
    }

    @Override
    public User getUserByEmail(String email) {
        return repo.findByEmail(email).orElseThrow(() ->
                new NotFoundException("Email no registered " + email)
        );
    }

    @Override
    public List<User> getAllUsers() {
        return repo.findAll();
    }
}
