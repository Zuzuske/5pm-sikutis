package lt.sikutis.fivepmbe.repository;

import lt.sikutis.fivepmbe.model.OrganizationMeasurements;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrganizationMeasurementsRepository extends CrudRepository<OrganizationMeasurements, Long> {
    List<OrganizationMeasurements> findAll();
}
