package br.com.matheus161.events.repo;

import br.com.matheus161.events.model.Session;
import br.com.matheus161.events.model.Subscription;
import br.com.matheus161.events.model.SubscriptionId;
import br.com.matheus161.events.model.User;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface SubscriptionRepo extends ListCrudRepository<Subscription, SubscriptionId> {
    public List<Subscription> findByIdUser(User user);
    public List<Subscription> findByIdSession(Session session);
}
