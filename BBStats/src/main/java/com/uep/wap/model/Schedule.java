package com.uep.wap.model;
import java.sql.Timestamp;

import javax.persistence.*;

@Entity
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
     private Timestamp dateOfMatch;
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
    public Timestamp getDateOfMatch() {
        return dateOfMatch;
    }
    public void setDateOfMatch(Timestamp dateOfMatch) {
        this.dateOfMatch = dateOfMatch;
    }
}
