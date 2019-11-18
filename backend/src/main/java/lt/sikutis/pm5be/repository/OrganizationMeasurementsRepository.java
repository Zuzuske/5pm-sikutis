package lt.sikutis.pm5be.repository;

import lt.sikutis.pm5be.model.OrganizationMeasurements;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrganizationMeasurementsRepository extends CrudRepository<OrganizationMeasurements, Long> {
    List<OrganizationMeasurements> findAll();
}
