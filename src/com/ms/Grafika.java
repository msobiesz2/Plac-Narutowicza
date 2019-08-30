package com.ms;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.image.ImageView;
import javafx.scene.shape.*;

public class Grafika extends Application {


	public void start(Stage primaryStage) throws InterruptedException {

		StackPane stackPane = new StackPane();
		Scene scene = new Scene(stackPane, 731, 779);

		primaryStage.setScene(scene);
		primaryStage.setTitle("Plac Narutowicza");
		primaryStage.show();

		Image image = new Image("file:plN_v2.png");
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
		
		
		Path path1 = new Path();

		path1.getElements().add(new MoveTo(370, -110)); 
		path1.getElements().add(new CubicCurveTo(30, -140, 100, -300, -30, -140)); //first  for car
		path1.getElements().add(new LineTo(-330,400));
		
		PathTransition pathT = new PathTransition();
		pathT.setDuration(Duration.millis(10000));
		pathT.setPath(path1);
		pathT.setNode(car);
		// pathT.setCycleCount(Timeline.INDEFINITE);
		pathT.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		pathT.setAutoReverse(true);
		pathT.play();

		Path path2 = new Path();
		
		path2.getElements().add(new MoveTo(370,-110));	// 2nd  for car
		path2.getElements().add(new CubicCurveTo(30, -140, 100, -300, -30, -140)); 
		path2.getElements().add(new LineTo(-200,170));
		path2.getElements().add(new CubicCurveTo(-200,170,-150,300,-50,250));
		path2.getElements().add(new CubicCurveTo(0,250,210,100,160,-100));
		path2.getElements().add(new CubicCurveTo(160,-100,80,-200,180,-400));
		
		PathTransition pathT2 = new PathTransition();
		pathT2.setDuration(Duration.millis(10000));
		pathT2.setPath(path2);
		pathT2.setNode(tram);
		// pathT.setCycleCount(Timeline.INDEFINITE);
		pathT2.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		pathT2.setAutoReverse(true);
		pathT2.play();
		
		Path path3 = new Path();

		path3.getElements().add(new MoveTo(70, -400)); // 3rd  for car
		path3.getElements().add(new LineTo(-370, 400));
		
		PathTransition pathT3 = new PathTransition();
		pathT3.setDuration(Duration.millis(10000));
		pathT3.setPath(path3);
		pathT3.setNode(car);
		pathT3.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		pathT3.setAutoReverse(true);
		pathT3.play();
		
		
		
		
		
		
		
		
		
//		path.getElements().add(new MoveTo(100, -400)); // 4th for car
//		path.getElements().add(new LineTo(-325, 400));
		
//		path.getElements().add(new MoveTo(100, -400)); 5th for car
//		path.getElements().add(new LineTo(-200,170));
//		path.getElements().add(new CubicCurveTo(-200,170,-150,300,-50,250));
//		path.getElements().add(new CubicCurveTo(0,250,210,100,160,-100));
//		path.getElements().add(new CubicCurveTo(160,-100,80,-200,180,-400)); 
		
//		path.getElements().add(new MoveTo(-250,400));	//6th for car
//		path.getElements().add(new CubicCurveTo(-220,350,-100,250,-50,250));
//		path.getElements().add(new CubicCurveTo(0,250,210,100,160,-100));
//		path.getElements().add(new CubicCurveTo(160,-100,80,-200,180,-400));

//		path.getElements().add(new MoveTo(-220,400)); 	//7th for car
//		path.getElements().add(new CubicCurveTo(-220,400,-100,285,0,280));
//		path.getElements().add(new CubicCurveTo(0,280,200,200,200,0));
//		path.getElements().add(new LineTo(165,-200));
//		path.getElements().add(new CubicCurveTo(165,-200,130,-300,220,-400));
		
//		path.getElements().add(new MoveTo(-220,400)); //8th for car
//		path.getElements().add(new CubicCurveTo(-220,400,-100,285,0,280));
//		path.getElements().add(new CubicCurveTo(0,280,200,200,200,50));
//		path.getElements().add(new CubicCurveTo(200,50,200,-80,400,-70));
		
//		path.getElements().add(new MoveTo(-275,400)); // 1st tram
//		path.getElements().add(new LineTo(155,-400));
		
//		path.getElements().add(new MoveTo(145,-400)); // 2nd tram
//		path.getElements().add(new LineTo(-290,400));
		
//		path.getElements().add(new MoveTo(-275,400)); // 3rd tram
//		path.getElements().add(new LineTo(-233,320));
//		path.getElements().add(new CubicCurveTo(-233,320,-190,275,-171,273));
//		path.getElements().add(new LineTo(-5,200));
//		path.getElements().add(new CubicCurveTo(-5,200,95,135,117,55)); // junction
//		path.getElements().add(new CubicCurveTo(117,55,165,-20,248,-100));
//		path.getElements().add(new CubicCurveTo(248,-100,300,-145,370,-135));
		
//		path.getElements().add(new MoveTo(-275,400)); / 4th tram
//		path.getElements().add(new LineTo(-233,320));
//		path.getElements().add(new CubicCurveTo(-233,320,-190,275,-171,273));
//		path.getElements().add(new LineTo(-5,200));
//		path.getElements().add(new CubicCurveTo(-5,200,95,135,117,55)); // junction
//		path.getElements().add(new CubicCurveTo(117,55,168,-62,100,-210));
//		path.getElements().add(new CubicCurveTo(100,-210,80,-275,100,-300));
//		path.getElements().add(new LineTo(155,-400));
		
//		path.getElements().add(new MoveTo(370,-150)); 	// 5th tram
//		path.getElements().add(new LineTo(16,-162));
//		path.getElements().add(new LineTo(-290,400));
		
//		path.getElements().add(new MoveTo(370,-150)); 	// 6th tram
//		path.getElements().add(new LineTo(16,-162));
//		path.getElements().add(new LineTo(-145,132));
//		path.getElements().add(new CubicCurveTo(-145,132,-200,277,-35,215));
//		path.getElements().add(new LineTo(-5,200));
//		path.getElements().add(new CubicCurveTo(-5,200,95,135,117,55)); //junction
//		path.getElements().add(new CubicCurveTo(117,55,165,-20,248,-100));
//		path.getElements().add(new CubicCurveTo(248,-100,300,-145,370,-135));
		
//		path.getElements().add(new MoveTo(370,-150)); 	// 7th tram
//		path.getElements().add(new LineTo(16,-162));
//		path.getElements().add(new LineTo(-145,132));
//		path.getElements().add(new CubicCurveTo(-145,132,-200,277,-35,215));
//		path.getElements().add(new LineTo(-5,200));
//		path.getElements().add(new CubicCurveTo(-5,200,95,135,117,55)); //junction
//		path.getElements().add(new CubicCurveTo(117,55,168,-62,100,-210));
//		path.getElements().add(new CubicCurveTo(100,-210,80,-275,100,-300));
//		path.getElements().add(new LineTo(155,-400));
		
//		path.getElements().add(new MoveTo(145,-400));  // 8th tram
//		path.getElements().add(new LineTo(-145,132));
//		path.getElements().add(new CubicCurveTo(-145,132,-200,277,-35,215));
//		path.getElements().add(new LineTo(-5,200));
//		path.getElements().add(new CubicCurveTo(-5,200,95,135,117,55)); //junction
//		path.getElements().add(new CubicCurveTo(117,55,168,-62,100,-210));
//		path.getElements().add(new CubicCurveTo(100,-210,80,-275,100,-300));
//		path.getElements().add(new LineTo(155,-400));
		
//		path.getElements().add(new MoveTo(145,-400));  // 9th tram
//		path.getElements().add(new LineTo(-145,132));
//		path.getElements().add(new CubicCurveTo(-145,132,-200,277,-35,215));
//		path.getElements().add(new LineTo(-5,200));
//		path.getElements().add(new CubicCurveTo(-5,200,95,135,117,55)); //junction
//		path.getElements().add(new CubicCurveTo(117,55,165,-20,248,-100));
//		path.getElements().add(new CubicCurveTo(248,-100,300,-145,370,-135));
			
	}
	 
}
