/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.nio.file.Path;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Diego
 */
public class CategoryView extends JFrame {

    JPanel buttonsPanel;
    JPanel infoPanel;
    JPanel playerOneInfo;
    JPanel playerTwoInfo;
    JLabel title;
    JButton[] categorias;
    JLabel playerOne;
    JLabel playerTwo;
    JLabel imageBallGray1, imageBallGreen1, imageBallGreen2,imageBallGray2,imageBallGray3,imageBallGreen3;
    JPanel panelBallOne;
    JPanel panelBallTwo;
    String PATH = "img/balls/";
    JButton opContinue;

    public CategoryView() {
        this.setTitle("JeopardyGame! - Seleccion de Categorias");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        addComponentsTopane(this.getContentPane());
        this.pack();
        this.setVisible(true);
        this.setSize(700, 500);
        ImageIcon img = new ImageIcon("img/logo/favicon.ico");
        this.setIconImage(img.getImage());
    }

    private void addComponentsTopane(Container pane) {
        // panel info
        infoPanel = new JPanel();
        
        // titulo
        title = new JLabel("Seleccione 3 categorias");
        title.setOpaque(true);
        title.setHorizontalAlignment(SwingConstants.CENTER);
        infoPanel.add(title);
        pane.add(infoPanel, BorderLayout.NORTH);
        //separacion
        infoPanel.setBorder(BorderFactory.createEmptyBorder(15, 10, 10, 15));
        //panel playerOne info
        playerOneInfo = new JPanel();
        playerOneInfo.setLayout(new BoxLayout(playerOneInfo, BoxLayout.Y_AXIS));
        //panel playerTwo info
        playerTwoInfo = new JPanel();
        playerTwoInfo.setLayout(new BoxLayout(playerTwoInfo, BoxLayout.Y_AXIS));
        //panel ball one
        panelBallOne = new JPanel();
        //panel ball two
        panelBallTwo = new JPanel();
        //info player1
        playerOne = new JLabel("Player1");
        playerOne.setOpaque(true);
        playerOneInfo.add(playerOne, BorderLayout.LINE_START);
        pane.add(playerOneInfo, BorderLayout.WEST);
        //balls playerOne
        imageBallGreen1 = new JLabel(new ImageIcon(PATH + "circleGreen.png"));
        imageBallGray2 = new JLabel(new ImageIcon(PATH + "circleGray.png"));
        imageBallGray3 = new JLabel(new ImageIcon(PATH + "circleGray.png"));

        panelBallOne.add(imageBallGreen1);
        panelBallOne.add(imageBallGray2);
        panelBallOne.add(imageBallGray3);
        playerOneInfo.add(panelBallOne);
        //info player2
        playerTwo = new JLabel("Player2");
        playerTwo.setOpaque(true);
        playerTwoInfo.add(playerTwo, BorderLayout.WEST);
        pane.add(playerTwoInfo, BorderLayout.EAST);
        //balls playersTwo
        imageBallGreen1 = new JLabel(new ImageIcon(PATH + "circleGreen.png"));
        imageBallGray2 = new JLabel(new ImageIcon(PATH + "circleGray.png"));
        imageBallGray3 = new JLabel(new ImageIcon(PATH + "circleGray.png"));

        panelBallTwo.add(imageBallGreen1);
        panelBallTwo.add(imageBallGray2);
        panelBallTwo.add(imageBallGray3);
        playerTwoInfo.add(panelBallTwo);       
        

        //botones de categorias
        
        
    

    }
}
