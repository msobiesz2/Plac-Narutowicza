package com.ms;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Tram {

    private Circle tram = new Circle(5, 5, 5);
    private Grafika stackPane;
    private int x;
    private int y;
    private int path;
    private int cooX;
    private  int cooY;
    private int xy;

    public Tram(Grafika stackPane, Circle tram, int path){

        setTram(tram);
        this.path = path;
        this.stackPane = stackPane;
        x=0;
        y=0;
        xy = -1;
    }

    public void setTram(Circle tram) {
        this.tram = tram;
        tram.setFill(Color.RED);
    }

    public void move()
    {


    }
}
