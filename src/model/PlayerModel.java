/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Diego
 */
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
