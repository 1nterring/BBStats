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
    private Long Id;
    @ManyToOne
    @JoinColumn(name= "manager_id")
    @OneToOne(mappedBy = "contract", cascade = CascadeType.ALL)
    private Contract contract;
    public Contract getContract() {
        return contract;
    }
    public Long getId() {
        return Id;
    }
    public void setContract(Contract contract) {
        this.contract = contract;
    }
    public void setId(Long id) {
        Id = id;
    }

}
