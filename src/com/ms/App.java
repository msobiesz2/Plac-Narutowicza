package com.ms;


import javafx.scene.layout.StackPane;

import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App{
	
	public static void main(String[] args) 
	{

		Grafika.launch(Grafika.class, args);
		Grafika g = new Grafika();

		StackPane stackPane = new StackPane();
		g.setStackPane(stackPane);
		g.doWork(stackPane);




       // ExecutorService exe = Executors.newCachedThreadPool();

//        for(int i = 0; i<50;i++)
//        {
//            exe.submit(new Runnable() {
//                @Override
//                public void run() {
//                    g.firstPath(g.getStackPane());
//                }
//            });
//        }

	}
}

