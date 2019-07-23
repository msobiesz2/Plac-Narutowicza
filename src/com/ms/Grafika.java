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



public class Grafika extends Application{

	@Override
	public void start(Stage primaryStage) throws InterruptedException 
	{
		
		
		StackPane stackPane = new StackPane();
		Scene scene = new Scene(stackPane,731,779);
		
		scene.setOnMouseClicked(mouseHandler);
       // scene.setOnMouseDragged(mouseHandler);
        //scene.setOnMouseEntered(mouseHandler);
        //scene.setOnMouseExited(mouseHandler);
        //scene.setOnMouseMoved(mouseHandler);
        //scene.setOnMousePressed(mouseHandler);
        //scene.setOnMouseReleased(mouseHandler);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Plac Narutowicza");
		primaryStage.show();
		
		//Button button = new Button();
		
		Image image = new Image("file:plN.png");
		ImageView iv = new ImageView();
		iv.setImage(image);
		stackPane.getChildren().add(iv);
		//stackPane.getChildren().add(button);
		
		final Circle car = new Circle(3,3,3);
		//car.setCenterX(-356.0f); to first 
		//car.setCenterY(77.0f);	and second path
		car.setCenterX(-110.0f); 	//third and
		car.setCenterY(380.0f); 	// forth path
		
		car.setFill(Color.BLACK);
		stackPane.getChildren().add(car);
		
		//Text text = new Text("This is a car, darkred car");
		
		//Group group = new Group(car, text);
		
		Path path = new Path();
		//path.getElements().add(new MoveTo(0,0));
		//path.getElements().add(new CubicCurveTo(-160,-20,-170,-25,-175,-36));		//first path moveto 00
		//path.getElements().add(new CubicCurveTo(-190,-50,-200,-90,-242,-175));
		//path.getElements().add(new CubicCurveTo(-243,-173,-242,-178,-239,-205));
		//path.getElements().add(new CubicCurveTo(-235,-220,-218,-250,-165,-350));
		
		
		path.getElements().add(new MoveTo());
		//path.getElements().add(new CubicCurveTo(-160,-20,-170,-25,-190,-36));  second path move to 00
		//path.getElements().add(new CubicCurveTo(-195,-50,-210,-90,-250,-133)); 
		//path.getElements().add(new CubicCurveTo(-255,-140,-280,-150,-330,-130)); 
		//path.getElements().add(new CubicCurveTo(-333,-130,-400,-10,-725,600));
		
		//path.getElements().add(new CubicCurveTo(-100,200,-150,220,-310,590)); //third path
		//path.getElements().add(new CubicCurveTo(-305,595,-300,620,-270,650));
		//path.getElements().add(new CubicCurveTo(-260,660,-235,650,-200,655));
		//path.getElements().add(new CubicCurveTo(-195,642,-170,639,-130,645));
		//path.getElements().add(new CubicCurveTo(-130,660,-70,630,-12,580));
		//path.getElements().add(new LineTo(160,310));
		//path.getElements().add(new CubicCurveTo(165,300,179,300,265,305));
		
		
		path.getElements().add(new CubicCurveTo(-100,200,-150,220,-310,590)); //forth path
		path.getElements().add(new CubicCurveTo(-305,595,-300,620,-270,650));
		path.getElements().add(new CubicCurveTo(-260,660,-235,650,-200,655));
		path.getElements().add(new CubicCurveTo(-195,642,-170,639,-130,645));
		path.getElements().add(new CubicCurveTo(-130,660,-70,630,-12,580));
		path.getElements().add(new LineTo(80,400));
		path.getElements().add(new CubicCurveTo(70,300,60,220,30,200));
		
		PathTransition pathT = new PathTransition();
		pathT.setDuration(Duration.millis(10000));
		pathT.setPath(path);
		//pathT.setPath(path2);
		pathT.setNode(car);
		//pathT.setCycleCount(Timeline.INDEFINITE);
		pathT.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		pathT.setAutoReverse(true);
		pathT.play();
		
	}
	
	
	
	EventHandler<MouseEvent> mouseHandler = new EventHandler<MouseEvent>() {
		 
        @Override
        public void handle(MouseEvent mouseEvent) {
            System.out.println(mouseEvent.getEventType() + "\n"
                    + "X : Y - " + mouseEvent.getX() + " : " + mouseEvent.getY() + "\n"
                    + "SceneX : SceneY - " + mouseEvent.getSceneX() + " : " + mouseEvent.getSceneY() + "\n"
                    + "ScreenX : ScreenY - " + mouseEvent.getScreenX() + " : " + mouseEvent.getScreenY());
	

	}
	};
}
