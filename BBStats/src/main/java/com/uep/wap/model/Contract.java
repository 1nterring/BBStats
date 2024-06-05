package com.uep.wap.model;
import java.sql.Timestamp;

import javax.persistence.*;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Timestamp expiryDate;
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
    public Timestamp getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Timestamp expiryDate) {
        this.expiryDate = expiryDate;
    }

}
