/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.BorderFactory;
import javax.swing.Box;
import java.awt.Component;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
/**
 *
 * @author Diego
 */
public class PlayersDataView extends JFrame {

    JTextField playerOne, playerTwo;
    JLabel tittleView;
    JButton startGame;
    BorderLayout principalLayout;
    JPanel playersPanel;
    JPanel centerPanel;

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
        //textField Player1
        playerOne = new JTextField(10);
        playerOne.setOpaque(true);
        playersPanel.add(playerOne);
        //textField Player1
        playerTwo = new JTextField(10);
        playerTwo.setOpaque(true);
        playersPanel.add(playerTwo);

        //playersPanel.setBorder(BorderFactory.createEmptyBorder(15, 10, 10, 15));
        centerPanel.add(playersPanel);
        //buton
        startGame = new JButton();
        startGame.setText("Start Game");
        startGame.setAlignmentX(Component.CENTER_ALIGNMENT);

        centerPanel.add(startGame);
               centerPanel.add(Box.createVerticalStrut(65));

        pane.add(centerPanel);
    }

}

