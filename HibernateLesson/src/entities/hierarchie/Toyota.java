package entities.hierarchie;

import javax.persistence.Entity;

@Entity
public class Toyota extends Car {
    private int maxSpeed;

    public Toyota(String number, int maxSpeed) {
        super(number);
        this.maxSpeed = maxSpeed;
    }
}
