package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import view.BoardView;
import model.LoadModel;
import model.PlayerModel;
import model.QuestionModel;
import view.WinnerView;

public class BoardController implements ActionListener {

    private LoadModel model;
    private BoardView view;
    private CategoryController categoryController;
    private PlayerDataController playerController;
    private PlayerModel j1, j2;
    private ArrayList<String> listaSelectedCategories;

    PlayerModel currentPlayer = new PlayerModel();

    public BoardController(LoadModel model, BoardView view, PlayerModel playerOne, PlayerModel playerTwo, ArrayList<String> listaSelectedCategories) {
        this.model = model;
        this.view = view;
        this.j1 = playerOne;
        this.j2 = playerTwo;
        this.listaSelectedCategories = listaSelectedCategories;
        iniciar();
    }

    public void round() {

        if (model.round % 2 == 1) {

            view.player1Panel.setBackground(Color.CYAN);
            view.player2Panel.setBackground(Color.WHITE);
            currentPlayer = j1;
            //currentPlayer = playerController.playerOne;
        } else {

            view.player2Panel.setBackground(Color.CYAN);
            view.player1Panel.setBackground(Color.WHITE);
            currentPlayer = j2;
            //currentPlayer = playerController.playerTwo;

        }
        if (model.round >= 20) {
            finalJoepardyRound();
        }
        if (model.round == 30) {
            ganador();
        }
        model.round++;

    }

    public void iniciar() {
        view.player1Name.setText(j1.getName());
        view.player2Name.setText(j2.getName());
        view.numberRound.setText(Integer.toString(model.round));
        String category = "";
        model.CargarDatos();

        for (int i = 0; i < view.categoryLabel.length; i++) {
            category = listaSelectedCategories.get(i);
            view.categoryLabel[i].setText(category);
        }

        HashMap<String, ArrayList<QuestionModel>> todasLasPreguntas = model.CargarDatos();
        QuestionModel auxQuestion;

        for (int i = 0; i < 6; i++) {

            category = listaSelectedCategories.get(i);

            for (int j = 0; j < 5; j++) {

                auxQuestion = todasLasPreguntas.get(category).get(j);

                view.questionsButtons[j][i].setText(Integer.toString(auxQuestion.getValue()));
                view.questionsButtons[j][i].addActionListener(this);

            }

        }
        round();

    }

    public void finalJoepardyRound() {

        String category = "";

        HashMap<String, ArrayList<QuestionModel>> todasLasPreguntas = model.CargarDatos();

        QuestionModel auxQuestion;
        for (int i = 0; i < 6; i++) {

            category = listaSelectedCategories.get(i);

            for (int j = 0; j < 5; j++) {

                auxQuestion = todasLasPreguntas.get(category).get(j);

                view.questionsButtons[j][i].setText(Integer.toString(auxQuestion.getValue() * 2));

            }
        }
    }

    public void actionPerformed(ActionEvent ae) {

        view.numberRound.setText(Integer.toString(model.round));

        String category;
        HashMap<String, ArrayList<QuestionModel>> todasLasPreguntas = model.CargarDatos();
        QuestionModel auxQuestion;

        for (int i = 0; i < 6; i++) {
            category = listaSelectedCategories.get(i);
            for (int j = 0; j < 5; j++) {

                if (ae.getSource() == view.questionsButtons[j][i]) {

                    auxQuestion = todasLasPreguntas.get(category).get(j);
                    String[] listAnswers = auxQuestion.getAnswer();

                    int n = JOptionPane.showOptionDialog(view, auxQuestion.getName(), "Escoge una opción",
                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                            null, listAnswers, listAnswers[0]);

                    if (n == auxQuestion.getCorrecta()) {
                        System.out.println(currentPlayer.getName() + " RESPUESTA CORRECTA");
                        view.questionsButtons[j][i].setBackground(Color.green);

                        if (model.round >= 20) {
                            currentPlayer.sumaScore(auxQuestion.getValue() * 2);
                        } else {
                            currentPlayer.sumaScore(auxQuestion.getValue());
                        }

                        view.player1Score.setText(Integer.toString(j1.getScore()));
                        view.player2Score.setText(Integer.toString(j2.getScore()));
                    } else {
                        System.out.println(currentPlayer.getName() + " RESPUESTA INCORRECTA");
                        view.questionsButtons[j][i].setBackground(Color.red);
                    }

                    view.questionsButtons[j][i].setEnabled(false);
                    round();

                }
            }
        }
    }

    public void ganador() {
        /*WinnerView winnerView = new WinnerView();
        WinnerController winnerController = new WinnerController(winnerView,j1,j2);*/
    }
}
