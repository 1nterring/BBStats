package com.uep.wap.model;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import javax.persistence.*;

@Entity
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String firstName;
    private String lastName;
    @OneToOne
    @JoinColumn(name = "team_id")
    @OneToMany(mappedBy = "manager", cascade = CascadeType.ALL)
    private Manager manager;
    public String getFirstName() {
        return firstName;
    }
    public Long getId() {
        return Id;
    }
    public String getLastName() {
        return lastName;
    }
    public Manager getManager() {
        return manager;
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
    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
