package homework26.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "clients")
@ToString

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private int age;
    private int phone;
    private String about;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_pro_account_id",unique = true)
    private ClientProAccount clientProAccount;

    @OneToMany(mappedBy = "client",fetch = FetchType.EAGER)
    private Set<ClientPhone> clientPhones;
    @ManyToMany
    @JoinTable(
            name = "client_status",
            joinColumns = {@JoinColumn(name = "client_id")},
            inverseJoinColumns ={@JoinColumn(name = "status_id")}
    )
    private Set<Status> statuses;

}

