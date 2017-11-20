/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Diego
 */
public class WinnerView extends JFrame {
    
    private static JLabel title;
    private static JPanel centerPanel;
    
    public WinnerView() {
        this.setTitle("JeopardyGame! - Results");
        this.setPreferredSize(new Dimension(560, 360));
        this.setLocation(250, 250);
        this.setResizable(false);
        
        ImageIcon img = new ImageIcon("img/logo/favicon.ico");
        this.setIconImage(img.getImage());

        addComponentsToPane(this.getContentPane());
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void addComponentsToPane(Container pane) {
        
        centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));

        // espaciado
        centerPanel.add(Box.createVerticalStrut(50));
        
        title = new JLabel("Resultados de la partida");
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        title.setFont(title.getFont().deriveFont(16.0f));
        centerPanel.add(title);
        
        pane.add(centerPanel);
        
    }
    
}
