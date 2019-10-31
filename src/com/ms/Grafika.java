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

    public static final int WIDTH = 731;
    public static final int HEIGHT = 779;

    public static StackPane stackPane = new StackPane();


    @Override
    public void start(Stage primaryStage) {

        Scene scene = new Scene(stackPane, WIDTH, HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Plac Narutowicza");
        primaryStage.show();

        Image image = new Image("file:plN_v3.png");
        ImageView iv = new ImageView();
        iv.setImage(image);
        stackPane.getChildren().add(iv);


        light1 = new Lights(30, 0, 100, 340);
        light2 = new Lights(500, 0, 0, 570);
        light3 = new Lights(500, 0, 0, 585);
        light4 = new Lights(240, 0, 0, 385);
        light5 = new Lights(230, 0, 0, 415);
        light6 = new Lights(410, 0, 0, 455);
        light7 = new Lights(410, 0, 0, 440);
        light8 = new Lights(195, 0, 0, 640);

        Lights light0 = new Lights();
        light0.start();

    }



    class Paths {

        private int x;
        private int y;
        private PathTransition pathT;
        private Circle car = new Circle(5);
        private Circle tram = new Circle(5);

        public void doWork() {
            firstPath();
            secondPath();
//            thirdPath();
//            forthPath();
//            fifthPath();
//            sixthPath();
//            seventhPath();
//            eightPath();
//            ninthPath();
            // tenthPath();
            eleventhPath();
//            twelfthPath();
//            thirteenthPath();
//            fourteenPath();
//            fifteenthPath();
//            sixteenthPath();
//            seventeenthPath();
        }

        public void setCar(Circle car) {
            car.setFill(Color.BLACK);
        }

        public void setTram(Circle tram) {
            tram.setFill(Color.RED);
        }

        public void firstPath() {

            setCar(car);
            stackPane.getChildren().add(car);

            Path path = new Path();
            path.getElements().add(new MoveTo(380, -105));
            path.getElements().add(new CubicCurveTo(30, -140, 100, -300, -20, -140)); //first  for car
            path.getElements().add(new LineTo(-315, 400));
            path.setStrokeWidth(1);
            path.setStroke(Color.RED);

            stackPane.getChildren().add(path);

            pathT(path, car);
        }

        public void secondPath() {
            Circle car = new Circle(5, 5, 5);
            setCar(car);

            stackPane.getChildren().add(car);

            Path path = new Path();
            path.getElements().add(new MoveTo(380, -105));
            path.getElements().add(new CubicCurveTo(30, -140, 100, -300, -20, -140));
            path.getElements().add(new LineTo(-190, 170));
            path.getElements().add(new CubicCurveTo(-190, 170, -170, 330, 0, 245));
            path.getElements().add(new CubicCurveTo(0, 245, 230, 100, 160, -100));
            path.getElements().add(new CubicCurveTo(160, -100, 70, -200, 200, -400));

            path.setStrokeWidth(1);
            path.setStroke(Color.RED);

            stackPane.getChildren().add(path);

            pathT(path, car);
        }

        public void thirdPath() {
            Circle car = new Circle(5, 5, 5);
            setCar(car);

            stackPane.getChildren().add(car);

            Path path = new Path();
            path.getElements().add(new MoveTo(80, -400)); // 3rd  for car
            path.getElements().add(new LineTo(-360, 400));

            pathT(path, car);
        }

        public void forthPath() {
            Circle car = new Circle(5, 5, 5);
            setCar(car);

            stackPane.getChildren().add(car);

            Path path = new Path();
            path.getElements().add(new MoveTo(120, -400)); // 4th for car
            path.getElements().add(new LineTo(-315, 400));

            pathT(path, car);
        }

        public void fifthPath() {
            Circle car = new Circle(5, 5, 5);
            setCar(car);

            stackPane.getChildren().add(car);

            Path path = new Path();
            path.getElements().add(new MoveTo(120, -400)); //5th for car
            path.getElements().add(new LineTo(-190, 170));
            path.getElements().add(new CubicCurveTo(-190, 170, -170, 330, 0, 245));
            path.getElements().add(new CubicCurveTo(0, 245, 230, 100, 160, -100));
            path.getElements().add(new CubicCurveTo(160, -100, 70, -200, 200, -400));

            pathT(path, car);
        }

        public void sixthPath() {
            Circle car = new Circle(5, 5, 5);
            setCar(car);

            stackPane.getChildren().add(car);

            Path path = new Path();
            path.getElements().add(new MoveTo(-235, 400));    //6th for car
            path.getElements().add(new CubicCurveTo(-220, 350, -100, 270, 0, 245));
            path.getElements().add(new CubicCurveTo(0, 245, 230, 100, 160, -100));
            path.getElements().add(new CubicCurveTo(160, -100, 70, -200, 200, -400));

            pathT(path, car);
        }

        public void seventhPath() {
            Circle car = new Circle(5, 5, 5);
            setCar(car);

            stackPane.getChildren().add(car);

            Path path = new Path();
            path.getElements().add(new MoveTo(-210, 400));    //7th for car
            path.getElements().add(new CubicCurveTo(-220, 400, -100, 285, 0, 280));
            path.getElements().add(new CubicCurveTo(0, 280, 200, 200, 200, 0));
            path.getElements().add(new LineTo(165, -200));
            path.getElements().add(new CubicCurveTo(165, -200, 140, -300, 230, -400));

            pathT(path, car);
        }

        public void eightPath() {
            Circle car = new Circle(5, 5, 5);
            setCar(car);

            stackPane.getChildren().add(car);

            Path path = new Path();
            path.getElements().add(new MoveTo(-210, 400)); //8th for car
            path.getElements().add(new CubicCurveTo(-220, 400, -100, 285, 0, 280));
            path.getElements().add(new CubicCurveTo(0, 280, 200, 200, 200, 50));
            path.getElements().add(new CubicCurveTo(200, 50, 200, -60, 400, -70));

            pathT(path, car);
        }

        public void ninthPath() {

            setTram(tram);
            stackPane.getChildren().add(tram);

            Path path = new Path();
            path.getElements().add(new MoveTo(153, -400)); // 1st tram
            path.getElements().add(new LineTo(-285, 405));

            pathT(path, tram);
        }

        public void tenthPath() {

            setTram(tram);
            stackPane.getChildren().add(tram);

            Path path = new Path();
            path.getElements().add(new MoveTo(-272, 405)); // 2nd tram
            path.getElements().add(new LineTo(165, -400));

            path.setStrokeWidth(1);
            path.setStroke(Color.RED);

            stackPane.getChildren().add(path);

            pathT(path, tram);
        }

        public void eleventhPath() {

            setTram(tram);
            stackPane.getChildren().add(tram);

            Path path = new Path();
            path.getElements().add(new MoveTo(-272, 405)); // 3rd tram
            path.getElements().add(new LineTo(-225, 320));
            path.getElements().add(new CubicCurveTo(-225, 320, -190, 280, -165, 278));
            path.getElements().add(new LineTo(-40, 222));
            path.getElements().add(new LineTo(40, 180));
            path.getElements().add(new CubicCurveTo(40, 180, 105, 110, 122, 60)); // junction
            path.getElements().add(new CubicCurveTo(122, 60, 165, -20, 268, -105));
            path.getElements().add(new CubicCurveTo(268, -105, 300, -135, 380, -130));

            path.setStrokeWidth(1);
            path.setStroke(Color.RED);

            stackPane.getChildren().add(path);

            pathT(path, tram);
        }

        public void twelfthPath() {

            setTram(tram);
            stackPane.getChildren().add(tram);

            Path path = new Path();
            path.getElements().add(new MoveTo(-272, 405)); // 4rd tram
            path.getElements().add(new LineTo(-225, 320));
            path.getElements().add(new CubicCurveTo(-225, 320, -190, 280, -165, 278));
            path.getElements().add(new LineTo(-40, 222));
            path.getElements().add(new LineTo(40, 180));
            path.getElements().add(new CubicCurveTo(40, 180, 105, 110, 122, 60)); // junction
            path.getElements().add(new CubicCurveTo(122, 60, 172, -57, 105, -205));
            path.getElements().add(new CubicCurveTo(105, -205, 85, -270, 105, -295));
            path.getElements().add(new LineTo(165, -400));

            pathT(path, tram);
        }

        public void thirteenthPath() {

            setTram(tram);
            stackPane.getChildren().add(tram);

            Path path = new Path();
            path.getElements().add(new MoveTo(375, -145));    // 5th tram
            path.getElements().add(new LineTo(21, -157));
            path.getElements().add(new LineTo(-285, 405));

            pathT(path, tram);

        }

        public void fourteenPath() {

            setTram(tram);
            stackPane.getChildren().add(tram);

            Path path = new Path();
            path.getElements().add(new MoveTo(375, -145));    // 6th tram
            path.getElements().add(new LineTo(21, -157));
            path.getElements().add(new LineTo(-140, 137));
            path.getElements().add(new CubicCurveTo(-140, 127, -195, 282, -30, 220));
            path.getElements().add(new LineTo(-0, 205));
            path.getElements().add(new CubicCurveTo(-0, 205, 100, 140, 122, 60)); //junction
            path.getElements().add(new CubicCurveTo(122, 60, 170, -15, 253, -95));
            path.getElements().add(new CubicCurveTo(253, -95, 305, -140, 380, -130));

            pathT(path, tram);
        }

        public void fifteenthPath() {

            setTram(tram);
            stackPane.getChildren().add(tram);

            Path path = new Path();
            path.getElements().add(new MoveTo(375, -145));    // 7th tram
            path.getElements().add(new LineTo(21, -157));
            path.getElements().add(new LineTo(-140, 137));
            path.getElements().add(new CubicCurveTo(-140, 127, -195, 282, -30, 220));
            path.getElements().add(new LineTo(-0, 205));
            path.getElements().add(new CubicCurveTo(-0, 205, 100, 140, 122, 60)); //junction
            path.getElements().add(new CubicCurveTo(122, 60, 172, -57, 105, -205));
            path.getElements().add(new CubicCurveTo(105, -205, 85, -270, 105, -295));
            path.getElements().add(new LineTo(165, -400));

            pathT(path, tram);
        }

        public void sixteenthPath() {

            setTram(tram);
            stackPane.getChildren().add(tram);

            Path path = new Path();
            path.getElements().add(new MoveTo(150, -395));  // 8th tram
            path.getElements().add(new LineTo(-140, 137));
            path.getElements().add(new CubicCurveTo(-140, 127, -195, 282, -30, 220));
            path.getElements().add(new LineTo(-0, 205));
            path.getElements().add(new CubicCurveTo(-0, 205, 100, 140, 122, 60)); //junction
            path.getElements().add(new CubicCurveTo(122, 60, 172, -57, 105, -205));
            path.getElements().add(new CubicCurveTo(105, -205, 85, -270, 105, -295));
            path.getElements().add(new LineTo(165, -400));

            pathT(path, tram);
        }

        public void seventeenthPath() {

            setTram(tram);
            stackPane.getChildren().add(tram);

            Path path = new Path();
            path.getElements().add(new MoveTo(150, -395));  // 8th tram
            path.getElements().add(new LineTo(-140, 137));
            path.getElements().add(new CubicCurveTo(-140, 127, -195, 282, -30, 220));
            path.getElements().add(new LineTo(-0, 205));
            path.getElements().add(new CubicCurveTo(-0, 205, 100, 140, 122, 60)); //junction
            path.getElements().add(new CubicCurveTo(122, 60, 170, -15, 253, -95));
            path.getElements().add(new CubicCurveTo(253, -95, 305, -140, 380, -130));

            pathT(path, tram);
        }

        public void pathT(Shape path, Node Vehicle) {
            pathT = new PathTransition();
            pathT.setDuration(Duration.millis(10000));
            pathT.setPath(path);
            pathT.setNode(Vehicle);
            pathT.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
            pathT.setCycleCount(5);
            play();

        }

        public void play() {
            pathT.play();
        }

        public void stop() {
            pathT.stop();
        }

    }

}

