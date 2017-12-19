package model;

public class PlayerModel {
    
    private String name;
    private int score;
    private int failures;
    private boolean turno;

    public PlayerModel() {
    }
    public PlayerModel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
     public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }
    
    public int sumaScore(int score){
        this.score += score;
        return this.score;
    }
}

