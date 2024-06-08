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
    private Integer winnerScore;
    private Integer loserScore;
    @ManyToOne
    @JoinColumn(name = "tableOfMatches_id")
    @OneToOne(mappedBy = "result", cascade = CascadeType.ALL)
    private Result result;

    public Result() {

    }
    public Integer getWinnerScore() {
        return winnerScore;
    }
    public Integer getLoserScore() {
        return loserScore;
    }

    public void setWinnerScore(Integer winnerScore) {
        this.winnerScore = winnerScore;
    }
    public void setLoserScore(Integer loserScore) {
        this.loserScore =  loserScore;
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
