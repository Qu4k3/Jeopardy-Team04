package model;

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
