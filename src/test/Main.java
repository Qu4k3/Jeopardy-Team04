
package test;

import view.PlayersDataView;
import view.BoardView;
import view.StartView;
import view.WinnerView;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        //StartView view = new StartView(); 
        WinnerView view = new WinnerView();


        //StartView.startPantallaInicio();        



        PlayersDataView view = new PlayersDataView();

        
        //StartView.startPantallaInicio();
        BoardView view = new BoardView();
        //BoardController controller = new BoardController(view);

        
    }

}
