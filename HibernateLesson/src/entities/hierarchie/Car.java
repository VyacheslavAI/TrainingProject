package entities.hierarchie;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@MappedSuperclass
//@OptimisticLocking(type = OptimisticLockType.VERSION)
//@Cacheable
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@NamedQueries(
//        @NamedQuery(name = "getCarByNumber", query = "from Car c where number = :number"))
public class Car {
    @Id
    @GeneratedValue
    private int id;
    private String number;

    public Car() {
    }

    public Car(String number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
