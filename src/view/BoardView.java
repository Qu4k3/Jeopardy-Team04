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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BoardView extends JFrame {

    //Panels, Labels and buttons
    public JPanel boardPanel;
    public JPanel playersPanel;
    public JPanel categoryPanel;
    public JPanel buttonsPanel;
    public JLabel[] categoryLavel;
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
    
    public BoardView() {
        this.setTitle("JEOPARDY");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addComponentsToPane(this.getContentPane());
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
    }

    void addComponentsToPane(Container container) {
        
        container.setLayout(new BorderLayout(800, 500));
        
        //BoardPanel
        boardPanel.setLayout(new BorderLayout(600, 500));
        
        
            //categoryPanel
            categoryPanel.setLayout(new GridLayout(1, 6));
            String[] categoryLabel = {"Deportes", "Codigo", "Historia", "", "", ""};//Cambiar los valores por las categorias seleccionadas por el usuario;
            for (int i=0;i<categoryLabel.length;i++) {
              JLabel[] label = null;
              label[i] = new JLabel(categoryLabel[i]);
              label[i].setPreferredSize(new Dimension(5,4));
              buttonsPanel.add(label[i]);
            }
            
            
            //buttonsPanel
            buttonsPanel.setLayout(new GridLayout(5, 6));
            String[] values = {"Deportes", "Codigo", "Historia", "", "", ""};//Cambiar los valores por las puntuaciones reales;
            for (int i=0; i<values.length; i++) {
              JButton[] buttons = null;
              buttons[i] = new JButton(values[i]);
              buttons[i].setPreferredSize(new Dimension(50,40));
              buttonsPanel.add(buttons[i]);
            }
            
            
            container.add(boardPanel, BorderLayout.CENTER);
            container.add(buttonsPanel, BorderLayout.EAST);
    }   
}
