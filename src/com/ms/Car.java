package com.ms;

import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Car extends Node {

    public int x;
    public int y;

    Rectangle car = new Rectangle();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public Car(int x,int y){
        car.setHeight(x);
        car.setWidth(y);
        car.setLayoutX(getX());
        car.setLayoutY(getY());
        car.setFill(Color.BLACK);

        Grafika.stackPane.getChildren().add(car);

    }

    @Override
    public Node getStyleableNode() {
        return null;
    }

}
