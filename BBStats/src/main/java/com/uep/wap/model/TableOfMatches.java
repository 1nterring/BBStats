package com.uep.wap.model;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.*;

@Entity
public class TableOfMatches {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @ManyToOne
    @JoinColumn(name = "data_id")
    @OneToMany(mappedBy = "table", cascade = CascadeType.ALL)
    private TableOfMatches tableOfMatches;
    public Long getId() {
        return Id;
    }
    public TableOfMatches getTableOfMatches() {
        return tableOfMatches;
    }
    public void setId(Long id) {
        Id = id;
    }
    public void setTable(TableOfMatches tableOfMatches) {
        this.tableOfMatches = tableOfMatches;
    }
}
