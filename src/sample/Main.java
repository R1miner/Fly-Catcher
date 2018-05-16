package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    public static Stage primaryStage;
    public static Scene scene;
    public static FXMLLoader loader1;

    @Override
    public void start(Stage primaryStage) {
        Main.primaryStage = primaryStage;
        mainWindow();
    }

    public void mainWindow() {
        try {
            loader1 = new FXMLLoader(Main.class.getResource("stage1.fxml"));

            AnchorPane pane = loader1.load();

            Movement movementController = loader1.getController();
            movementController.setMain(this);

            scene = new Scene(pane);
            scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
                @Override
                public void handle(KeyEvent event) {
                    if (event.getCode() == KeyCode.UP) {
                        movementController.moveUp();
                    } else if (event.getCode() == KeyCode.DOWN) {
                        movementController.moveDown();
                    } else if (event.getCode() == KeyCode.LEFT) {
                        movementController.moveLeft();
                    }else if (event.getCode() == KeyCode.RIGHT) {
                        movementController.moveRight();
                    }else if(event.getCode()==KeyCode.SPACE){
                        movementController.collision();
                    }
                }
            });

            primaryStage.setScene(scene);
            primaryStage.setTitle("FlyCatcher");

            primaryStage.show();

        } catch (IOException e) {

            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}
