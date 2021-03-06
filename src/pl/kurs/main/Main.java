package pl.kurs.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start (Stage primaryStage) throws Exception{

        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("MainScreen.fxml"));
        StackPane stackPane = loader.load();
        Scene scene = new Scene (stackPane, 400, 400);

        primaryStage.setScene(scene);
        primaryStage.setTitle("App");
        primaryStage.show();


    }
}
