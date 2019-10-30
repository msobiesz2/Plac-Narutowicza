package com.ms;

import javafx.animation.FillTransition;
import javafx.animation.PauseTransition;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;


public class Lights extends Thread {

    private Circle circleRed, circleGreen;
    private Color[] colors = {Color.RED, Color.GREEN};
    private int onColor = 0;
    private static final int PAUSE = 6;
    private int light = 1;
    public static Lights light1, light2, light3, light4, light5, light6, light7, light8;
    private boolean running;
    

    public Lights(int top, int right, int bottom, int left) {

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

        update();
    }

    public Lights(){


    }

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

//    public void firstLight(int setColor) {
//
//        trafficLights(30, 0, 100, 340);
//        update(setColor);
//
//    }
//
//    public void secondLight(int setColor) {
//
//            trafficLights(500, 0, 0, 570);
//            update(setColor);
//
//    }
//
//    public void thirdLight(int setColor){
//            trafficLights(500,0,0,585);
//            update(setColor);
//        }
//
//    public void forthLight(int setColor){
//            trafficLights(240,0,0,385);
//            update(setColor);
//        }
//
//    public void fifthLight(int setColor){
//            trafficLights(230,0,0,415);
//            update(setColor);
//        }
//
//    public void sixthLight(int setColor){
//            trafficLights(410,0,0,455);
//            update(setColor);
//        }
//
//    public void seventhLight(int setColor){
//            trafficLights(410,0,0,440);
//            update(setColor);
//        }
//
//    public void eighthLight(int setColor){
//            trafficLights(195,0,0,640);
//            update(setColor);
//    }
//@Override
//    public void run() {
//        while (true) {
//            try {
//                Thread.sleep(PAUSE);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            light++;
//            if (light == 5) {
//                light = 1;
//            }
//            selectConfig();
//        }
//    }
//

    private void update() {

        PauseTransition pause = new PauseTransition(Duration.seconds(PAUSE));
        pause.setOnFinished(event -> {

                circleGreen.setFill((onColor == 1) ? colors[onColor] : Color.GREY);
                circleRed.setFill((onColor == 0) ? colors[onColor] : Color.GREY);
                onColor = ((onColor + 1) >= colors.length) ? 0 : onColor + 1;

        });
        pause.play();
    }

    public void greenLight() {

        onColor = 1;
    }

    public void redLight() {

        onColor = 0;
    }

    public void lightsConfig(int lightOption) {
        switch (lightOption) {
            case 1:
                light1.greenLight();
                light2.redLight();
                light3.greenLight();
                light4.greenLight();
                light5.redLight();
                light6.greenLight();
                light7.redLight();
                light8.redLight();
                break;

            case 2:
                light1.greenLight();
                light2.greenLight();
                light3.greenLight();
                light4.redLight();
                light5.redLight();
                light6.redLight();
                light7.greenLight();
                light8.redLight();
                break;

            case 3:
                light1.redLight();
                light2.redLight();
                light3.greenLight();
                light4.redLight();
                light5.greenLight();
                light6.redLight();
                light7.redLight();
                light8.greenLight();
                break;

            case 4:
                light1.greenLight();
                light2.redLight();
                light3.greenLight();
                light4.redLight();
                light5.redLight();
                light6.greenLight();
                light7.greenLight();
                light8.redLight();
                break;
        }
    }

    public void selectConfig() {

        switch (light) {
            case 1:
                lightsConfig(1);
                break;
            case 2:
                lightsConfig(2);
                break;
            case 3:
                lightsConfig(3);
                break;
            case 4:
                lightsConfig(4);
                break;
        }
    }

    @Override
    public void run() {
        synchronized (this) {
            while (true) {
                try {
                    System.out.println("lights " + light);
                    Thread.sleep(PAUSE);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                light++;
                if (light == 5) {
                    light = 1;
                }
                System.out.println("lights2 " + light);
                selectConfig();
            }
        }
    }
}


