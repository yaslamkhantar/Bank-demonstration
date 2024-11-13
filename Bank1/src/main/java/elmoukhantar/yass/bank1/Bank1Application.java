package elmoukhantar.yass.bank1;

import elmoukhantar.yass.bank1.entities.Banks;
import elmoukhantar.yass.bank1.entities.Client;
import elmoukhantar.yass.bank1.repository.Bankrepository;
import elmoukhantar.yass.bank1.repository.Clientrepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Bank1Application {

    public static void main(String[] args) {
        SpringApplication.run(Bank1Application.class, args);
    }

    @Bean
    CommandLineRunner start(Bankrepository bankrepository, Clientrepository clientrepository){
        return args -> {
            bankrepository.save(new Banks("Hiiipng","BCP","CASA","Smail",null));
            bankrepository.save(new Banks("PIJHTL","ATTIJARI","RABAT","Adil",null));
            bankrepository.save(new Banks("AVCHTY","CIH","FES","dounia",null));
            bankrepository.save(new Banks("PPLMAT","CFG","AGADIR","boutaina",null));
            clientrepository.save(new Client("hjipp","Abdellatif","Abdellatif@gmail.com","09356788",bankrepository.findById("Hiiipng").get()));
            clientrepository.save(new Client("MOPYY","taha","taha@gmail.com","0890055",bankrepository.findById("PIJHTL").get()));
            clientrepository.save(new Client("DFOP","imad","imad@gmail.com","06689734",bankrepository.findById("AVCHTY").get()));
            clientrepository.save(new Client("UIOP","meryem","meryem@gmail.com","0754321",bankrepository.findById("PPLMAT").get()));
            clientrepository.save(new Client("FGHT","Hajar","Hajar@gmail.com","07554321",bankrepository.findById("Hiiipng").get()));

        };
    }

}
