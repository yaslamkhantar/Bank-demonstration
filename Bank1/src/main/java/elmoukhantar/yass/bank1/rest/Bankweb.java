package elmoukhantar.yass.bank1.rest;

import elmoukhantar.yass.bank1.entities.Banks;
import elmoukhantar.yass.bank1.repository.Bankrepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/microservice1")
public class Bankweb {

    @Autowired
    private Bankrepository bankrepository;

    @GetMapping("/bank/{idbank}")
    public Banks getBank(@PathVariable String idbank){
      return bankrepository.findById(idbank).get();
    }
}
