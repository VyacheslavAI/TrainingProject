package ee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class StudentAddress {
    @Id @GeneratedValue
    int id;
    String street;
    String city;


    public StudentAddress() {
        street = "Street";
        city = "City";
    }
}
