package com.ms;

import javafx.animation.PathTransition;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.util.Duration;

public class Tram{

    public int x;
    public int y;
    private final int RADIUS =5;
    PathTransition pathT;

    Circle tram = new Circle(RADIUS);


    public Tram() {

        tram.setLayoutX(getX());
        tram.setLayoutY(getY());
        tram.setFill(Color.RED);

        Grafika.stackPane.getChildren().add(tram);

    }

    public void ninthPath() {

        Path path = new Path();
        path.getElements().add(new MoveTo(120, -310)); // 1st tram
        path.getElements().add(new LineTo(-240, 310));

        pathT(path, tram);
    }

    public void tenthPath() {


        Path path = new Path();
        path.getElements().add(new MoveTo(-228, 310)); // 2nd tram
        path.getElements().add(new LineTo(130, -310));

        path.setStrokeWidth(1);
        path.setStroke(Color.RED);

        Grafika.stackPane.getChildren().add(path);

        pathT(path, tram);
    }

    public void eleventhPath() {

        Path path = new Path();
        path.getElements().add(new MoveTo(-228, 310)); // 3rd tram
        path.getElements().add(new LineTo(-188, 242));
        path.getElements().add(new CubicCurveTo(-150, 214, -150, 214, -25, 165));
        path.getElements().add(new CubicCurveTo(67, 108, 67, 108, 90, 50)); //junction
        path.getElements().add(new CubicCurveTo(200, -94, 200, -94, 310,-105 ));

        Grafika.stackPane.getChildren().add(path);

        pathT(path, tram);
    }

    public void twelfthPath() {

        Path path = new Path();
        path.getElements().add(new MoveTo(-228, 310)); // 4rd tram
        path.getElements().add(new LineTo(-188, 242));
        path.getElements().add(new CubicCurveTo(-150, 214, -150, 214, -10, 158));
        path.getElements().add(new CubicCurveTo(50, 100, 50, 100, 68, 55));

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

    public void play() {
        pathT.play();
    }

    public void stop() {
        pathT.stop();
    }

    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }

}
