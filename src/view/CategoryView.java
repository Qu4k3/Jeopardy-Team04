/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.nio.file.Path;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import model.PlayerModel;

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
    public JButton[][] categoriasButtons;
    public JLabel playerOne;
    public JLabel playerTwo;
    public JLabel[] imageBallPlayerTwo, imageBallPlayerOne;
    JPanel panelBallOne;
    public String PathBallGreen = "img/balls/circleGreen.png";
    public String PathBallGray = "img/balls/circleGray.png";
    
    JPanel panelBallTwo;
    String PATH = "img/balls/";
    
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
        title = new JLabel("Seleccion de Categorias");
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

        //info player1
        playerOne = new JLabel("Player1");
        playerOne.setOpaque(true);
        playerOne.setAlignmentX(CENTER_ALIGNMENT);        
        
        playerOneInfo.add(playerOne, BorderLayout.LINE_START);
        pane.add(playerOneInfo, BorderLayout.WEST);
        //balls playerOne
        //panel ball one
        panelBallOne = new JPanel();
        imageBallPlayerOne = new JLabel[3];
        String[] valuesBallOne = {PathBallGray, PathBallGray, PathBallGray};
        for (int i = 0; i < valuesBallOne.length; i++) {
            imageBallPlayerOne[i] = new JLabel(new ImageIcon(valuesBallOne[i]));
            panelBallOne.add(imageBallPlayerOne[i]);
        }
        
        playerOneInfo.add(panelBallOne);
        //info player2
        playerTwo = new JLabel("Player2");
        playerTwo.setOpaque(true);
        playerTwo.setAlignmentX(CENTER_ALIGNMENT);        
        playerTwoInfo.add(playerTwo);
        pane.add(playerTwoInfo, BorderLayout.EAST);
        //balls playersTwo
        //panel ball two
        panelBallTwo = new JPanel();
        imageBallPlayerTwo = new JLabel[3];
        String[] valuesBallTwo = {PathBallGray, PathBallGray, PathBallGray};
        for (int i = 0; i < valuesBallTwo.length; i++) {
            imageBallPlayerTwo[i] = new JLabel(new ImageIcon(valuesBallTwo[i]));
            panelBallTwo.add(imageBallPlayerTwo[i]);
        }
        playerTwoInfo.add(panelBallTwo);

        //botones de categoriasButtons
        buttonsPanel = new JPanel(new GridLayout(3, 3));
        buttonsPanel.setBackground(Color.red);
        String[][] values = {{"deportes", "personajesPublicos", "codigo"},
        {"empresa", "peliculas", "musica"},
        {"telefonia", "historia", "geografia"}
        };

        //,"Publicos","anime","actores ","Marcas","historia","Geo"
        categoriasButtons = new JButton[3][3];
        
        String bgColor = "#e9e9e9";
        
        for (int i = 0; i < categoriasButtons.length; i++) {
            
            for (int j = 0; j < categoriasButtons[i].length; j++) {
                categoriasButtons[i][j] = new JButton(values[i][j]);
                categoriasButtons[i][j].setPreferredSize(new Dimension(1 / 3, 5));
                categoriasButtons[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 2, false));
                categoriasButtons[i][j].setBackground(Color.decode(bgColor));
                buttonsPanel.add(categoriasButtons[i][j]);
            }
        }
        //buttonsPanel.setSize(new Dimension(200, 50));
        pane.add(buttonsPanel);
    }
}
