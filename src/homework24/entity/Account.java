package homework24.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Setter
public class Account {
    private int id;
    private int clientID;
    private String number;
    private double value;

}
