package com.ms;

import javafx.animation.PathTransition;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.util.Duration;

public class Car extends Thread{

    public int x;
    public int y;
    protected final int RADIUS = 5;
    private final int DURATION = 10000;
    PathTransition pathT;
    public int config =0;

    Circle car = new Circle(RADIUS);

    public Car(){

        car.setLayoutX(getX());
        car.setLayoutY(getY());
        car.setFill(Color.BLACK);

        Grafika.stackPane.getChildren().add(car);

    }

    public void firstPath() {

        Path path = new Path();
        path.getElements().add(new MoveTo(300, -80));
        path.getElements().add(new LineTo(255, -85));
        path.getElements().add(new LineTo(50, -150));
        path.getElements().add(new CubicCurveTo(50, -150, 0, -150, -15, -110));
        path.getElements().add(new LineTo(-265, 310));
        path.setStrokeWidth(1);
        path.setStroke(Color.RED);

        Grafika.stackPane.getChildren().add(path);

        pathT(path, car);
    }

    public void secondPath() {

        Path path = new Path();

        path.getElements().add(new MoveTo(300, -80));
        path.getElements().add(new LineTo(255, -85));
        path.getElements().add(new LineTo(50, -150));
        path.getElements().add(new CubicCurveTo(50, -150, 0, -150, -15, -110));
        path.getElements().add(new LineTo(-150, 125));
        path.getElements().add(new LineTo(-125, 185));
        path.getElements().add(new LineTo(-65, 210)); // wazny punkt
        path.getElements().add(new CubicCurveTo(0, 200, 85, 125, 125, 60)); //stop
        path.getElements().add(new CubicCurveTo(170, -50, 85, -150, 110, -200));
        path.getElements().add(new CubicCurveTo(115, -250, 115, -250, 150, -310));

        path.setStrokeWidth(1);
        path.setStroke(Color.BLACK);

        Grafika.stackPane.getChildren().add(path);

        pathT(path, car);
    }

    public void thirdPath() {

        Path path = new Path();
        path.getElements().add(new MoveTo(55, -310)); // 3rd  for car
        path.getElements().add(new LineTo(25,-260));
        path.getElements().add(new LineTo(-305, 310));
        path.setStrokeWidth(1);
        path.setStroke(Color.RED);

        Grafika.stackPane.getChildren().add(path);

        pathT(path, car);
    }

    public void forthPath() {

        Path path = new Path();

        path.getElements().add(new MoveTo(95, -310)); // 4th for car
        path.getElements().add(new LineTo(55, -245));
        path.getElements().add(new LineTo(-265, 310));

        pathT(path, car);
    }

    public void fifthPath() {

        Path path = new Path();

        path.getElements().add(new MoveTo(95, -310)); //5th for car
        path.getElements().add(new LineTo(-150, 125));
        path.getElements().add(new LineTo(-125, 185));
        path.getElements().add(new LineTo(-65, 210)); // wazny punkt
        path.getElements().add(new CubicCurveTo(0, 200, 85, 125, 125, 60)); //stop
        path.getElements().add(new CubicCurveTo(170, -50, 85, -150, 110, -200));
        path.getElements().add(new CubicCurveTo(115, -250, 115, -250, 150, -310));
        pathT(path, car);
    }

    public void sixthPath() {

        Path path = new Path();

        path.getElements().add(new MoveTo(-200, 310)); //6th for car
        path.getElements().add(new CubicCurveTo(-140,220,-140,220,-65,210));
        path.getElements().add(new CubicCurveTo(0, 200, 85, 125, 125, 60)); //stop
        path.getElements().add(new CubicCurveTo(170, -50, 85, -150, 110, -200));
        path.getElements().add(new CubicCurveTo(115, -250, 115, -250, 150, -310));

        pathT(path, car);
    }

    public void seventhPath() {

        Path path = new Path();

        path.getElements().add(new MoveTo(-180, 310));    //7th for car
        path.getElements().add(new CubicCurveTo(-125,215,-25,235,0,215));
        path.getElements().add(new CubicCurveTo(60,200,60,200,155,70)); //stop
        path.getElements().add(new CubicCurveTo(210,-50,50,-200,190,-310));
        pathT(path, car);
    }

    public void eightPath() {

        Path path = new Path();
        path.getElements().add(new MoveTo(-180, 310));
        path.getElements().add(new CubicCurveTo(-125,215,-25,235,0,215));
        path.getElements().add(new CubicCurveTo(60,200,60,200,155,70)); //stop
        path.getElements().add(new CubicCurveTo(200,-25,200,-25,310,-50));

        pathT(path, car);
    }

    public void pathT(Shape path, Node Vehicle) {

        pathT = new PathTransition();
        pathT.setDuration(Duration.millis(DURATION));
        pathT.setPath(path);
        pathT.setNode(Vehicle);
        pathT.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        play();

    }

    public void play() {
        pathT.play();
    }

    @Override
    public void run(){

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


}


