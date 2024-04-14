package com.uep.wap.model;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.*;

@Entity
public class Data {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @ManyToOne
    @JoinColumn(name = "statistican_id")
    private Data Data;
    @OneToMany(mappedBy = "data", cascade = CascadeType.ALL)

    public Data getData() {
        return Data;
    }
    public Long getId() {
        return Id;
    }
    public void setData(Data data) {
        Data = data;
    }
    public void setId(Long id) {
        Id = id;
    }
}
