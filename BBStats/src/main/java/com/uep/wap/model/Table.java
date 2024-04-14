package com.uep.wap.model;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.*;

@Entity
public class Table {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @ManyToOne
    @JoinColumn(name = "data_id")
    @OneToMany(mappedBy = "table", cascade = CascadeType.ALL)
    private Table table;
    public Long getId() {
        return Id;
    }
    public Table getTable() {
        return table;
    }
    public void setId(Long id) {
        Id = id;
    }
    public void setTable(Table table) {
        this.table = table;
    }
}
