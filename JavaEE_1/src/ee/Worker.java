package ee;

import javax.persistence.*;

@Entity
public class Worker {
    @Id
    @GeneratedValue
    int id;
    String job;

    public Worker() {

    }

    public Worker(String job) {
        this.job = job;
    }
}
