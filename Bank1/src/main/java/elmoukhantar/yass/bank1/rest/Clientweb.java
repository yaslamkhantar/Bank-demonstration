package elmoukhantar.yass.bank1.rest;

import elmoukhantar.yass.bank1.entities.Client;
import elmoukhantar.yass.bank1.repository.Clientrepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/microservice1")
@AllArgsConstructor
public class Clientweb {
    private Clientrepository clientrepository;

    @GetMapping("/client/{cin}")
  public Client getClient(@PathVariable  String cin){
     return    clientrepository.findById(cin).get();
  }

}
