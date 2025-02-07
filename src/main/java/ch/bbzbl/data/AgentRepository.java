package ch.bbzbl.data;

import ch.bbzbl.entities.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AgentRepository
        extends
            JpaRepository<Agent, Long>,
            JpaSpecificationExecutor<Agent> {

}
