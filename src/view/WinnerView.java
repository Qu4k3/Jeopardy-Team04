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
    
    public static JLabel title, player, wallet, mistakes, logo;
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
        
        title = new JLabel("Enhorabuena, player_name!");
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        title.setFont(title.getFont().deriveFont(16.0f));
        centeredBoxPanel.add(title);
        
        // espaciado
        centeredBoxPanel.add(Box.createVerticalStrut(30));        
        // (FlowLayout.LEFT, 20, 10)
        middlePanel = new JPanel();        
            
            playerInfo = new JPanel();
            playerInfo.setLayout(new BoxLayout(playerInfo, BoxLayout.Y_AXIS));
                                            
                player = new JLabel("Player 1");
                player.setAlignmentX(Component.CENTER_ALIGNMENT);
                player.setFont(player.getFont().deriveFont(16.0f));
                playerInfo.add(player);

                wallet = new JLabel("$200");
                wallet.setAlignmentX(Component.CENTER_ALIGNMENT);
                wallet.setFont(wallet.getFont().deriveFont(16.0f));
                playerInfo.add(wallet);

                mistakes = new JLabel("F: 9");
                mistakes.setAlignmentX(Component.CENTER_ALIGNMENT);
                mistakes.setFont(mistakes.getFont().deriveFont(16.0f));
                playerInfo.add(mistakes);
                
                playerInfo.setBorder(new EmptyBorder(20, 20, 20, 20));
                
            middlePanel.add(playerInfo);
                
                logo = new JLabel(new ImageIcon("img/logo/favicon.ico"));
                logo.setAlignmentX(Component.CENTER_ALIGNMENT);
                // playerInfo.add(logo);
                
                logo.setBorder(new EmptyBorder(20, 20, 20, 20));
                
            middlePanel.add(logo);
                
            player2Info = new JPanel();
            player2Info.setLayout(new BoxLayout(player2Info, BoxLayout.Y_AXIS));
                player = new JLabel("Player 2");
                player.setAlignmentX(Component.CENTER_ALIGNMENT);
                player.setFont(player.getFont().deriveFont(16.0f));
                player2Info.add(player);

                wallet = new JLabel("$800");
                wallet.setAlignmentX(Component.CENTER_ALIGNMENT);
                wallet.setFont(wallet.getFont().deriveFont(16.0f));
                player2Info.add(wallet);

                mistakes = new JLabel("F: 5");
                mistakes.setAlignmentX(Component.CENTER_ALIGNMENT);
                mistakes.setFont(mistakes.getFont().deriveFont(16.0f));
                player2Info.add(mistakes);
                
                player2Info.setBorder(new EmptyBorder(20, 20, 20, 20));
                
            middlePanel.add(player2Info);
        
        
        centeredBoxPanel.add(middlePanel);
        
        // espaciado
        centeredBoxPanel.add(Box.createVerticalStrut(10));  
        
        buttonsPanel = new JPanel();
        
            retryButton = new JButton("Volver a jugar");
            retryButton.setVerticalTextPosition(AbstractButton.CENTER);
            retryButton.setHorizontalTextPosition(AbstractButton.CENTER);
            retryButton.setMnemonic(KeyEvent.VK_R);

            buttonsPanel.add(retryButton);

            exitButton = new JButton("Acabar");
            exitButton.setVerticalTextPosition(AbstractButton.CENTER);
            exitButton.setHorizontalTextPosition(AbstractButton.CENTER);
            exitButton.setMnemonic(KeyEvent.VK_E);

            buttonsPanel.add(exitButton);
        
        centeredBoxPanel.add(buttonsPanel);
        
        // espaciado
        centeredBoxPanel.add(Box.createVerticalStrut(30));

        
        pane.add(centeredBoxPanel);
        
    }
    
}
