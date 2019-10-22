package com.ms;

import javafx.animation.FillTransition;
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
    private static final int PAUSE = 6;
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

    public void firstLight(int setColor) {

            trafficLights(30, 0, 100, 340);
            //update(setColor);
            redLight();

    }

    public void secondLight(int setColor) {

            trafficLights(500, 0, 0, 570);
            //update(setColor);
            greenLight();

    }

    public void thirdight(int setColor){
            trafficLights(500,0,0,585);
            update(setColor);
        }

    public void forthLight(int setColor){
            trafficLights(240,0,0,385);
            update(setColor);
        }

    public void fifthLight(int setColor){
            trafficLights(230,0,0,415);
            update(setColor);
        }

    public void sixthLight(int setColor){
            trafficLights(410,0,0,455);
            update(setColor);
        }

    public void seventhLight(int setColor){
            trafficLights(410,0,0,440);
            update(setColor);
        }

    public void eighthLight(int setColor){
            trafficLights(195,0,0,640);
            update(setColor);
    }

    private void update(int setColor) {

        PauseTransition pause = new PauseTransition(Duration.seconds(PAUSE));
        pause.setOnFinished(event -> {

                    if (setColor == 0) {

                        circleGreen.setFill((onColor == 0) ? colors[onColor] : Color.GREY);
                        //circleRed.setFill((onColor == 1) ? colors[onColor] : Color.GREY);
                        //onColor = ((onColor + 1) >= colors.length) ? 0 : onColor + 1;
                        pause.play();
                    } else if (setColor == 1){

                        //circleGreen.setFill((onColor == 1) ? colors[onColor- 1] : Color.GREY);
                        circleRed.setFill((onColor == 0) ? colors[onColor + 1] : Color.GREY);
                        //onColor = ((onColor + 1) >= colors.length) ? 0 : onColor + 1;
                        pause.play();
                }
            });
                    pause.play();
    }

    private void redLight(){
        FillTransition fill = new FillTransition(Duration.seconds(PAUSE),circleGreen,Color.GREY,Color.GREEN);
        //circleGreen.setFill((onColor == 0) ? colors[onColor] : Color.GREY);
        fill.play();


    }

    private void greenLight(){
        FillTransition fill = new FillTransition(Duration.seconds(PAUSE),circleRed,Color.GREY,Color.RED);
        //circleGreen.setFill((onColor == 0) ? colors[onColor] : Color.GREY);
        fill.play();

    }

    public void changeLights(){
        int red = 0;
        int green = 1;
        if(red == 1 && green == 0){
            //set light to red
        }else if(red ==0 && green ==1){
            //set light to green
        }

    }

    public void lightsConfig(int configOption){
        switch(configOption){
            case 1:
                firstLight(0); //green
                secondLight(1); //red
                thirdight(1); //green
                forthLight(1); //green
                fifthLight(0); //red
                sixthLight(1); //green
                seventhLight(0); //red
                eighthLight(0); //red
                break;

            case 2:
                firstLight(1); //green
                secondLight(1); //green
                thirdight(1); //green
                forthLight(0); //red
                fifthLight(1); //green
                sixthLight(0); //red
                seventhLight(1); //green
                eighthLight(0); //red
                break;

            case 3:
                firstLight(1); //red
                secondLight(1); //red
                thirdight(0); //green
                forthLight(1); //red
                fifthLight(0); //green
                sixthLight(1); //red
                seventhLight(1); //red
                eighthLight(0); //green
                break;

            case 4:
                firstLight(0); //green
                secondLight(1); //red
                thirdight(1); //green
                forthLight(0); //red
                fifthLight(0); //red
                sixthLight(1); //green
                seventhLight(1); //green
                eighthLight(0); //red
                break;
        }

    }

    public void selectConfig(int light){

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

        while(true) {

                try {
                    Thread.sleep(PAUSE);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                light++;
                if (light == 5) {
                    light = 1;
                }
                selectConfig(light);
            }
        }

    }


