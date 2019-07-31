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

		final Circle tram = new Circle(5, 5, 5);
		tram.setCenterX(0);
		tram.setCenterY(0);

		final Circle car = new Circle(5, 5, 5);

		car.setCenterX(0);
		car.setCenterY(0);

		tram.setFill(Color.PURPLE);
		car.setFill(Color.BLACK);
		stackPane.getChildren().add(car);
		stackPane.getChildren().add(tram);

		Path path = new Path();
		Path path2 = new Path();

//		path.getElements().add(new MoveTo(370, -110));
//		path.getElements().add(new CubicCurveTo(30, -140, 100, -300, -30, -140)); //first  for car
//		path.getElements().add(new LineTo(-330,400));

//		path.getElements().add(new MoveTo(370,-110));	//second  for car
//		path.getElements().add(new CubicCurveTo(30, -140, 100, -300, -30, -140)); 
//		path.getElements().add(new LineTo(-200,170));
//		path.getElements().add(new CubicCurveTo(-200,170,-150,300,-50,250));
//		path.getElements().add(new CubicCurveTo(0,250,210,100,160,-100));
//		path.getElements().add(new CubicCurveTo(160,-100,80,-200,180,-400));

//		path.getElements().add(new MoveTo(70, -400)); // third  for car
//		path.getElements().add(new LineTo(-370, 400));
		
//		path.getElements().add(new MoveTo(100, -400)); // forth for car
//		path.getElements().add(new LineTo(-325, 400));
		
//		path.getElements().add(new MoveTo(100, -400)); fifth for car
//		path.getElements().add(new LineTo(-200,170));
//		path.getElements().add(new CubicCurveTo(-200,170,-150,300,-50,250));
//		path.getElements().add(new CubicCurveTo(0,250,210,100,160,-100));
//		path.getElements().add(new CubicCurveTo(160,-100,80,-200,180,-400)); 
		
//		path.getElements().add(new MoveTo(-250,400));	//sixth for car
//		path.getElements().add(new CubicCurveTo(-220,350,-100,250,-50,250));
//		path.getElements().add(new CubicCurveTo(0,250,210,100,160,-100));
//		path.getElements().add(new CubicCurveTo(160,-100,80,-200,180,-400));

//		path.getElements().add(new MoveTo(-220,400)); 	//seventh for car
//		path.getElements().add(new CubicCurveTo(-220,400,-100,285,0,280));
//		path.getElements().add(new CubicCurveTo(0,280,200,200,200,0));
//		path.getElements().add(new LineTo(165,-200));
//		path.getElements().add(new CubicCurveTo(165,-200,130,-300,220,-400));
		
//		path.getElements().add(new MoveTo(-220,400)); //eighth for car
//		path.getElements().add(new CubicCurveTo(-220,400,-100,285,0,280));
//		path.getElements().add(new CubicCurveTo(0,280,200,200,200,50));
//		path.getElements().add(new CubicCurveTo(200,50,200,-80,400,-70));
		
//		path.getElements().add(new MoveTo(-275,400));
//		path.getElements().add(new LineTo(155,-400));
		
		path2.getElements().add(new MoveTo(145,-400));
		path2.getElements().add(new LineTo(-290,400));
		
		path.getElements().add(new MoveTo(-275,400));
		path.getElements().add(new LineTo(-233,320));
		path.getElements().add(new CubicCurveTo(-233,320,-190,275,-171,273));
		path.getElements().add(new LineTo(-5,200));
		path.getElements().add(new CubicCurveTo(-5,200,95,135,117,55)); // junction
		path.getElements().add(new CubicCurveTo(117,55,165,-20,248,-100));
		//path.getElements().add(new CubicCurveTo(248,-100,0,0,0,0));
		
		PathTransition pathT = new PathTransition();
		pathT.setDuration(Duration.millis(10000));
		pathT.setPath(path);
		pathT.setNode(car);
		
		PathTransition pathT2 = new PathTransition();
		pathT2.setDuration(Duration.millis(10000));
		pathT2.setPath(path2);
		pathT2.setNode(tram);

		// pathT.setCycleCount(Timeline.INDEFINITE);
		pathT.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		pathT.setAutoReverse(true);
		pathT.play();
		
		pathT2.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		pathT2.setAutoReverse(true);
		pathT2.play();

	}

	public static void PathT()
	{
		
	}
}
