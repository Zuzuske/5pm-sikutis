package lt.sikutis.fivepmbe.repository;

import lt.sikutis.fivepmbe.model.Organizations;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrganizationsRepository extends CrudRepository<Organizations, Long> {
    List<Organizations> findAll();
}
