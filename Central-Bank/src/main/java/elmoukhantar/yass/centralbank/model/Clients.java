package elmoukhantar.yass.centralbank.model;

import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Clients {
    private String cin;
    private String name;
    private String email;
    private String phone;

    private Banks bank;
}
