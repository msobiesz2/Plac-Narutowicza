package com.ms;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Car {

	public Car(int x ,int y ,int z, String S)
	{
		final Circle car = new Circle(x,y,z);
		car.setFill(Color.DARKRED);
		
		car.setCenterX(0);
		car.setCenterY(0);
	
	}
}
