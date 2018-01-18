package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.PlayerModel;
import view.WinnerView;

public class WinnerController implements ActionListener {

    private WinnerView view;
    private PlayerModel JugadorUno, JugadorDos;

    public WinnerController(WinnerView view, PlayerModel j1, PlayerModel j2) {
        this.view = view;
        this.JugadorUno = j1;
        this.JugadorDos = j2;

        //Set view data
        this.view.winner.setText(winnerOutput(j1, j2));

        this.view.player1.setText(j1.getName());
        this.view.player2.setText(j2.getName());

        this.view.wallet1.setText("$ " + Integer.toString(j1.getScore()));
        this.view.wallet2.setText("$ " + Integer.toString(j2.getScore()));

        //Add listeners to the view
        //this.view.jump20.addActionListener(this);
        this.view.exitButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == this.view.jump20) {
            //new PlayerDataController(, view);
        } else if (ae.getSource() == this.view.exitButton) {
            System.exit(0);
        }
    }
    
    public String winnerOutput(PlayerModel j1, PlayerModel j2){
        if (j1.getScore() > j2.getScore()) {
            return "¡El ganador es " + j1.getName()+"!";
        } else {
            return "¡El ganador es " + j2.getName()+"!";
        }
    }

}
