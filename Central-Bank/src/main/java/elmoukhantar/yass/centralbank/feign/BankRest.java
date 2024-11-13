package elmoukhantar.yass.centralbank.feign;

import elmoukhantar.yass.centralbank.model.Banks;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Bank1")
public interface BankRest {
    @GetMapping("/microservice1/bank/{idbank}")
    @CircuitBreaker(name = "cbanque",fallbackMethod = "getBank")
     Banks getBank(@PathVariable String idbank);

    default Banks getBank() {
        Banks banks = new Banks();
        banks.setIdbank("bbb");



       //customise all your properties  and return -> clinent -ville ...
        return banks;

    }



}
