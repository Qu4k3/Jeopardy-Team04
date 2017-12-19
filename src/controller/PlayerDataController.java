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
import view.CategoryView;
import view.PlayersDataView;

/**
 *
 * @author Diego
 */
public class PlayerDataController implements ActionListener {

    private view.PlayersDataView viewData;
    private model.PlayerModel playerModel;
    PlayerModel PlayerOne;
    PlayerModel PlayerTwo;

    public PlayerDataController(PlayersDataView viewData, PlayerModel modelPlayer) {
        this.playerModel = modelPlayer;
        this.viewData = viewData;
        this.viewData.startGame.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.viewData.startGame) {
            //if general playerOne y playerTwo
            if ((this.viewData.playerOne.getText().isEmpty() || this.viewData.playerOne.getText().contains(" "))
                    && (this.viewData.playerTwo.getText().isEmpty() || this.viewData.playerTwo.getText().contains(" "))) {
                JOptionPane.showMessageDialog(viewData, "No has ingresado ningun nombre a los jugadores. \nLos nombres tienen que ser sin espacios","¡¡Error!!", 0);

            } else {

                if (this.viewData.playerOne.getText().isEmpty() || this.viewData.playerOne.getText().contains(" ")) {
                    JOptionPane.showMessageDialog(viewData, "No has ingresado un nombre para el PlayerOne \n o contiene alguno espacio","¡¡Error!!", 0);

                } else {

                    if (this.viewData.playerTwo.getText().isEmpty() || this.viewData.playerTwo.getText().contains(" ")) {
                        JOptionPane.showMessageDialog(viewData, "No has ingresado un nombre para el PlayerTwo \n o contiene alguno espacio","¡¡Error!!", 0);

                    } else {
                        if (this.viewData.playerOne.getText().equals(this.viewData.playerTwo.getText())) {
                            JOptionPane.showMessageDialog(viewData, "los nombres de los players no pueden ser iguales","¡¡Error!!", 0);


                        } else {
                            
                            PlayerOne = new PlayerModel(this.viewData.playerOne.getText());
                            PlayerTwo = new PlayerModel(this.viewData.playerTwo.getText());
                            
                            
                            JOptionPane.showMessageDialog(viewData, "Bienvenidos Jugadores: \n PlayerOne: " + viewData.playerOne.getText() + " PlayerTwo: " + viewData.playerTwo.getText(),"Registro Completo",1);
                            CategoryView CateView = new CategoryView();
                            CategoryController controller = new CategoryController(CateView,PlayerOne,PlayerTwo);
                        }

                    }
                }
            }

        }

    }
}
