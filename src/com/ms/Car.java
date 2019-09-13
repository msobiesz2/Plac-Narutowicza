package com.ms;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class Car extends Thread{
    private int prCar;
    private int x;
    private int y;
    private int path;
    private int cooX;
    private  int cooY;
    private Grafika stackPane;
    private int xy;
    private Circle car = new Circle(5, 5, 5);


    public Car(Grafika stackPane, Circle car, int path){

        setCar(car);
        this.path = path;
        this.prCar = prCar;
        this.stackPane = stackPane;
        x=0;
        y=0;
        xy = -1;

    }

    public void setCar(Circle car) {
        this.car = car;
        car.setFill(Color.BLUE);
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

}
