package com.ms;

import javafx.animation.PathTransition;
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

	private StackPane stackPane = new StackPane();

	    public void start(Stage primaryStage) {


		Scene scene = new Scene(stackPane, 731, 779);

		primaryStage.setScene(scene);
		primaryStage.setTitle("Plac Narutowicza");
		primaryStage.show();

		Image image = new Image("file:plN_v3.png");
		ImageView iv = new ImageView();
		iv.setImage(image);
		stackPane.getChildren().add(iv);

		// doWork(stackPane);

	}

        public void setStackPane(StackPane stackPane) {

            this.stackPane = stackPane;
            }

        public void doWork(StackPane stackPane) {
            firstPath(stackPane);
            secondPath(stackPane);
            thirdPath(stackPane);
            forthPath(stackPane);
            fifthPath(stackPane);
            sixthPath(stackPane);
            seventhPath(stackPane);
            eightPath(stackPane);
            ninthPath(stackPane);
            tenthPath(stackPane);
            eleventhPath(stackPane);
            twelfthPath(stackPane);
            thirteenthPath(stackPane);
            fourteenPath(stackPane);
            fifteenthPath(stackPane);
            sixteenthPath(stackPane);
            seventeenthPath(stackPane);
        }

        public void setCar(Circle car) {
            this.car = car;
            car.setFill(Color.BLUE);
        }

        public void setTram(Circle tram) {
            this.tram = tram;
            tram.setFill(Color.RED);
        }

        public void firstPath(StackPane stackPane) {
                Circle car = new Circle(5, 5, 5);
                setCar(car);

                stackPane.getChildren().add(car);

                Path path = new Path();
                path.getElements().add(new MoveTo(380, -105));
                path.getElements().add(new CubicCurveTo(30, -140, 100, -300, -20, -140)); //first  for car
                path.getElements().add(new LineTo(-315, 400));

                pathT(path, car);
        }

        public void secondPath(StackPane stackPane) {
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

        public void thirdPath(StackPane stackPane) {
            Circle car = new Circle(5, 5, 5);
            setCar(car);

            stackPane.getChildren().add(car);

            Path path = new Path();
            path.getElements().add(new MoveTo(80, -400)); // 3rd  for car
            path.getElements().add(new LineTo(-360, 400));

            pathT(path,car);
        }

        public void forthPath(StackPane stackPane) {
            Circle car = new Circle(5, 5, 5);
            setCar(car);

            stackPane.getChildren().add(car);

            Path path = new Path();
            path.getElements().add(new MoveTo(120, -400)); // 4th for car
            path.getElements().add(new LineTo(-315, 400));

            pathT(path,car);
        }

        public void fifthPath(StackPane stackPane) {
            Circle car = new Circle(5, 5, 5);
            setCar(car);

            stackPane.getChildren().add(car);

            Path path = new Path();
            path.getElements().add(new MoveTo(120, -400)); //5th for car
            path.getElements().add(new LineTo(-190,170));
            path.getElements().add(new CubicCurveTo(-190,170,-170,330,0,245));
            path.getElements().add(new CubicCurveTo(0,245,230,100,160,-100));
            path.getElements().add(new CubicCurveTo(160,-100,70,-200,200,-400));

            pathT(path,car);
        }

        public void sixthPath(StackPane stackPane) {
            Circle car = new Circle(5, 5, 5);
            setCar(car);

            stackPane.getChildren().add(car);

            Path path = new Path();
            path.getElements().add(new MoveTo(-235,400));	//6th for car
            path.getElements().add(new CubicCurveTo(-220,350,-100,270,0,245));
            path.getElements().add(new CubicCurveTo(0,245,230,100,160,-100));
            path.getElements().add(new CubicCurveTo(160,-100,70,-200,200,-400));

            pathT(path,car);
        }

        public void seventhPath(StackPane stackPane) {
            Circle car = new Circle(5, 5, 5);
            setCar(car);

            stackPane.getChildren().add(car);

            Path path = new Path();
            path.getElements().add(new MoveTo(-210,400)); 	//7th for car
            path.getElements().add(new CubicCurveTo(-220,400,-100,285,0,280));
            path.getElements().add(new CubicCurveTo(0,280,200,200,200,0));
            path.getElements().add(new LineTo(165,-200));
            path.getElements().add(new CubicCurveTo(165,-200,140,-300,230,-400));

            pathT(path,car);
        }

        public void eightPath(StackPane stackPane) {
            Circle car = new Circle(5, 5, 5);
            setCar(car);

            stackPane.getChildren().add(car);

            Path path = new Path();
            path.getElements().add(new MoveTo(-210,400)); //8th for car
            path.getElements().add(new CubicCurveTo(-220,400,-100,285,0,280));
            path.getElements().add(new CubicCurveTo(0,280,200,200,200,50));
            path.getElements().add(new CubicCurveTo(200,50,200,-60,400,-70));

            pathT(path,car);
        }

        public void ninthPath(StackPane stackPane) {
            Circle tram = new Circle(5, 5, 5);
            setTram(tram);

            stackPane.getChildren().add(tram);

            Path path = new Path();
            path.getElements().add(new MoveTo(153,-400)); // 1st tram
            path.getElements().add(new LineTo(-285,405));

            pathTT(path,tram);
        }

        public void tenthPath(StackPane stackPane) {
            Circle tram = new Circle(5, 5, 5);
            setTram(tram);

            stackPane.getChildren().add(tram);

            Path path = new Path();
            path.getElements().add(new MoveTo(-272,405)); // 2nd tram
            path.getElements().add(new LineTo(165,-400));

            pathTT(path,tram);
        }

        public void eleventhPath(StackPane stackPane) {
            Circle tram = new Circle(5, 5, 5);
            setTram(tram);

            stackPane.getChildren().add(tram);

            Path path = new Path();
            path.getElements().add(new MoveTo(-272,405)); // 3rd tram
            path.getElements().add(new LineTo(-225,320));
            path.getElements().add(new CubicCurveTo(-225,320,-190,280,-165,278));
            path.getElements().add(new LineTo(-40,222));
            path.getElements().add(new LineTo(40,180));
            path.getElements().add(new CubicCurveTo(40,180,105,110,122,60)); // junction
            path.getElements().add(new CubicCurveTo(122,60,165,-20,268,-105));
            path.getElements().add(new CubicCurveTo(268,-105,300,-135,380,-130));

            pathTT(path,tram);
        }

        public void twelfthPath(StackPane stackPane) {
            Circle tram = new Circle(5, 5, 5);
            setTram(tram);

            stackPane.getChildren().add(tram);

            Path path = new Path();
            path.getElements().add(new MoveTo(-272,405)); // 4rd tram
            path.getElements().add(new LineTo(-225,320));
            path.getElements().add(new CubicCurveTo(-225,320,-190,280,-165,278));
            path.getElements().add(new LineTo(-40,222));
            path.getElements().add(new LineTo(40,180));
            path.getElements().add(new CubicCurveTo(40,180,105,110,122,60)); // junction
            path.getElements().add(new CubicCurveTo(122,60,172,-57,105,-205));
            path.getElements().add(new CubicCurveTo(105,-205,85,-270,105,-295));
            path.getElements().add(new LineTo(165,-400));

            pathTT(path,tram);
        }

        public void thirteenthPath(StackPane stackPane) {
            Circle tram = new Circle(5, 5, 5);
            setTram(tram);

            stackPane.getChildren().add(tram);

            Path path = new Path();
            path.getElements().add(new MoveTo(375,-145)); 	// 5th tram
            path.getElements().add(new LineTo(21,-157));
            path.getElements().add(new LineTo(-285,405));

            pathTT(path,tram);

        }

        public void fourteenPath(StackPane stackPane) {
            Circle tram = new Circle(5, 5, 5);
            setTram(tram);

            stackPane.getChildren().add(tram);

            Path path = new Path();
            path.getElements().add(new MoveTo(375,-145)); 	// 6th tram
            path.getElements().add(new LineTo(21,-157));
            path.getElements().add(new LineTo(-140,137));
            path.getElements().add(new CubicCurveTo(-140,127,-195,282,-30,220));
            path.getElements().add(new LineTo(-0,205));
            path.getElements().add(new CubicCurveTo(-0,205,100,140,122,60)); //junction
            path.getElements().add(new CubicCurveTo(122,60,170,-15,253,-95));
            path.getElements().add(new CubicCurveTo(253,-95,305,-140,380,-130));

            pathTT(path,tram);
        }

        public void fifteenthPath(StackPane stackPane) {
            Circle tram = new Circle(5, 5, 5);
            setTram(tram);

            stackPane.getChildren().add(tram);

            Path path = new Path();
            path.getElements().add(new MoveTo(375,-145)); 	// 7th tram
            path.getElements().add(new LineTo(21,-157));
            path.getElements().add(new LineTo(-140,137));
            path.getElements().add(new CubicCurveTo(-140,127,-195,282,-30,220));
            path.getElements().add(new LineTo(-0,205));
            path.getElements().add(new CubicCurveTo(-0,205,100,140,122,60)); //junction
            path.getElements().add(new CubicCurveTo(122,60,172,-57,105,-205));
            path.getElements().add(new CubicCurveTo(105,-205,85,-270,105,-295));
            path.getElements().add(new LineTo(165,-400));

            pathTT(path,tram);
        }

        public void sixteenthPath(StackPane stackPane) {
            Circle tram = new Circle(5, 5, 5);
            setTram(tram);

            stackPane.getChildren().add(tram);

            Path path = new Path();
            path.getElements().add(new MoveTo(150,-395));  // 8th tram
            path.getElements().add(new LineTo(-140,137));
            path.getElements().add(new CubicCurveTo(-140,127,-195,282,-30,220));
            path.getElements().add(new LineTo(-0,205));
            path.getElements().add(new CubicCurveTo(-0,205,100,140,122,60)); //junction
            path.getElements().add(new CubicCurveTo(122,60,172,-57,105,-205));
            path.getElements().add(new CubicCurveTo(105,-205,85,-270,105,-295));
            path.getElements().add(new LineTo(165,-400));

            pathTT(path,tram);
        }
        public void seventeenthPath(StackPane stackPane) {
            Circle tram = new Circle(5, 5, 5);
            setTram(tram);

            stackPane.getChildren().add(tram);

            Path path = new Path();
            path.getElements().add(new MoveTo(150,-395));  // 8th tram
            path.getElements().add(new LineTo(-140,137));
            path.getElements().add(new CubicCurveTo(-140,127,-195,282,-30,220));
            path.getElements().add(new LineTo(-0,205));
            path.getElements().add(new CubicCurveTo(-0,205,100,140,122,60)); //junction
            path.getElements().add(new CubicCurveTo(122,60,170,-15,253,-95));
            path.getElements().add(new CubicCurveTo(253,-95,305,-140,380,-130));

            pathTT(path,tram);
        }

        public void pathT(Object path, Object car) {
            PathTransition pathT = new PathTransition();
            pathT.setDuration(Duration.millis(15000));
            pathT.setPath((Shape) path);
            pathT.setNode((Node) car);
            pathT.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
            pathT.setAutoReverse(true);
            pathT.play();
        }

        public void pathTT(Object path,Object tram) {
        PathTransition pathT = new PathTransition();
        pathT.setDuration(Duration.millis(15000));
        pathT.setPath((Shape) path);
        pathT.setNode((Node) tram);
        pathT.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pathT.setAutoReverse(true);
        pathT.play();
    }

}
