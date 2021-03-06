package pl.kurs.main;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MenuController {

    private MainController mainController;

    @FXML
    void exit() {
        Platform.exit();
    }

    @FXML
    void openAplication() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("AppScreen.fxml"));
        Pane pane = null;

        try{
            pane = loader.load();

        }
        catch (IOException e){
            e.printStackTrace();
        }

        AppController appController = loader.getController();

        appController.setMainController(mainController);

        mainController.setScreen(pane);

    }

    @FXML
    void openOption() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("OptionsScreen.fxml"));
        Pane pane = null;

        try {
            pane = loader.load();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        OptionsController optionsController = loader.getController();
        optionsController.setMainController(mainController);
        mainController.setScreen(pane);
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

}
