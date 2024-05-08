package com.uep.wap.model;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.*;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name= "manager_id")
    private Contract managerContract;
    
    @OneToOne
    @JoinColumn(name = "player_id")
    private Player player;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
