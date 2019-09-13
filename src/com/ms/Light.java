package com.ms;

import javafx.scene.layout.StackPane;

import java.util.concurrent.locks.ReentrantLock;

public class Light extends Thread{

    private StackPane stackPane;
    private ReentrantLock lock = new ReentrantLock();
    private int light;

    public Light(StackPane stackPane){
        this.stackPane = stackPane;
    }

    public void drive() {
        lock.lock();
            try{
                while(light ==1){
                    sleep(1);
                }
            }catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }

    public void greenLigth(){
        light = 0;
    }
    public void redLigth(){
        light = 1;
    }
}


