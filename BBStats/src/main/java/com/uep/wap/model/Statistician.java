package com.uep.wap.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;

import java.util.List;

import javax.persistence.*;

@Entity
public class Statistician {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String firstName;
    private String lastName;
    @OneToMany(mappedBy = "statistician", cascade = CascadeType.ALL)
    private List<Data> dataList;
    public String getFirstName() {
        return firstName;
    }
    public Long getId() {
        return Id;
    }
    public String getLastName() {
        return lastName;
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
}
