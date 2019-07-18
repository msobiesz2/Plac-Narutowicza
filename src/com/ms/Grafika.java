package com.ms;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;

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
	}
}
