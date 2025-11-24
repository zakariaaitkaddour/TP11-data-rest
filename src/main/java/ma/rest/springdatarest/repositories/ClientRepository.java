package ma.rest.springdatarest.repositories;

import ma.rest.springdatarest.entities.Client;
import ma.rest.springdatarest.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client, Long> {
}
