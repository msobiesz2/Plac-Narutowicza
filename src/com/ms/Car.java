package com.ms;

import javafx.scene.shape.Rectangle;

public class Car {

    public int x;
    public int y;

    Rectangle car = new Rectangle();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Car(int x, int y){
        setX(x);
        setY(y);
        car.setHeight(5);
        car.setWidth(5);
        car.setLayoutX(getX());
        car.setLayoutY(getY());

        Grafika.stackPane.getChildren().add(car);


    }
}
