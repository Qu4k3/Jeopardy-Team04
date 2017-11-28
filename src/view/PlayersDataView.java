/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.Box;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Diego
 */
public class PlayersDataView extends JFrame{

    public JTextField playerOne, playerTwo;
    public JLabel tittleView;
    public JButton startGame,ButtonPrueba;
    JLabel labelPlayerOne, labelPlayerTwo;
    BorderLayout principalLayout;
    JLabel prueba;
    String bgColor;
    JPanel playersPanel;
    JPanel centerPanel;
    ImageIcon  image,imagePrueba;
    JPanel playerPanelOne, playerPanelTwo;

    public PlayersDataView() {
        this.setTitle("JeopardyGame! - Ingreso de Players");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        addComponentsTopane(this.getContentPane());
        this.pack();
        this.setSize(560, 360);
        this.setVisible(true);
        ImageIcon img = new ImageIcon("img/logo/favicon.ico");
        this.setIconImage(img.getImage());
    }

    private void addComponentsTopane(Container pane) {
        centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.add(Box.createVerticalStrut(50));
        //Tittle 
        tittleView = new JLabel("Insertar Jugadores");
        tittleView.setFont(tittleView.getFont().deriveFont(16.0f));
        tittleView.setAlignmentX(Component.CENTER_ALIGNMENT);
        tittleView.setOpaque(true);
        //tittleView.setBorder(BorderFactory.createEmptyBorder(15, 10, 10, 15));

        centerPanel.add(tittleView);
//        pane.add(centerPanel);
        centerPanel.add(Box.createVerticalStrut(70));
        // playersPanel
            playersPanel = new JPanel();
                //Panel player One
                playerPanelOne = new JPanel();
                playerPanelOne.setLayout(new BoxLayout(playerPanelOne, BoxLayout.Y_AXIS));
                    //labell player1
                    labelPlayerOne = new JLabel();
                    labelPlayerOne.setText("Player One");
                    labelPlayerOne.setAlignmentX(Component.CENTER_ALIGNMENT);
                    playerPanelOne.add(labelPlayerOne);
                    playerPanelOne.add(Box.createVerticalStrut(10));
                    //textField Player1
                    playerOne = new JTextField(10);
                    playerOne.setOpaque(true);
                    playerPanelOne.add(playerOne);
            playersPanel.add(playerPanelOne);
                //panel player Two
                playerPanelTwo = new JPanel();
                playerPanelTwo.setLayout(new BoxLayout(playerPanelTwo, BoxLayout.Y_AXIS));
                    //label player2 
                    labelPlayerTwo = new JLabel();
                    labelPlayerTwo.setText("Player Two");
                    labelPlayerTwo.setAlignmentX(Component.CENTER_ALIGNMENT);
                    playerPanelTwo.add(labelPlayerTwo);
                    playerPanelTwo.add(Box.createVerticalStrut(10));

                     //textField Player1
                    playerTwo = new JTextField(10);
                    playerTwo.setOpaque(true);
                    playerPanelTwo.add(playerTwo);
            playersPanel.add(playerPanelTwo);
                           
                    

        //playersPanel.setBorder(BorderFactory.createEmptyBorder(15, 10, 10, 15));
        centerPanel.add(playersPanel);
        //prueba

        //buton
        startGame = new JButton();
        startGame.setText("Start Game");
        startGame.setAlignmentX(Component.CENTER_ALIGNMENT);
        bgColor="#29c42f";
        startGame.setBackground(Color.decode(bgColor));
        centerPanel.add(startGame);
        centerPanel.add(Box.createVerticalStrut(65));

        pane.add(centerPanel);
  
    }

}
