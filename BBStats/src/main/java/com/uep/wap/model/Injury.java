package com.uep.wap.model;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import javax.persistence.*;

@Entity
public class Injury {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private boolean injured;
    private boolean cured;
    @OneToOne
    @JoinColumn(name= "player_id")
    private Injury injury;
    public Long getId() {
        return Id;
    }
    public Injury getInjury() {
        return injury;
    }
    public void setCured(boolean cured) {
        this.cured = cured;
    }
    public void setId(Long id) {
        Id = id;
    }
    public void setInjured(boolean injured) {
        this.injured = injured;
    }
    public void setInjury(Injury injury) {
        this.injury = injury;
    }
}
