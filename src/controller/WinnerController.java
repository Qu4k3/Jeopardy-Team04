package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.PlayerModel;
import view.PlayersDataView;
import view.WinnerView;

public class WinnerController implements ActionListener {

    private WinnerView view;
    private PlayerModel JugadorUno, JugadorDos;

    public WinnerController(WinnerView view, PlayerModel j1, PlayerModel j2) {
        this.view = view;
        this.JugadorUno = j1;
        this.JugadorDos = j2;

        //Set view data
        this.view.winner.setText(winner(j1, j2));

        this.view.player1.setText(j1.getName());
        this.view.player2.setText(j2.getName());

        this.view.wallet1.setText("$ " + Integer.toString(j1.getScore()));
        this.view.wallet2.setText("$ " + Integer.toString(j2.getScore()));

        //Add listeners to the view
        this.view.retryButton.addActionListener(this);
        this.view.exitButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == this.view.retryButton) {            
            PlayersDataView payersDataView = new PlayersDataView();
            PlayerModel model = new PlayerModel();
            PlayerDataController controller = new PlayerDataController(payersDataView, model);
        } else if (ae.getSource() == this.view.exitButton) {
            JOptionPane.showMessageDialog(view, "¡Gracias por jugar!");
            System.exit(0);
        }
    }
    
    public String winner(PlayerModel p1, PlayerModel p2) {
        if (p1.getScore() > p2.getScore()) {
            return "El ganador es " + p1.getName();
        } else {
            return "El ganador es " + p2.getName();
        }       
    }
}
