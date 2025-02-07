package ch.bbzbl.services;

import ch.bbzbl.entities.Agent;
import ch.bbzbl.data.AgentRepository;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class AgentService {

    private final AgentRepository repository;

    public AgentService(AgentRepository repository) {
        this.repository = repository;
    }

    public Optional<Agent> get(Long id) {
        return repository.findById(id);
    }

    public Agent save(Agent entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Page<Agent> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Page<Agent> list(Pageable pageable, Specification<Agent> filter) {
        return repository.findAll(filter, pageable);
    }

    public int count() {
        return (int) repository.count();
    }

}
