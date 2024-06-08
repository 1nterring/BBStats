package com.uep.wap.dto;

public class ResultDTO {

    private String winner;
    private Integer winnerScore;
    private Integer loserScore;

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
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
}
