package entities;

import org.hibernate.annotations.NaturalId;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @ElementCollection
    private List<HomeAddress> address = new ArrayList<>();
    @ElementCollection
//    @OrderBy("marks asc")
//    @OrderColumn
//    @org.hibernate.annotations.OrderBy(clause = "marks ASC")
//    @SortComparator(MyComparator.class)
    private List<Integer> marks;

    @NaturalId
    private String iCode;

    public String getiCode() {
        return iCode;
    }

    public void setiCode(String iCode) {
        this.iCode = iCode;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    public List<HomeAddress> getAddress() {
        return address;
    }

    public void setAddress(List<HomeAddress> address) {
        this.address = address;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }
}
