package br.com.matheus161.events.service;

import br.com.matheus161.events.exception.NotFoundException;
import br.com.matheus161.events.model.Conference;
import br.com.matheus161.events.repo.ConferenceRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConferenceServiceImpl implements IConferenceService {
    private ConferenceRepo repo;

    public ConferenceServiceImpl(ConferenceRepo repo) {
        super();
        this.repo = repo;
    }

    @Override
    public Conference addConference(Conference conference) {
        return repo.save(conference);
    }

    @Override
    public Conference getConferenceById(Integer id) {
        return repo.findById(id).orElseThrow(
                () -> new NotFoundException("Conference not found: " + id)
        );
    }

    @Override
    public List<Conference> getAllConferences() {
        return repo.findAll();
    }
}
