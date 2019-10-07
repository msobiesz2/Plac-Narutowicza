package com.ms;

import javafx.scene.shape.Rectangle;

public class Tram {

    public int x;
    public int y;

    Rectangle tram = new Rectangle();

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

    public Tram(int x, int y) {
        setX(x);
        setY(y);
        tram.setHeight(5);
        tram.setWidth(5);
        tram.setLayoutX(getX());
        tram.setLayoutY(getY());

        Grafika.stackPane.getChildren().add(tram);

    }
}
