package elmoukhantar.yass.centralbank.controlleur;

import elmoukhantar.yass.centralbank.entity.Cbanque;
import elmoukhantar.yass.centralbank.feign.BankRest;
import elmoukhantar.yass.centralbank.model.Banks;
import elmoukhantar.yass.centralbank.repository.Cbanquerepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/microservice2")
public class Cbanquecontrolleur {

    private BankRest bankRest;
    private Cbanquerepository cbanquerepository;

    @GetMapping("/Cbanques")
    public List<Cbanque> getAllBanq(){
        return cbanquerepository.findAll();
    }
    @GetMapping("/Cbanque/{ref}")
    public Cbanque getCbanqueById(@PathVariable String ref){
        Cbanque cbank = cbanquerepository.findById(ref).get();
        Banks bank=bankRest.getBank(cbank.getIdbank());
        cbank.setBank(bank);
        return cbank;

    }
}
