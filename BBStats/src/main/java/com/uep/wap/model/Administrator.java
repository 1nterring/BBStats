package com.uep.wap.model;

import javax.persistence.JoinColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import javax.persistence.*;

import com.uep.wap.WapApplication;

@Entity
public class Administrator{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @OneToOne
    @JoinColumn()
    private WapApplication wapApplication;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public WapApplication getWapApplication() {
        return wapApplication;
    }

    public void setWapApplication(WapApplication wapApplication) {
        this.wapApplication = wapApplication;
    }
}