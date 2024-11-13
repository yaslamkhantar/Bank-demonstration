package elmoukhantar.yass.bank1.repository;

import elmoukhantar.yass.bank1.entities.Client;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Clientrepository extends JpaRepository<Client,String> {
}
