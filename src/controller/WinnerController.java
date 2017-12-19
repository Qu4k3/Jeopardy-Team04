package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.PlayerModel;
import view.WinnerView;

public class WinnerController implements ActionListener {

    private PlayerModel model;
    private WinnerView view;

    public WinnerController(PlayerModel model, WinnerView view) {
        this.model = model;
        this.view = view;
        
        //Set view data
        this.view.player1.setText("Enhorabuena, " + "player_name!");
        
        this.view.player1.setText("player1_name");
        this.view.player2.setText("player2_name");
        
        this.view.wallet1.setText("$200");
        this.view.wallet2.setText("$500");
        
        this.view.mistakes1.setText("7");        
        this.view.mistakes2.setText("5");

        //Add listeners to the view
        this.view.retryButton.addActionListener(this);
        this.view.exitButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == this.view.retryButton) {
            //new PlayerDataController(, view);
        } else if (ae.getSource() == this.view.exitButton) {
            System.exit(0);
        }
    }

}
