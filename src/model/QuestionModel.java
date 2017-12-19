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
public class QuestionModel {

    private int idQuestion;
    private String name;
    private int value;
    private String[] answers = new String[3];
    private int correcta;

    public QuestionModel(int idQuestion, String name, int value, String[] answers, int correcta) {
        this.idQuestion = idQuestion;
        this.name = name;
        this.value = value;
        this.answers = answers;
        this.correcta = correcta;
    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public String[] getAnswer() {
        return answers;
    }

    public int getCorrecta() {
        return correcta;
    }

}
