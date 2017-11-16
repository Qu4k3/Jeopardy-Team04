/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class BoardView extends JFrame {

    final static String SCORE = "Score";
    final static String ROUND = "Round";
    
    //Panels, Labels and buttons
    public JPanel boardPanel;
    public JPanel playersPanel;
    public JPanel categoryPanel;
    public JPanel buttonsPanel;
    public JLabel[] categoryLabel;
    public JButton[][] questionsButtons;
    public JPanel player1Panel;
    public JPanel player2Panel;
    public JPanel roundPanel;
    public JLabel player1Name;
    public JLabel score;
    public JLabel player1Score;
    public JLabel round;
    public JLabel numberRound;
    public JLabel player2Name;
    public JLabel player2Score;

    Border border = LineBorder.createGrayLineBorder();
    
    public BoardView() {
        this.setTitle("JeopardyGame! - Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addComponentsToPane(this.getContentPane());
        this.setResizable(false);
        this.pack();
        this.setSize(1024, 720);
        this.setVisible(true);
        ImageIcon img = new ImageIcon("img/logo/favicon.ico");
        this.setIconImage(img.getImage());
    }

    void addComponentsToPane(Container contenido) {

        contenido.setLayout(new BorderLayout(1024, 720));

        //BoardPanel
        boardPanel = new JPanel(new BorderLayout(500, 220));

            //categoryPanel
            categoryPanel = new JPanel(new GridLayout(1, 6));
            categoryPanel.setBorder(border);
            String[] category = {"Deportes", "Codigo", "Historia", "Geografia", "Personajes Publicos", "Otro"};//Cambiar los valores por las categorias seleccionadas por el usuario;
            categoryLabel = new JLabel[6];
            for (int i = 0; i < category.length; i++) {
                categoryLabel[i] = new JLabel(category[i]);
                categoryLabel[i].setPreferredSize(new Dimension(824/6, 100));
                categoryLabel[i].setHorizontalAlignment(SwingConstants.CENTER);
                categoryLabel[i].setVerticalAlignment(SwingConstants.CENTER);
                categoryLabel[i].setBorder(border);
                categoryPanel.add(categoryLabel[i]);
            }
        boardPanel.add(categoryPanel, BorderLayout.NORTH);

            //buttonsPanel
            buttonsPanel = new JPanel(new GridLayout(5, 6));
            int[] values = {200, 400, 600, 800, 1000};//Cambiar los valores por las puntuaciones reales;
            questionsButtons = new JButton[values.length][6];
            for (int i = 0; i < values.length; i++) {
                for (int j = 0; j < 6; j++) {
                    questionsButtons[i][j] = new JButton(Integer.toString(values[i]));
                    questionsButtons[i][j].setPreferredSize(new Dimension(824/6, 100));
                    buttonsPanel.add(questionsButtons[i][j]);
                }
            }

        boardPanel.add(buttonsPanel, BorderLayout.SOUTH);

        playersPanel = new JPanel (new BorderLayout(200, 500));
        playersPanel.setBorder(border);

            player1Panel = new JPanel(new BorderLayout(200, 200));
            player1Panel.setBorder(border);
                player1Name = new JLabel("player1");//Cambiar los valores por los nombres que se introducen en la pantalla players
                player1Name.setText("player1");
                player1Name.setHorizontalAlignment(SwingConstants.CENTER);
                player1Name.setVerticalAlignment(SwingConstants.CENTER);
                score = new JLabel(SCORE);
                player1Score = new JLabel (Integer.toString(0));
            player1Panel.add(player1Name, BorderLayout.NORTH);
            player1Panel.add(score, BorderLayout.CENTER);
            player1Panel.add(player1Score, BorderLayout.SOUTH);
        playersPanel.add(player1Panel, BorderLayout.NORTH);
            
            roundPanel = new JPanel(new BorderLayout(200, 100));
            roundPanel.setBorder(border);
                round = new JLabel(ROUND);
                numberRound = new JLabel(Integer.toString(0));//Numero de ronda
            roundPanel.add(round, BorderLayout.NORTH);
            roundPanel.add(numberRound, BorderLayout.SOUTH);
        playersPanel.add(roundPanel, BorderLayout.CENTER);
            
            player2Panel = new JPanel(new BorderLayout(200, 200));
            player2Panel.setBorder(border);
                player2Name = new JLabel ("player2");//Cambiar los valores por los nombres que se introducen en la pantalla players
                score = new JLabel(SCORE);
                player2Score = new JLabel (Integer.toString(0));
            player2Panel.add(player2Name, BorderLayout.NORTH);
            player2Panel.add(score, BorderLayout.CENTER);
            player2Panel.add(player2Score, BorderLayout.SOUTH);
        playersPanel.add(player2Panel, BorderLayout.SOUTH);
            
    contenido.add(boardPanel, BorderLayout.WEST);
    contenido.add(playersPanel, BorderLayout.EAST);
    }
}
