package com.ms;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Tram extends Grafika{

	public void setTram(int x ,int y ,int z, String S)
	{
		String color = new String();
		
		Circle tram = new Circle(x,y,z);
		tram.setFill(Color.valueOf(color));
		
		tram.setCenterX(0);
		tram.setCenterY(0);
		
	}
}
