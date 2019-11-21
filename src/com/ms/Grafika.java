package com.ms;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Random;

import static com.ms.Lights.*;
import static java.lang.Math.*;
import static javafx.scene.paint.Color.*;


public class Grafika extends Application {

    public static final int WIDTH = 731;
    public static final int HEIGHT = 779;
    private static final int NUM_CARS =50;
    private static final int NUM_TRAMS = 50;
    private static final int RADIUS = 5;
    private static final double MIN_SPPED = 10;
    private static final double MAX_SPEED = 15;
    private final Color[] COLORS  = new Color[] {RED, YELLOW, GREEN,BLUE,BROWN,PINK,BLACK};

    public static StackPane stackPane = new StackPane();

    public static Car car1,car2,car3,car4,car5,car6,car7,car8,car9;
    public static Tram tram1,tranm,tram3,tram4,tram5,tram6,tram7,tram8,tram9;

    private ObservableList<Car> cars = FXCollections.observableArrayList();
    private ObservableList<Tram> trams = FXCollections.observableArrayList();

    @Override
    public void start(Stage primaryStage) {

        final Pane carContainer = new Pane();
        Scene scene = new Scene(stackPane, WIDTH, HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Plac Narutowicza");
        primaryStage.show();
        primaryStage.setResizable(false);

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


        cars.addListener((ListChangeListener<Car>) change ->{
             while(change.next()){
                 for(Car c : change.getAddedSubList()){
                     stackPane.getChildren().add(c.getCar());
                 }
                 for(Car c : change.getAddedSubList()){
                     stackPane.getChildren().remove(c.getCar());
                 }
             }
        });

       createCars(NUM_CARS,RADIUS,MIN_SPPED,MAX_SPEED,380,-105);


        Lights light0 = new Lights();
        light0.start();

        //car1 = new Car(5,5,5,5,5,5);
        //car1.firstPath();

        carsStart();

        tram1 = new Tram();
        tram1.eleventhPath();
        System.out.println(cars);

    }

    private void createCars(int numCars, int radius, double minSpeed, double maxSpeed, double initialX, double initialY){
        final Random random = new Random();
        for(int i =0; i<numCars;i++){
            double mass = Math.pow(radius/40,3);

            final double speed = minSpeed +(maxSpeed - minSpeed) * random.nextDouble();
            final double angle  = 2 * PI * random.nextDouble();
            Car car = new Car(initialX, initialY, radius,speed*cos(angle),speed*sin(angle),mass);
            car.getCar().setFill(COLORS[i% COLORS.length]);
            cars.add(car);
        }
    }

    private void startAnimation(final StackPane stackPane){
        final LongProperty lastUpdateTime = new SimpleLongProperty(0);
        final AnimationTimer timer = new AnimationTimer(){
            @Override
            public void handle(long timestamp){
                if(lastUpdateTime.get() >0){
                    long elapsedTime = timestamp - lastUpdateTime.get();
                    ////

                }


            }

        };

    }

    private void updateWorld(long elapsedTime){
        double elapsedSeconds = elapsedTime / 1_000_000_000.0;
        for(Car c : cars){
            //c.setCenterX()

        }

    }

    private void carsStart(){
        //createCars(NUM_CARS,RADIUS,MIN_SPPED,MAX_SPEED,100,100);
        for(Car c : cars){
            c.firstPath();
        }

    }

}

