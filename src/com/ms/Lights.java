package com.ms;

import javafx.animation.PauseTransition;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class Lights implements Runnable{

    private Circle circleRed, circleGreen;
    private Color[] colors = {Color.RED, Color.GREEN};
    private int onColor = 0;
    private static final int PAUSE = 5;
    private int light;

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

    public void firstLight(int red, int green) {

            trafficLights(30, 0, 100, 340);
            update(red,green);

    }

    public void secondLight(int red, int green) {

            trafficLights(500, 0, 0, 570);
            update(red,green);

    }

    public void thirdight(int red, int green){
            trafficLights(500,0,0,585);
            update(red,green);
        }

    public void forthLight(int red, int green){
            trafficLights(240,0,0,385);
            update(red,green);
        }

    public void fifthLight(int red, int green){
            trafficLights(230,0,0,415);
            update(red,green);
        }

    public void sixthLight(int red, int green){
            trafficLights(410,0,0,455);
            update(red,green);
        }

    public void seventhLight(int red, int green){
            trafficLights(410,0,0,440);
            update(red,green);
        }

    public void eighthLight(int red, int green){
        trafficLights(195,0,0,640);
            update(red,green);
    }

    private void update(int red, int green) {

        PauseTransition pause = new PauseTransition(Duration.seconds(PAUSE));
        pause.setOnFinished(event ->{

        circleRed.setFill((onColor == red) ? colors[onColor] : Color.GREY);
        circleGreen.setFill((onColor == green) ? colors[onColor] : Color.GREY);
        onColor = ((onColor + 1) >= colors.length) ? 0 : onColor + 1;
        pause.play();

        });

        pause.play();
    }

    public void lightsConfig(int configOption){
        if (configOption == 1){
            firstLight(0,1); //green
            secondLight(1,0); //red
            thirdight(0,1); //green
            forthLight(0,1); //green
            fifthLight(1,0); //red
            sixthLight(0,1); //green
            seventhLight(1,0); //red
            eighthLight(1,0); //red
        } else if (configOption == 2){
            firstLight(0,1); //green
            secondLight(0,1); //green
            thirdight(0,1); //green
            forthLight(1,0); //red
            fifthLight(0,1); //green
            sixthLight(1,0); //red
            seventhLight(0,1); //green
            eighthLight(1,0); //red
        } else if (configOption == 3){
            firstLight(1,0); //red
            secondLight(1,0); //red
            thirdight(0,1); //green
            forthLight(1,0); //red
            fifthLight(0,1); //green
            sixthLight(1,0); //red
            seventhLight(1,0); //red
            eighthLight(0,1); //green
        } else if (configOption == 4){
            firstLight(0,1); //green
            secondLight(1,0); //red
            thirdight(0,1); //green
            forthLight(1,0); //red
            fifthLight(1,0); //red
            sixthLight(0,1); //green
            seventhLight(0,1); //green
            eighthLight(1,0); //red
        }

    }

    public void selectConfig(){

        switch (light){
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
    public void run(){

        while (true) {

                try {
                    Thread.sleep(PAUSE);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                light++;
                if (light == 5) {
                    light = 1;
                }
                selectConfig();
            }
        }

    }
    

