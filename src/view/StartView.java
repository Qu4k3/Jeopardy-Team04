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

public class StartView extends JFrame {

    private static JLabel message1;
    private static JLabel message2;
    private static JLabel message3;
    private static JLabel animation;
    private static JLabel logo;
    private static JPanel centerPanel;

    public StartView() {

        this.setTitle("JeopardyGame! - Iniciando el juego");
        this.setPreferredSize(new Dimension(560, 360));
        this.setLocation(250, 250);
        this.setResizable(false);

        ImageIcon img = new ImageIcon("img/logo/favicon.ico");
        this.setIconImage(img.getImage());

        addComponentsToPane(this.getContentPane());
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        showmesage();

        try {
            Thread.sleep(1000);
            this.setVisible(false);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void addComponentsToPane(Container pane) {

        centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));

        // espaciado
        centerPanel.add(Box.createVerticalStrut(50));

        logo = new JLabel(new ImageIcon("img/logo/jeo_green.png"));
        logo.setAlignmentX(Component.CENTER_ALIGNMENT);
        centerPanel.add(logo);

        // espaciado
        centerPanel.add(Box.createVerticalStrut(50));

        // Gif de carga
        animation = new JLabel(new ImageIcon("img/animated/ripple.gif"));
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
