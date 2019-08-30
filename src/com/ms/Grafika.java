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

	private Circle car = new Circle(5, 5, 5);
	private Circle tram = new Circle(5, 5, 5);

	public void start(Stage primaryStage) {

		StackPane stackPane = new StackPane();
		Scene scene = new Scene(stackPane, 731, 779);

		primaryStage.setScene(scene);
		primaryStage.setTitle("Plac Narutowicza");
		primaryStage.show();

		Image image = new Image("file:plN_v2.png");
		ImageView iv = new ImageView();
		iv.setImage(image);
		stackPane.getChildren().add(iv);

        //firstPath(stackPane);
		//secondPath(stackPane);
		//thirdPath(stackPane);
		//forthPath(stackPane);
		//fifthPath(stackPane);
		//sixthPath(stackPane);
		//seventhPath(stackPane);
		//eightPath(stackPane);
		//ninthPath(stackPane);
        tenthPath(stackPane);
		//eleventhPath(stackPane);
//		twelfthPath(stackPane);
//		thirteenthPath(stackPane);
//		fourteenPath(stackPane);
//		fifteenthPath(stackPane);
//		sixteenthPath(stackPane);
//		seventeenthPath(stackPane);


	}

    public void setCar(Circle car) {
	    this.car = car;
        car.setFill(Color.BLUE);
    }

    public void setTram(Circle tram) {
	    this.tram = tram;
        tram.setFill(Color.RED);
    }

    public void firstPath(StackPane stackPane)
    {
        Circle car = new Circle(5, 5, 5);
        car.setFill(Color.BLACK);

        stackPane.getChildren().add(car);

        Path path = new Path();
        path.getElements().add(new MoveTo(380, -105));
        path.getElements().add(new CubicCurveTo(30, -140, 100, -300, -20, -140)); //first  for car
        path.getElements().add(new LineTo(-315,400));

        pathT(path,car);

    }

    public void secondPath(StackPane stackPane)
    {
        Circle car = new Circle(5,5,5);
        setCar(car);

        stackPane.getChildren().add(car);

        Path path = new Path();
        path.getElements().add(new MoveTo(380, -105));
        path.getElements().add(new CubicCurveTo(30, -140, 100, -300, -20, -140));
        path.getElements().add(new LineTo(-190,170));
        path.getElements().add(new CubicCurveTo(-190,170,-170,330,0,245));
        path.getElements().add(new CubicCurveTo(0,245,230,100,160,-100));
        path.getElements().add(new CubicCurveTo(160,-100,70,-200,200,-400));

        pathT(path,car);

    }

    public void thirdPath(StackPane stackPane)
    {
        Circle car = new Circle(5, 5, 5);
        car.setFill(Color.BLACK);

        stackPane.getChildren().add(car);

        Path path = new Path();
        path.getElements().add(new MoveTo(80, -400)); // 3rd  for car
        path.getElements().add(new LineTo(-360, 400));

        pathT(path,car);
    }

    public void forthPath(StackPane stackPane)
    {
        Circle car = new Circle(5, 5, 5);
        car.setFill(Color.BLACK);

        stackPane.getChildren().add(car);

        Path path = new Path();
        path.getElements().add(new MoveTo(120, -400)); // 4th for car
        path.getElements().add(new LineTo(-310, 400));

        pathT(path,car);
    }

    public void fifthPath(StackPane stackPane)
    {
        Circle car = new Circle(5, 5, 5);
        car.setFill(Color.BLACK);

        stackPane.getChildren().add(car);

        Path path = new Path();
        path.getElements().add(new MoveTo(120, -400)); //5th for car
        path.getElements().add(new LineTo(-190,170));
        path.getElements().add(new CubicCurveTo(-190,170,-170,330,0,245));
        path.getElements().add(new CubicCurveTo(0,245,230,100,160,-100));
        path.getElements().add(new CubicCurveTo(160,-100,70,-200,200,-400));

        pathT(path,car);
    }

    public void sixthPath(StackPane stackPane)
    {
        Circle car = new Circle(5, 5, 5);
        car.setFill(Color.BLACK);

        stackPane.getChildren().add(car);

        Path path = new Path();
        path.getElements().add(new MoveTo(-235,400));	//6th for car
        path.getElements().add(new CubicCurveTo(-220,350,-100,270,0,245));
        path.getElements().add(new CubicCurveTo(0,245,230,100,160,-100));
        path.getElements().add(new CubicCurveTo(160,-100,70,-200,200,-400));

        pathT(path,car);
    }

    public void seventhPath(StackPane stackPane)
    {
        Circle car = new Circle(5, 5, 5);
        car.setFill(Color.BLACK);

        stackPane.getChildren().add(car);

        Path path = new Path();
        path.getElements().add(new MoveTo(-210,400)); 	//7th for car
        path.getElements().add(new CubicCurveTo(-220,400,-100,285,0,280));
        path.getElements().add(new CubicCurveTo(0,280,200,200,200,0));
        path.getElements().add(new LineTo(165,-200));
        path.getElements().add(new CubicCurveTo(165,-200,140,-300,230,-400));

        pathT(path,car);
    }

    public void eightPath(StackPane stackPane)
    {
        Circle car = new Circle(5, 5, 5);


        stackPane.getChildren().add(car);

        Path path = new Path();
        path.getElements().add(new MoveTo(-210,400)); //8th for car
        path.getElements().add(new CubicCurveTo(-220,400,-100,285,0,280));
        path.getElements().add(new CubicCurveTo(0,280,200,200,200,50));
        path.getElements().add(new CubicCurveTo(200,50,200,-60,400,-70));

        pathT(path,car);
    }

    public void ninthPath(StackPane stackPane)
    {
        Circle tram = new Circle(5, 5, 5);
        setTram(tram);

        stackPane.getChildren().add(tram);

        Path path = new Path();
        path.getElements().add(new MoveTo(-280,400)); // 1st tram
        path.getElements().add(new LineTo(153,-400));

        pathTT(path,tram);
    }

    public void tenthPath(StackPane stackPane)
    {
        Circle tram = new Circle(5, 5, 5);
        setTram(tram);

        stackPane.getChildren().add(tram);

        Path path = new Path();
        path.getElements().add(new MoveTo(165,-400)); // 2nd tram
        path.getElements().add(new LineTo(-272,405));

        pathTT(path,tram);
    }

    public void eleventhPath(StackPane stackPane)
    {
        Circle tram = new Circle(5, 5, 5);
        car.setFill(Color.BLACK);

        stackPane.getChildren().add(tram);

        Path path = new Path();
        path.getElements().add(new MoveTo(-280,400)); // 3rd tram
        path.getElements().add(new LineTo(-233,320));
//        path.getElements().add(new CubicCurveTo(-233,320,-190,275,-171,273));
//        path.getElements().add(new LineTo(-5,200));
//        path.getElements().add(new CubicCurveTo(-5,200,95,135,117,55)); // junction
//        path.getElements().add(new CubicCurveTo(117,55,165,-20,248,-100));
//        path.getElements().add(new CubicCurveTo(248,-100,300,-145,370,-135));

        pathTT(path,tram);
    }

    public void twelfthPath(StackPane stackPane)
    {
        Circle tram = new Circle(5, 5, 5);
        car.setFill(Color.BLACK);

        stackPane.getChildren().add(tram);

        Path path = new Path();
        path.getElements().add(new MoveTo(-275,400)); // 4th tram
        path.getElements().add(new LineTo(-233,320));
        path.getElements().add(new CubicCurveTo(-233,320,-190,275,-171,273));
        path.getElements().add(new LineTo(-5,200));
        path.getElements().add(new CubicCurveTo(-5,200,95,135,117,55)); // junction
        path.getElements().add(new CubicCurveTo(117,55,168,-62,100,-210));
        path.getElements().add(new CubicCurveTo(100,-210,80,-275,100,-300));
        path.getElements().add(new LineTo(155,-400));

        pathTT(path,tram);
    }

    public void thirteenthPath(StackPane stackPane)
    {
        Circle tram = new Circle(5, 5, 5);
        car.setFill(Color.BLACK);

        stackPane.getChildren().add(tram);

        Path path = new Path();
        path.getElements().add(new MoveTo(370,-150)); 	// 5th tram
        path.getElements().add(new LineTo(16,-162));
        path.getElements().add(new LineTo(-290,400));

        pathTT(path,tram);

    }

    public void fourteenPath(StackPane stackPane)
    {
        Circle tram = new Circle(5, 5, 5);
        car.setFill(Color.BLACK);

        stackPane.getChildren().add(tram);

        Path path = new Path();
        path.getElements().add(new MoveTo(370,-150)); 	// 6th tram
        path.getElements().add(new LineTo(16,-162));
        path.getElements().add(new LineTo(-145,132));
        path.getElements().add(new CubicCurveTo(-145,132,-200,277,-35,215));
        path.getElements().add(new LineTo(-5,200));
        path.getElements().add(new CubicCurveTo(-5,200,95,135,117,55)); //junction
        path.getElements().add(new CubicCurveTo(117,55,165,-20,248,-100));
        path.getElements().add(new CubicCurveTo(248,-100,300,-145,370,-135));

        pathTT(path,tram);
    }

    public void fifteenthPath(StackPane stackPane)
    {
        Circle tram = new Circle(5, 5, 5);
        tram.setFill(Color.BLACK);

        stackPane.getChildren().add(tram);

        Path path = new Path();
        path.getElements().add(new MoveTo(370,-150)); 	// 7th tram
        path.getElements().add(new LineTo(16,-162));
        path.getElements().add(new LineTo(-145,132));
        path.getElements().add(new CubicCurveTo(-145,132,-200,277,-35,215));
        path.getElements().add(new LineTo(-5,200));
        path.getElements().add(new CubicCurveTo(-5,200,95,135,117,55)); //junction
        path.getElements().add(new CubicCurveTo(117,55,168,-62,100,-210));
        path.getElements().add(new CubicCurveTo(100,-210,80,-275,100,-300));
        path.getElements().add(new LineTo(155,-400));

        pathTT(path,tram);
    }

    public void sixteenthPath(StackPane stackPane)
    {
        Circle tram = new Circle(5, 5, 5);


        stackPane.getChildren().add(tram);

        Path path = new Path();
        path.getElements().add(new MoveTo(145,-400));  // 8th tram
        path.getElements().add(new LineTo(-145,132));
        path.getElements().add(new CubicCurveTo(-145,132,-200,277,-35,215));
        path.getElements().add(new LineTo(-5,200));
        path.getElements().add(new CubicCurveTo(-5,200,95,135,117,55)); //junction
        path.getElements().add(new CubicCurveTo(117,55,168,-62,100,-210));
        path.getElements().add(new CubicCurveTo(100,-210,80,-275,100,-300));
        path.getElements().add(new LineTo(155,-400));

        pathTT(path,tram);
    }
    public void seventeenthPath(StackPane stackPane)
    {
        Circle tram = new Circle(5, 5, 5);


        stackPane.getChildren().add(tram);

        Path path = new Path();
        path.getElements().add(new MoveTo(145,-400));  // 9th tram
        path.getElements().add(new LineTo(-145,132));
        path.getElements().add(new CubicCurveTo(-145,132,-200,277,-35,215));
        path.getElements().add(new LineTo(-5,200));
        path.getElements().add(new CubicCurveTo(-5,200,95,135,117,55)); //junction
        path.getElements().add(new CubicCurveTo(117,55,165,-20,248,-100));
        path.getElements().add(new CubicCurveTo(248,-100,300,-145,370,-135));

        pathTT(path,tram);
    }


    public void pathT(Object path, Object car)
    {
        PathTransition pathT = new PathTransition();
        pathT.setDuration(Duration.millis(10000));
        pathT.setPath((Shape) path);
        pathT.setNode((Node) car);
        pathT.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pathT.setAutoReverse(true);
        pathT.play();
    }
    public void pathTT(Object path,Object tram)
    {
        PathTransition pathT = new PathTransition();
        pathT.setDuration(Duration.millis(10000));
        pathT.setPath((Shape) path);
        pathT.setNode((Node) tram);
        pathT.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pathT.setAutoReverse(true);
        pathT.play();
    }

}
