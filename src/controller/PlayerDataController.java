/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.PlayerModel;
import view.PlayersDataView;

/**
 *
 * @author Diego
 */
public class PlayerDataController implements ActionListener {

    private view.PlayersDataView viewData;
    private model.PlayerModel modeloPlayer;
//    static PlayerModel PlayerOne = new PlayerModel();
//    static PlayerModel PlayerTwo = new PlayerModel();

    public PlayerDataController(PlayersDataView viewData) {
        this.viewData = viewData;
        this.viewData.startGame.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.viewData.startGame) {
            //if general playerOne y playerTwo
            if ((this.viewData.playerOne.getText().isEmpty() || this.viewData.playerOne.getText().contains(" "))
                    && (this.viewData.playerTwo.getText().isEmpty() || this.viewData.playerTwo.getText().contains(" "))) {

                JOptionPane.showMessageDialog(viewData, "No has ingresado ningun nombre a los jugadores. \n los nombres tienen que ser sin espacios");

            } else {

                if (this.viewData.playerOne.getText().isEmpty() || this.viewData.playerOne.getText().contains(" ")) {
                        JOptionPane.showMessageDialog(viewData, "No has ingresado un nombre para el PlayerOne \n o contiene alguno espacio");
                } else {
                    
                    if (this.viewData.playerTwo.getText().isEmpty() || this.viewData.playerTwo.getText().contains(" ")) {
                        JOptionPane.showMessageDialog(viewData, "No has ingresado un nombre para el PlayerTwo \n o contiene alguno espacio");

                    } else {
                            if (this.viewData.playerOne.getText().equals(this.viewData.playerTwo.getText())) {
                           JOptionPane.showMessageDialog(viewData, "los nombres de los players no pueden ser iguales");

                        }else{
                            JOptionPane.showMessageDialog(viewData, "\t Bienvenidos Jugadores: \n PlayerOne: " + viewData.playerOne.getText() + " PlayerTwo: " + viewData.playerTwo.getText());

                            }

                    }
                }
            }

        }

    }
}
