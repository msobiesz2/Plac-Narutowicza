package com.ms;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.*;
import javafx.scene.text.Text;

public class Grafika extends Application {

	@Override
	public void start(Stage primaryStage) throws InterruptedException {

		StackPane stackPane = new StackPane();
		Scene scene = new Scene(stackPane, 731, 779);

		primaryStage.setScene(scene);
		primaryStage.setTitle("Plac Narutowicza");
		primaryStage.show();


		Image image = new Image("file:plN_v3.png");
		ImageView iv = new ImageView();
		iv.setImage(image);
		stackPane.getChildren().add(iv);
		
		final Circle tram = new Circle (5,5,5);
		tram.setCenterX(0.0f);
		tram.setCenterY(0.0f);
		
		final Circle car = new Circle(5, 5, 5);
		//car.setCenterX(-370.0f); // to first
		//car.setCenterY(100.0f); // and second path
		
		//car.setCenterX(-65); // to third path
		//car.setCenterY(395); //
		
		car.setCenterX(0);
		car.setCenterY(0);
		
		tram.setFill(Color.PURPLE);
		car.setFill(Color.BLACK);
		stackPane.getChildren().add(car);


		Path path = new Path();

		path.getElements().add(new MoveTo(370, -110));
		path.getElements().add(new CubicCurveTo(30, -140, 50, -200, -50, -140)); //first
		
		
//		path.getElements().add(new MoveTo(0, 0));
//		path.getElements().add(new CubicCurveTo(-160, -40, -170, -50, -175, -55)); //second
//		path.getElements().add(new CubicCurveTo(-175, -55, -250, -70, -330, -100));
//		path.getElements().add(new CubicCurveTo(-332, -95, -370, -90, -410, -85));
//		path.getElements().add(new LineTo(-750,500));

//		path.getElements().add(new MoveTo(0, 0)); //third
//		path.getElements().add(new LineTo(-435,800));
		
		//path.getElements().add(new MoveTo(100, -400)); //forth
		//path.getElements().add(new LineTo(-540,800));
		
		PathTransition pathT = new PathTransition();
		pathT.setDuration(Duration.millis(10000));
		pathT.setPath(path);
		pathT.setNode(car);
		
		//pathT.setCycleCount(Timeline.INDEFINITE);
		pathT.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		pathT.setAutoReverse(true);
		pathT.play();

	}

}
