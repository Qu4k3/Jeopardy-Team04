package test;

import view.*;
import model.*;
import controller.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        
        StartView startView = new StartView();   
        
        //PlayersDataView payersDataView = new PlayersDataView();
        
        PlayerModel model = new PlayerModel();
        WinnerView view = new WinnerView();
        WinnerController controller = new WinnerController(model, view);
        
        //StartView.startPantallaInicio();
        // BoardView view = new BoardView();
        //BoardController controller = new BoardController(view);

        
        //BoardView view = new BoardView();
/*       PlayersDataView view = new PlayersDataView(); *///CategoryView view = new CategoryView();
    }

}
