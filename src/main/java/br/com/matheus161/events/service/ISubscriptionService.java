package br.com.matheus161.events.service;

import br.com.matheus161.events.model.Session;
import br.com.matheus161.events.model.Subscription;
import br.com.matheus161.events.model.User;

import java.util.List;

public interface ISubscriptionService {
    public Subscription addSubscription(Subscription subscription);
    public List<Subscription> getAllByUser(User user);
    public List<Subscription> getAllBySession(Session session);
}
