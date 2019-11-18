package lt.sikutis.pm5be.repository;

import lt.sikutis.pm5be.model.Organizations;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrganizationsRepository extends CrudRepository<Organizations, Long> {
    List<Organizations> findAll();
}
