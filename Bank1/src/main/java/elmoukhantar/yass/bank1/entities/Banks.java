package elmoukhantar.yass.bank1.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Banks {
    @Id
    private String idbank;
    private String nametype;
    private  String ville;
    private String directeur;
   // @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)

    @OneToMany(mappedBy = "bank")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Client> clients;
}
