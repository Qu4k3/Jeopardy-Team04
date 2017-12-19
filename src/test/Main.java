package test;

import view.*;
import model.*;
import controller.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        
        //HashMap<String, ArrayList<QuestionModel>> test = LoadModel.CargarDatos();
        
        StartView startView = new StartView();   

        PlayersDataView payersDataView = new PlayersDataView();
        
        PlayerModel model = new PlayerModel();
        
        PlayerDataController controller = new PlayerDataController(payersDataView, model);
         
        
        //WinnerView view = new WinnerView();
        //WinnerController controller = new WinnerController(model, view);
        
        //StartView.startPantallaInicio();
        
        //BoardView view = new BoardView();
        //LoadModel model = new LoadModel();
        //BoardController controller = new BoardController(model, view);

        
        //BoardView view = new BoardView();
       //PlayersDataView view = new PlayersDataView(); 
       //CategoryView view = new CategoryView();
    }

}
