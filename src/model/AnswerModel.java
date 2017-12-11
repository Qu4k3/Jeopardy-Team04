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
public class AnswerModel {
 
    private String name;
    private int correcta;

    public AnswerModel(String name, int correcta) {
       
        this.name = name;
        this.correcta = correcta;
    }

    public String getName() {
        return name;
    }

    public int getCorrecta() {
        return correcta;
    }
    
}
