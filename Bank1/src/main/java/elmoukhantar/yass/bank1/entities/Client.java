package elmoukhantar.yass.bank1.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Client {
    @Id
    private String cin;
    private String name;
    private String email;
    private String phone;

    @ManyToOne

    private Banks bank;
}
