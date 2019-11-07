package com.ms;

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.image.ImageView;
import javafx.scene.shape.*;

import java.util.ArrayList;
import java.util.LinkedList;


import static com.ms.Lights.light1;
import static com.ms.Lights.light2;
import static com.ms.Lights.light3;
import static com.ms.Lights.light4;
import static com.ms.Lights.light5;
import static com.ms.Lights.light6;
import static com.ms.Lights.light7;
import static com.ms.Lights.light8;

public class Grafika extends Application {

    public static final int WIDTH = 600;
    public static final int HEIGHT = 600;

    public static StackPane stackPane = new StackPane();

    Car car1,car2,car3,car4,car5,car6,car7,car8;
    Tram tram1,tram2,tram3,tram4,tram5,tram6,tram7,tram8,tram9;

    @Override
    public void start(Stage primaryStage) {

        Scene scene = new Scene(stackPane, WIDTH, HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Plac Narutowicza");
        primaryStage.show();
        primaryStage.setResizable(true);

        Image image = new Image("file:plN_v7.png");
        ImageView iv = new ImageView();
        iv.setImage(image);
        stackPane.getChildren().add(iv);


        light1 = new Lights(15, 0, 0, 285);
        light2 = new Lights(400, 0, 0, 470);
        light3 = new Lights(400, 0, 0, 485);
        light4 = new Lights(180, 0, 0, 320);
        light5 = new Lights(180, 0, 0, 335);
        light6 = new Lights(300, 0, 0, 350);
        light7 = new Lights(300, 0, 0, 335);
        light8 = new Lights(140, 0, 0, 535);

        Lights light0 = new Lights();
        light0.start();

        car1 = new Car();
        car2 = new Car();
        car3 = new Car();
        car3 = new Car();
        car4 = new Car();
        car5 = new Car();
        car6 = new Car();
        car7 = new Car();
        car8 = new Car();

        car1.firstPath();
//        car1.secondPath();
//        car3.thirdPath();
//        car4.forthPath();
//        car5.fifthPath();
//        car6.sixthPath();
//        car7.seventhPath();
//        car8.eightPath();

        tram1 = new Tram();
        tram2 = new Tram();
        tram3 = new Tram();
        tram4 = new Tram();
        tram5 = new Tram();
        tram6 = new Tram();
        tram7 = new Tram();
        tram8 = new Tram();
        tram9 = new Tram();


//        tram1.ninthPath();
//        tram2.tenthPath();
        tram3.eleventhPath();
        tram4.twelfthPath();
//        tram5.thirteenthPath();
//        tram6.fourteenPath();
//        tram7.fifteenthPath();
//        tram8.sixteenthPath();
//        tram9.seventeenthPath();


    }

}

