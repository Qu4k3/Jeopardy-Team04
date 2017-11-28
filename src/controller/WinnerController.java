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
