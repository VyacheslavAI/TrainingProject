package entities;

import enums.Days;
import org.hibernate.annotations.Formula;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Student {
//    @Id
//    @GeneratedValue
//    private int id;
//    @Basic(optional = false, fetch = FetchType.LAZY)
//    @Column(name = "MyName", nullable = false, unique = true, insertable = true, updatable = false)
//    @Type(type = "text")

    private String name;

    @Enumerated(EnumType.STRING)
    private Days days;

//    @CreationTimestamp
    @UpdateTimestamp
    private Date date;

    @EmbeddedId
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    private int age = 20;

    @Formula("id + age")
    private int idPlusAge;

    public int getIdPlusAge() {
        return idPlusAge;
    }

    public void setIdPlusAge(int idPlusAge) {
        this.idPlusAge = idPlusAge;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Days getDays() {
        return days;
    }

    public void setDays(Days days) {
        this.days = days;
    }


    public Student(String name, Days days) {
        this.name = name;
        this.days = days;
    }

    public Student(String name, Days days, Date date) {
        this.name = name;
        this.days = days;
        this.date = date;
    }

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return "Mr. " + name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public int getId() {
//        return id;
//    }
//
//
//    public void setId(int id) {
//        this.id = id;
//    }
}
