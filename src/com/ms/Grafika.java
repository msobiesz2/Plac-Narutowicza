package com.ms;
import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import javafx.scene.shape.*;

public class Grafika extends Application{


	public void start(Stage primaryStage) throws Exception
	{
		
		
		StackPane stackPane = new StackPane();
		Scene scene = new Scene(stackPane,731,779);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Plac Narutowicza");
		primaryStage.show();
		
		Image image = new Image("file:plN.png");
		ImageView iv = new ImageView();
		iv.setImage(image);
		stackPane.getChildren().add(iv);
		
		final Circle car = new Circle(5,5,5);
		car.setFill(Color.DARKRED);
		stackPane.getChildren().add(car);
		
		Path path = new Path();
		path.getElements().add(new MoveTo(20,20));
		path.getElements().add(new CubicCurveTo(300,0,300,120,200,120));
		path.getElements().add(new CubicCurveTo(0,120,0,240,300,25));
		
		PathTransition pathT = new PathTransition();
		
	}
	
}

