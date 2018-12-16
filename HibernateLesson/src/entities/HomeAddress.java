package entities;

import javax.persistence.*;

//@Entity
@Embeddable
public class HomeAddress {
//    @Id
//    @GeneratedValue
//    private int id;
    private String street;

    public HomeAddress(String street) {
        this.street = street;
    }

    public HomeAddress() {
    }
}
