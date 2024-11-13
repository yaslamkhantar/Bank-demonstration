package elmoukhantar.yass.centralbank.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@ToString
public class Banks {

    private String idbank;
    private String nametype;
    private  String ville;
    private String directeur;

    private List<Clients> client;
}
