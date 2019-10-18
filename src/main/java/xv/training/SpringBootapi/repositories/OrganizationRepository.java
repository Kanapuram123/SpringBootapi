package xv.training.SpringBootapi.repositories;
import org.springframework.data.repository.CrudRepository;

import xv.training.SpringBootapi.entities.Organization;

public interface OrganizationRepository extends CrudRepository<Organization, Long>{

}
