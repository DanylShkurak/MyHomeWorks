package homework26.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "client_pro_account")
@Getter
@Setter
@ToString
public class ClientProAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String nickname;
    @Column(name = "raiting_in_elo")
    int ratingInElo;
    @OneToOne(mappedBy = "clientProAccount")
    private Client client;

}
