package com.ms;

import javafx.animation.PathTransition;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyDoubleWrapper;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.Node;
import javafx.scene.shape.*;
import javafx.util.Duration;
import static java.lang.Math.sqrt;


public class Car {

    private final DoubleProperty xVelocity;
    private final DoubleProperty yVelocity;
    private final ReadOnlyDoubleWrapper speed;
    private final double radius;
    private final double mass;
    private PathTransition pathT;
    private int count;

    private final Circle car;

    public Car(double centerX, double centerY, int radius, double xVelocity, double yVelocity, double mass){
        this.car = new Circle(centerX, centerY, radius);
        this.xVelocity = new SimpleDoubleProperty(this,"xVelocity",xVelocity);
        this.yVelocity = new SimpleDoubleProperty(this, "yVelocity,", yVelocity);
        this.speed = new ReadOnlyDoubleWrapper(this,"speed");
        speed.bind(Bindings.createDoubleBinding(() -> {
            final double xVel = getxVelocity();
            final double yVel = getyVelocity();
            return sqrt(xVel * xVel + yVel * yVel);
        },this.xVelocity, this.yVelocity));
        this.mass = mass;
        this.radius = radius;
        car.setRadius(radius);
        Grafika.stackPane.getChildren().add(getCar());


    }

    public void firstPath() {

        Path path = new Path();
        path.getElements().add(new MoveTo(380, -105));
        path.getElements().add(new CubicCurveTo(30, -140, 100, -300, -20, -140)); //first  for car
        path.getElements().add(new LineTo(-315, 400));

        pathT(path, car);
    }

    public void secondPath() {

        Path path = new Path();
        path.getElements().add(new MoveTo(380, -105));
        path.getElements().add(new CubicCurveTo(30, -140, 100, -300, -20, -140));
        path.getElements().add(new LineTo(-190, 170));
        path.getElements().add(new CubicCurveTo(-190, 170, -170, 330, 0, 245));
        path.getElements().add(new CubicCurveTo(0, 245, 230, 100, 160, -100));
        path.getElements().add(new CubicCurveTo(160, -100, 70, -200, 200, -400));

        pathT(path, car);
    }

    public void thirdPath() {

        Path path = new Path();
        path.getElements().add(new MoveTo(80, -400)); // 3rd  for car
        path.getElements().add(new LineTo(-360, 400));

        pathT(path, car);
    }

    public void forthPath() {

        Path path = new Path();
        path.getElements().add(new MoveTo(120, -400)); // 4th for car
        path.getElements().add(new LineTo(-315, 400));

        pathT(path, car);
    }

    public void fifthPath() {

        Path path = new Path();
        path.getElements().add(new MoveTo(120, -400)); //5th for car
        path.getElements().add(new LineTo(-190, 170));
        path.getElements().add(new CubicCurveTo(-190, 170, -170, 330, 0, 245));
        path.getElements().add(new CubicCurveTo(0, 245, 230, 100, 160, -100));
        path.getElements().add(new CubicCurveTo(160, -100, 70, -200, 200, -400));

        pathT(path, car);
    }

    public void sixthPath() {

        Path path = new Path();
        path.getElements().add(new MoveTo(-235, 400));    //6th for car
        path.getElements().add(new CubicCurveTo(-220, 350, -100, 270, 0, 245));
        path.getElements().add(new CubicCurveTo(0, 245, 230, 100, 160, -100));
        path.getElements().add(new CubicCurveTo(160, -100, 70, -200, 200, -400));

        pathT(path, car);
    }

    public void seventhPath() {

        Path path = new Path();
        path.getElements().add(new MoveTo(-210, 400));    //7th for car
        path.getElements().add(new CubicCurveTo(-220, 400, -100, 285, 0, 280));
        path.getElements().add(new CubicCurveTo(0, 280, 200, 200, 200, 0));
        path.getElements().add(new LineTo(165, -200));
        path.getElements().add(new CubicCurveTo(165, -200, 140, -300, 230, -400));

        pathT(path, car);
    }

    public void eightPath() {

        Path path = new Path();
        path.getElements().add(new MoveTo(-210, 400)); //8th for car
        path.getElements().add(new CubicCurveTo(-220, 400, -100, 285, 0, 280));
        path.getElements().add(new CubicCurveTo(0, 280, 200, 200, 200, 50));
        path.getElements().add(new CubicCurveTo(200, 50, 200, -60, 400, -70));

        pathT(path, car);
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

    public void stop(){
        pathT.stop();
    }

    public Circle getCar() {
        return car;
    }

    public double getxVelocity() {
        return xVelocity.get();
    }

    public DoubleProperty xVelocityProperty() {
        return xVelocity;
    }

    public void setxVelocity(double xVelocity) {
        this.xVelocity.set(xVelocity);
    }

    public double getyVelocity() {
        return yVelocity.get();
    }

    public DoubleProperty yVelocityProperty() {
        return yVelocity;
    }

    public void setyVelocity(double yVelocity) {
        this.yVelocity.set(yVelocity);
    }

    public void selectPath(int count){
        switch (count){
            case 1:
                firstPath();
                break;
            case 2:
                secondPath();
                break;
            case 3:
                thirdPath();
                break;
            case 4:
                forthPath();
                break;
            case 5:
                fifthPath();
                break;
            case 6:
            sixthPath();
                break;
            case 7:
                seventhPath();
                break;
            case 8:
                eightPath();
                break;
        }

    }
}
