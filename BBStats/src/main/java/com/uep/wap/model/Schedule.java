package com.uep.wap.model;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.*;

@Entity
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @ManyToOne
    @JoinColumn(name = "data_id")
    @OneToMany(mappedBy = "schedule", cascade = CascadeType.ALL)
    private Schedule schedule;
    public Long getId() {
        return Id;
    }
    public Schedule getSchedule() {
        return schedule;
    }
    public void setId(Long id) {
        Id = id;
    }
    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
}
