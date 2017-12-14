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
public class CategoryModel {
    
    private int idCategory;
    private String name;

    public CategoryModel(int idCategory, String name, QuestionModel[] question) {
        this.idCategory = idCategory;
        this.name = name;
        //this.question = question;
        //this.CategoryGrup = CategoryGrup;
    }
    
    public String getName() {
        return name;
    }
    
}
