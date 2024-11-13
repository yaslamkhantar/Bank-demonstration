package elmoukhantar.yass.proxyannuaire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // 1->1
public class ProxyAnnuaireApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProxyAnnuaireApplication.class, args);
    }

}
