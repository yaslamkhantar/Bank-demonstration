package elmoukhantar.yass.centralbank;

import elmoukhantar.yass.centralbank.entity.Cbanque;
import elmoukhantar.yass.centralbank.repository.Cbanquerepository;
import jakarta.ws.rs.BeanParam;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

@EnableFeignClients
public class CentralBankApplication {

    public static void main(String[] args) {
        SpringApplication.run(CentralBankApplication.class, args);
    }

    @Bean
    CommandLineRunner start(Cbanquerepository cbanquerepository){
        return args -> {

            cbanquerepository.save(new Cbanque("YYpo3","Bank-elmaghrib","MAROC",null,"Hiiipng"));
            cbanquerepository.save(new Cbanque("IOPMLK","Deutsh-Bank","ALLEMANE",null,"AVCHTY"));
            cbanquerepository.save(new Cbanque("AWBHY","SWIFT","HOLLANDE",null,"PPLMAT"));
        };
    }

}
