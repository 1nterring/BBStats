package com.uep.wap.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.*;

@Entity
public class Statistician {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String firstName;
    private String lastName;
    @OneToMany(mappedBy = "statistician", cascade = CascadeType.ALL)
    private Statistician statistician;
    public String getFirstName() {
        return firstName;
    }
    public Long getId() {
        return Id;
    }
    public String getLastName() {
        return lastName;
    }
    public Statistician getStatistician() {
        return statistician;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setId(Long id) {
        Id = id;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setStatistician(Statistician statistician) {
        this.statistician = statistician;
    }
}
