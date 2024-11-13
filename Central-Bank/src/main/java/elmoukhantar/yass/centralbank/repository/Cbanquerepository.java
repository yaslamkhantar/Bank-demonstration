package elmoukhantar.yass.centralbank.repository;

import elmoukhantar.yass.centralbank.entity.Cbanque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Cbanquerepository extends JpaRepository<Cbanque,String> {
}
