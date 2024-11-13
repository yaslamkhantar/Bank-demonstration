package elmoukhantar.yass.bank1.repository;

import elmoukhantar.yass.bank1.entities.Banks;
import elmoukhantar.yass.bank1.entities.Banks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Bankrepository extends JpaRepository<Banks,String> {
}
