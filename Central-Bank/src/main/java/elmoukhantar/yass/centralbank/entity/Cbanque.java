package elmoukhantar.yass.centralbank.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import elmoukhantar.yass.centralbank.model.Banks;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Cbanque {
    @Id

    private String ref;
    private String name;
    private String country;
    @Transient
    private Banks bank;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String idbank;
}
