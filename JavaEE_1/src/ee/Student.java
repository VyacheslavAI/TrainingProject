package ee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;

@Entity
public class Student {
    @Id
    @GeneratedValue
    int id;
    String name;
    String serName;
    int age;


    @PrePersist
    void prePersist() {
        System.out.println("inner persist");
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }
}


