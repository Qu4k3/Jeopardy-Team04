package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartView {
    
    private static JLabel message1;
    private static JLabel message2;
    private static JLabel message3;
    private static JLabel animation;
    
    private static void addComponentsToPane(Container pane) {

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));

        centerPanel.add(Box.createVerticalStrut(30));
        
        JLabel picture = new JLabel(new ImageIcon("img/logo/jeo_green.png"));
        picture.setAlignmentX(Component.CENTER_ALIGNMENT);
        centerPanel.add(picture);

        
        centerPanel.add(Box.createVerticalStrut(50));
        
        // Gif de carga
        animation = new JLabel(new ImageIcon("img/animated/gift.GIF"));
        animation.setAlignmentX(Component.CENTER_ALIGNMENT);
        centerPanel.add(animation);
        
        centerPanel.add(Box.createVerticalStrut(50));

        //Define panel de los mensajes
        message1 = new JLabel("Preparando aplicación para su uso...");
        message1.setVisible(false);
        message1.setAlignmentX(Component.CENTER_ALIGNMENT);
        message1.setFont(message1.getFont().deriveFont(16.0f));
        centerPanel.add(message1);

        message2 = new JLabel("Inicializando componentes del tablero...");
        message2.setVisible(false);
        message2.setAlignmentX(Component.CENTER_ALIGNMENT);
        message2.setFont(message2.getFont().deriveFont(16.0f));
        centerPanel.add(message2);

        message3 = new JLabel("Iniciando la aplicación...");
        message3.setVisible(false);
        message3.setAlignmentX(Component.CENTER_ALIGNMENT);
        message3.setFont(message3.getFont().deriveFont(16.0f));
        centerPanel.add(message3);

        
        pane.add(centerPanel);

        //creamos panel parte de abajo
        JPanel parteAbajoPanel = new JPanel();
        parteAbajoPanel.setLayout(new BorderLayout());

        //Define panel parte abajo
        JLabel authors = new JLabel(" Team 04 - Michael Egea, Paul Guillamon, Diego Santamarta");
        parteAbajoPanel.add(authors);

        pane.add(parteAbajoPanel, BorderLayout.PAGE_END);

    }
    
    public static void startPantallaInicio() {

        JFrame frame = new JFrame("JeopardyGame! - Iniciando");
        frame.setPreferredSize(new Dimension(560, 360));
        frame.setLocation(250, 250);
        frame.setResizable(false);
        ImageIcon img = new ImageIcon("img/logo/favicon.ico");
        frame.setIconImage(img.getImage());

        addComponentsToPane(frame.getContentPane());
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        showmesage();
        
        try {
            Thread.sleep(1000);
            frame.setVisible(false);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void showmesage() {

        try {
            message1.setVisible(true);
            animation.setVisible(true);
            Thread.sleep(3000);

        } catch (InterruptedException ex) {
            System.out.println("fallo");
        }

        try {
            message1.setVisible(false);
            message2.setVisible(true);
            animation.setVisible(true);
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            System.out.println("fallo");
        }
        try {
            message1.setVisible(false);
            message2.setVisible(false);
            message3.setVisible(true);
            animation.setVisible(true);
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            System.out.println("fallo");
        }
    }
    
}
