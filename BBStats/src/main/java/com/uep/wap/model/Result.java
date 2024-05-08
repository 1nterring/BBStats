package com.uep.wap.model;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import javax.persistence.ManyToOne;
import javax.persistence.*;

@Entity
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String winner;
    private Integer final_score;
    @ManyToOne
    @JoinColumn(name = "tableOfMatches_id")
    @OneToOne(mappedBy = "result", cascade = CascadeType.ALL)
    private Result result;
    public Integer getFinal_score() {
        return final_score;
    }
    public Long getId() {
        return Id;
    }
    public Result getResult() {
        return result;
    }
    public String getWinner() {
        return winner;
    }
    public void setFinal_score(Integer final_score) {
        this.final_score = final_score;
    }
    public void setId(Long id) {
        Id = id;
    }
    public void setResult(Result result) {
        this.result = result;
    }
    public void setWinner(String winner) {
        this.winner = winner;
    }
}
