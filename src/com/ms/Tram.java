package com.ms;

import javafx.animation.PathTransition;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.util.Duration;

public class Tram {

    private PathTransition pathT;
    private int Radius = 5;
    Circle tram = new Circle(Radius);


    public Tram() {

        tram.setFill(Color.RED);
        Grafika.stackPane.getChildren().add(tram);

    }

    public void ninthPath() {

        Path path = new Path();
        path.getElements().add(new MoveTo(153, -400)); // 1st tram
        path.getElements().add(new LineTo(-285, 405));

        pathT(path, tram);
    }

    public void tenthPath() {

        Path path = new Path();
        path.getElements().add(new MoveTo(-272, 405)); // 2nd tram
        path.getElements().add(new LineTo(165, -400));

        path.setStrokeWidth(1);
        path.setStroke(Color.RED);

        Grafika.stackPane.getChildren().add(path);

        pathT(path, tram);
    }

    public void eleventhPath() {


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

        Grafika.stackPane.getChildren().add(path);

        pathT(path, tram);
    }

    public void twelfthPath() {

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


        Path path = new Path();
        path.getElements().add(new MoveTo(375, -145));    // 5th tram
        path.getElements().add(new LineTo(21, -157));
        path.getElements().add(new LineTo(-285, 405));

        pathT(path, tram);

    }

    public void fourteenPath() {

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
        play();
    }

    public void play(){
        pathT.play();
    }

}
