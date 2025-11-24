package ma.rest.springdatarest.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double solde;

    @Temporal(TemporalType.DATE)
    private Date dateCreation;

    @Enumerated(EnumType.STRING)
    private TypeCompte type;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    public Compte() {
    }

    public Compte(double solde, Date dateCreation , TypeCompte type, Client client) {
        this.solde = solde;
        this.dateCreation = dateCreation;
        this.type = type;
        this.client = client;
    }

    @Projection(name = "solde", types = Compte.class)
    public interface CompteProjection1 {
        double getSolde();
    }

    @Projection(name = "mobile", types = Compte.class)
    public interface CompteProjection2 {
        double getSolde();
        TypeCompte getType();
    }
}
