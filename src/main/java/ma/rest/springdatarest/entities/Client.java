package ma.rest.springdatarest.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String email;

    @OneToMany(mappedBy = "client")
    private List<Compte> comptes;


    public Client() {
    }

    public Client(String nom, String email, List<Compte> comptes) {
        this.nom = nom;
        this.email = email;
        this.comptes = comptes;
    }
}