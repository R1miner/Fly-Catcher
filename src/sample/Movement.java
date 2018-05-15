package sample;


import javafx.fxml.FXML;

import javafx.geometry.Bounds;
import javafx.scene.layout.AnchorPane;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;


public class Movement {

    public static Main main;
    public static double playerPosY;
    public static Double playerPosX;
    public static Double flyPosY;
    public static Double flyPosX;

    @FXML
    public Circle player;
    @FXML
    public Rectangle fly;
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
        playerPosY=player.getLayoutY();
        playerPosX=player.getLayoutX();
        flyPosY=fly.getLayoutY();
        flyPosX=fly.getLayoutX();
        System.out.println(playerPosY+"\t"+playerPosX+"\t"+flyPosY+"\t"+flyPosX);

        if(playerPosY>=104&&playerPosY<=132&&playerPosX<=285&&playerPosX>=253){

        }
    }
}
