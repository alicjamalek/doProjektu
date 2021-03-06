package pl.kurs.main;

import javafx.fxml.FXML;

public class AppController {

    private MainController mainController;
    @FXML
    public void backToMenu (){
        mainController.loadMainScreen();

    }
    public void setMainController (MainController mainController){
        this.mainController = mainController;
    }

}
