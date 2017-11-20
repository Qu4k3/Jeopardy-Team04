
package test;

import view.BoardView;
import view.CategoryView;
import view.PlayersDataView;
import view.StartView;
import view.WinnerView;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //StartView.startPantallaInicio();         
        
        
        //StartView view = new StartView(); 
        WinnerView view = new WinnerView();


        //StartView.startPantallaInicio();        



        PlayersDataView view = new PlayersDataView();

        
        //StartView.startPantallaInicio();
        BoardView view = new BoardView();
        //BoardController controller = new BoardController(view);

        
        BoardView view = new BoardView();
/*       PlayersDataView view = new PlayersDataView(); *///CategoryView view = new CategoryView();
    }

}
