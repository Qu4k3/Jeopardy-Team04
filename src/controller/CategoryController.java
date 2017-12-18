/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import model.CategoryModel;
import model.PlayerModel;
import view.CategoryView;

/**
 *
 * @author Diego
 */
public class CategoryController implements ActionListener {

    private view.CategoryView view;
    private PlayerModel JugadorUno, JugadorDos;
    ArrayList<CategoryModel> listaAllCategories = new ArrayList();
    ArrayList<CategoryModel> listaSelectedCategories = new ArrayList();
     static int contadorBallsPlayer1 = 0;
     static int contadorBallsPlayer2 =0;

    public CategoryController(CategoryView viewCategory, PlayerModel PlayerOne, PlayerModel PlayerTwo) {

        this.view = viewCategory;
        this.JugadorUno = PlayerOne;
        this.JugadorDos = PlayerTwo;

        view.playerOne.setText(PlayerOne.getName());
        view.playerTwo.setText(PlayerTwo.getName());
        JOptionPane.showMessageDialog(view, "Cada Jugador debera Seleccionar 3 Categorias.\nEmpieza el Jugador: " + JugadorDos.getName(), "Seleccion de Categorias", 1);
        //Rellenar listaAllCategories leyendo fichero
        //actualizar texto view - categoriasButtons con listaAllCategories
        this.setUpListenerButtons(view);
    }

    private void setUpListenerButtons(CategoryView view) {
        for (int i = 0; i < view.categoriasButtons.length; i++) {

            for (int j = 0; j < view.categoriasButtons[i].length; j++) {
                view.categoriasButtons[i][j].addActionListener(this);

            }
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
        if (listaSelectedCategories.size() < 6) {
            // a esta casilla cambiale el color de fondo a #e9e9e9 una vez clicada
            boolean encontrado = false;
            
            for (int i = 0; i < view.categoriasButtons.length; i++) {

                for (int j = 0; j < view.categoriasButtons[i].length; j++) {
                    if (e.getSource() == view.categoriasButtons[i][j]) {
                        if (JugadorUno.isTurno()==true) {
                            listaSelectedCategories.add(selectCategoryInAllCategories(view.categoriasButtons[i][j].getText()));
                            encontrado = true;
                            view.categoriasButtons[i][j].setEnabled(false);
                            view.categoriasButtons[i][j].setBackground(Color.red);
                            
                            
                            
                            JOptionPane.showMessageDialog(view, "El jugador: " + JugadorUno.getName()+" a seleccionado "
                                    +view.categoriasButtons[i][j].getText(), "Seleccion de Categorias", 1);
                            
                            
                         view.imageBallPlayerOne[contadorBallsPlayer1].setIcon(new ImageIcon(view.PathBallGreen));
                            
                            contadorBallsPlayer1 = contadorBallsPlayer1+1;
                            JugadorUno.setTurno(false);
                            break;
                        } else {                           
                            listaSelectedCategories.add(selectCategoryInAllCategories(view.categoriasButtons[i][j].getText()));
                            encontrado = true;
                            view.categoriasButtons[i][j].setEnabled(false);
                            view.categoriasButtons[i][j].setBackground(Color.red);
                            JOptionPane.showMessageDialog(view, "El jugador: " + JugadorDos.getName()+" a seleccionado "
                                    +view.categoriasButtons[i][j].getText(), "Seleccion de Categorias", 1);
                            
                            view.imageBallPlayerTwo[contadorBallsPlayer2].setIcon(new ImageIcon(view.PathBallGreen));
                            
                            contadorBallsPlayer2 = contadorBallsPlayer2+1;
                            JugadorUno.setTurno(true);
                            
                            break;
                        }

                    }
                }
                if (encontrado) {
                    break;
                }
            }
            System.out.println("Categorias seleccionadas: " + listaSelectedCategories.size());
            
        } else if(listaSelectedCategories.size()==6) {
            for (int i = 0; i < view.categoriasButtons.length; i++) {
                for (int j = 0; j < view.categoriasButtons[i].length; j++) {
                view.categoriasButtons[i][j].setEnabled(false);
                    
                }
            }
                
            
            JOptionPane.showMessageDialog(view, "Categorias seleccionadas ","Registro Completo",1);
            

            
        }

    }
     
    private CategoryModel selectCategoryInAllCategories(String name) {
        CategoryModel selectedCategory = null;
        for (CategoryModel category : listaAllCategories) {
            if (category.getName().equals(name)) {
                selectedCategory = category;
                break;
            }
        }

        return selectedCategory;
    }
}

