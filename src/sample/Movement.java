package sample;


import javafx.fxml.FXML;

import javafx.scene.layout.AnchorPane;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;


public class Movement {
    public static Main main;
    public double posX, posY;

    @FXML
    public Circle player;
    @FXML
    public Polygon fly;
    @FXML
    public AnchorPane pane;

    public void setMain(Main main) {
        Movement.main = main;
    }

    public void moveUp() {
        player.setLayoutY(player.getLayoutY() - 4);
    }

    public void moveDown() {
        player.setLayoutY(player.getLayoutY() + 4);
    }

    public void moveLeft() {
        player.setLayoutX(player.getLayoutX() - 4);
    }

    public void moveRight() {
        player.setLayoutX(player.getLayoutX() + 4);
    }

    public void collision() {
    }
}
