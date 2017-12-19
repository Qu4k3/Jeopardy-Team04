package model;

public class PlayerModel {
    
    private String name;
    private int score;
    private int failures;

    public PlayerModel() {
    }
    public PlayerModel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }   
    
}