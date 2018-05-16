package sample;


import javafx.fxml.FXML;

import javafx.geometry.Bounds;
import javafx.scene.layout.AnchorPane;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Movement {

    public static Main main;
    public static double playerPosY;
    public static double playerPosX;
    public static double flyPosY;
    public static double flyPosX;
    public static int score=0;

    @FXML
    public Circle player;
    @FXML
    public Rectangle fly;
    @FXML
    public AnchorPane pane;
    @FXML
    public Text points;

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

        if(playerPosY>=flyPosY-10&&playerPosY<=flyPosY+30&&playerPosX<=flyPosX+30&&playerPosX>=flyPosX-10){

            ++score;
            points.setText("Points: "+score);
            fly.setLayoutY(ThreadLocalRandom.current().nextInt(10, 360 + 1));
            fly.setLayoutX(ThreadLocalRandom.current().nextInt(10, 570 + 1));

        }
    }

}
