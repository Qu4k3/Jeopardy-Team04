package view;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import javax.swing.AbstractButton;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class WinnerView extends JFrame {

    public static JLabel winner, player1, player2, wallet1, wallet2, mistakes1, mistakes2, logo;
    public static JPanel centeredBoxPanel, middlePanel, buttonsPanel, playerInfo, player2Info;
    public static JButton exitButton, retryButton;
    
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
        
        centeredBoxPanel = new JPanel();
        centeredBoxPanel.setLayout(new BoxLayout(centeredBoxPanel, BoxLayout.Y_AXIS));

        // espaciado
        centeredBoxPanel.add(Box.createVerticalStrut(40));
        
        winner = new JLabel();
        winner.setAlignmentX(Component.CENTER_ALIGNMENT);
        winner.setFont(winner.getFont().deriveFont(16.0f));
        centeredBoxPanel.add(winner);
        
        // espaciado
        centeredBoxPanel.add(Box.createVerticalStrut(30));        
        // (FlowLayout.LEFT, 20, 10)
        middlePanel = new JPanel();        
            
            playerInfo = new JPanel();
            playerInfo.setLayout(new BoxLayout(playerInfo, BoxLayout.Y_AXIS));
                                            
                player1 = new JLabel();
                player1.setAlignmentX(Component.CENTER_ALIGNMENT);
                player1.setFont(player1.getFont().deriveFont(16.0f));
                playerInfo.add(player1);

                wallet1 = new JLabel();
                wallet1.setAlignmentX(Component.CENTER_ALIGNMENT);
                wallet1.setFont(wallet1.getFont().deriveFont(16.0f));
                playerInfo.add(wallet1);

                mistakes1 = new JLabel();
                mistakes1.setAlignmentX(Component.CENTER_ALIGNMENT);
                mistakes1.setFont(mistakes1.getFont().deriveFont(16.0f));
                playerInfo.add(mistakes1);
                
                playerInfo.setBorder(new EmptyBorder(20, 20, 20, 20));
                
            middlePanel.add(playerInfo);
                
                logo = new JLabel(new ImageIcon("img/logo/favicon.ico"));
                logo.setAlignmentX(Component.CENTER_ALIGNMENT);
                // playerInfo.add(logo);
                
                logo.setBorder(new EmptyBorder(20, 20, 20, 20));
                
            middlePanel.add(logo);
                
            player2Info = new JPanel();
            player2Info.setLayout(new BoxLayout(player2Info, BoxLayout.Y_AXIS));
                player2 = new JLabel();
                player2.setAlignmentX(Component.CENTER_ALIGNMENT);
                player2.setFont(player2.getFont().deriveFont(16.0f));
                player2Info.add(player2);

                wallet2 = new JLabel();
                wallet2.setAlignmentX(Component.CENTER_ALIGNMENT);
                wallet2.setFont(wallet2.getFont().deriveFont(16.0f));
                player2Info.add(wallet2);

                mistakes2 = new JLabel();
                mistakes2.setAlignmentX(Component.CENTER_ALIGNMENT);
                mistakes2.setFont(mistakes2.getFont().deriveFont(16.0f));
                player2Info.add(mistakes2);
                
                player2Info.setBorder(new EmptyBorder(20, 20, 20, 20));
                
            middlePanel.add(player2Info);
        
        
        centeredBoxPanel.add(middlePanel);
        
        // espaciado
        centeredBoxPanel.add(Box.createVerticalStrut(10));  
        
        buttonsPanel = new JPanel();
        
            retryButton = new JButton("Volver a jugar");
            retryButton.setVerticalTextPosition(AbstractButton.CENTER);
            retryButton.setHorizontalTextPosition(AbstractButton.CENTER);
            retryButton.setMnemonic(KeyEvent.VK_V );

            buttonsPanel.add(retryButton);

            exitButton = new JButton("Acabar");
            exitButton.setVerticalTextPosition(AbstractButton.CENTER);
            exitButton.setHorizontalTextPosition(AbstractButton.CENTER);
            exitButton.setMnemonic(KeyEvent.VK_A);

            buttonsPanel.add(exitButton);
        
        centeredBoxPanel.add(buttonsPanel);
        
        // espaciado
        centeredBoxPanel.add(Box.createVerticalStrut(30));
        
        pane.add(centeredBoxPanel);
        
    }

}
