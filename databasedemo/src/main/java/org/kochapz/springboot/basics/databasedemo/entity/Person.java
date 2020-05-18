package org.kochapz.springboot.basics.databasedemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
//@Table(name="person")
public class Person {
    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String location;
    private Date birthDay;

    public Person() {
    }

    public Person(int id, String name, String location, Date birthDay) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.birthDay = birthDay;
    }

    public Person(String name, String location, Date birthDay) {
        this.name = name;
        this.location = location;
        this.birthDay = birthDay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", birthDay=" + birthDay +
                '}';
    }
}
