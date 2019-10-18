package com.ms;

import javafx.animation.PauseTransition;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;


public class Lights {

    private Circle circleRed, circleGreen;
    private Color[] colors = {Color.RED, Color.GREEN};
    private int onColor = 0;
    private static final int PAUSE = 2;

    public void trafficLights(int top, int right, int bottom, int left) {

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(top, right, bottom, left));
        gridPane.setHgap(5);
        gridPane.setVgap(5);

        circleRed = new Circle(5);
        circleRed.setStroke(Color.BLACK);
        circleRed.setFill(Color.GREY);

        circleGreen = new Circle(5);
        circleGreen.setStroke(Color.BLACK);
        circleGreen.setFill(Color.GREY);

        gridPane.add(circleGreen, 1, 1);
        gridPane.add(circleRed, 1, 2);
        Grafika.stackPane.getChildren().add(gridPane);
    }

    public void firstLight() {

            trafficLights(30, 0, 100, 340);
            update();

    }

    public void secondLight() {

            trafficLights(500, 0, 0, 570);
            update();

    }

    public void thirdight(){
            trafficLights(500,0,0,585);
            update();
        }

    public void forthLight(){
            trafficLights(240,0,0,385);
            update();
        }

    public void fifthLight(){
            trafficLights(230,0,0,415);
            update();
        }


    public void sixthLight(){
            trafficLights(410,0,0,455);
            update();
        }

    public void seventhLight(){
            trafficLights(410,0,0,440);
            update();
        }

    private void update() {

        PauseTransition pause = new PauseTransition(Duration.seconds(PAUSE));
        pause.setOnFinished(event ->{

        circleRed.setFill((onColor == 0) ? colors[onColor] : Color.GREY);
        circleGreen.setFill((onColor == 1) ? colors[onColor] : Color.GREY);
        onColor = ((onColor + 1) >= colors.length) ? 0 : onColor + 1;
        pause.play();
       
        });

        pause.play();
    }
}

