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
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import view.BoardView;
import model.LoadModel;
import model.PlayerModel;
import model.QuestionModel;

/**
 *
 * @author Diego
 */
public class BoardController implements ActionListener {

    private LoadModel model;
    private BoardView view;
    private PlayerModel playerModel;

    public BoardController(LoadModel model, BoardView view) {
        this.model = model;
        this.view = view;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                view.questionsButtons[i][j].addActionListener(this);
            }
        }
    }

    public void round() {

        PlayerModel currentPlayer = new PlayerModel();

        if (model.round % 2 == 1) {

            view.player1Panel.setBackground(Color.green);
            view.player2Panel.setBackground(Color.red);
            currentPlayer = PlayerModel.j1;
        } else {

            view.player2Panel.setBackground(Color.green);
            view.player1Panel.setBackground(Color.red);
            currentPlayer = PlayerModel.j2;
        }
        model.round++;
    }

    public void iniciar() {
        view.player1Name.setText(playerModel.j1.getName());
        view.player2Name.setText(playerModel.j2.getName());
        view.numberRound.setText(Integer.toString(model.round));

        for (int i = 0; i < playerModel.listaSelectedCategories.size(); i++) {
            String auxCategory = playerModel.listaSelectedCategories.get(i);//.getName
            view.categoryLabel[i].setText(auxCategory);
            switch (auxCategory) {

                case "codigo":
                    model.preguntasCodigo();
                    for (int j = 0; j < view.questionsButtons.length; j++) {
                        model.auxQuestions = model.listaPreguntasCodigo.get(j);
                        view.questionsButtons[i][j].setText(Integer.toString(model.auxQuestions.getValue()));
                        view.questionsButtons[i][j].addActionListener(this);
                    }
                    
                    break;

                case "deportes":
                    model.preguntasDeportes();
                    for (int j = 0; j < view.questionsButtons.length; j++) {
                        model.auxQuestions = model.listaPreguntasDeportes.get(j);
                        view.questionsButtons[i][j].setText(Integer.toString(model.auxQuestions.getValue()));
                        view.questionsButtons[i][j].addActionListener(this);
                    }

                    break;

                case "empresa":
                    model.preguntasEmpresa();
                    for (int j = 0; j < view.questionsButtons.length; j++) {
                        model.auxQuestions = model.listaPreguntasEmpresa.get(j);
                        view.questionsButtons[i][j].setText(Integer.toString(model.auxQuestions.getValue()));
                        view.questionsButtons[i][j].addActionListener(this);
                    }

                    break;

                case "geografia":
                    model.preguntasGeografia();
                    for (int j = 0; j < view.questionsButtons.length; j++) {
                        model.auxQuestions = model.listaPreguntasGeografia.get(j);
                        view.questionsButtons[i][j].setText(Integer.toString(model.auxQuestions.getValue()));
                        view.questionsButtons[i][j].addActionListener(this);
                    }
                    
                    break;

                case "historia":
                    model.preguntasHistoria();
                    for (int j = 0; j < view.questionsButtons.length; j++) {
                        model.auxQuestions = model.listaPreguntasHistoria.get(j);
                        view.questionsButtons[i][j].setText(Integer.toString(model.auxQuestions.getValue()));
                        view.questionsButtons[i][j].addActionListener(this);
                    }

                    break;

                case "musica":
                    model.preguntasMusica();
                    for (int j = 0; j < view.questionsButtons.length; j++) {
                        model.auxQuestions = model.listaPreguntasMusica.get(j);
                        view.questionsButtons[i][j].setText(Integer.toString(model.auxQuestions.getValue()));
                        view.questionsButtons[i][j].addActionListener(this);
                    }

                    break;

                case "peliculas":
                    model.preguntasPeliculas();
                    for (int j = 0; j < view.questionsButtons.length; j++) {
                        model.auxQuestions = model.listaPreguntasPeliculas.get(j);
                        view.questionsButtons[i][j].setText(Integer.toString(model.auxQuestions.getValue()));
                        view.questionsButtons[i][j].addActionListener(this);
                    }
                    break;

                case "personajesPublicos":
                    model.preguntasPersonajesPublicos();
                    for (int j = 0; j < view.questionsButtons.length; j++) {
                        model.auxQuestions = model.listaPreguntasPersonajesPublicos.get(j);
                        view.questionsButtons[i][j].setText(Integer.toString(model.auxQuestions.getValue()));
                        view.questionsButtons[i][j].addActionListener(this);
                    }

                    break;

                case "telefonia":
                    model.preguntasTelefonia();
                    for (int j = 0; j < view.questionsButtons.length; j++) {
                        model.auxQuestions = model.listaPreguntasTelefonia.get(j);
                        view.questionsButtons[i][j].setText(Integer.toString(model.auxQuestions.getValue()));
                        view.questionsButtons[i][j].addActionListener(this);
                    }

                    break;
            }
        }
    }

    public void actionPerformed(ActionEvent ae) {

        
        
        view.numberRound.setText(Integer.toString(model.round));

        round();
        
        for (int i = 0; i < view.questionsButtons.length; i++) {

            for (int j = 0; j < view.questionsButtons[i].length; j++) {
                if (ae.getSource() == view.questionsButtons[i][j]) {
                    
                    JOptionPane.showOptionDialog(view, model.auxQuestions.getName(), "Question title",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                            null, model.listAnswers, model.listAnswers[model.auxQuestions.getCorrecta()]);

                }
            }
        }

        model.round++;

    }
}
