package com.cc.java;

import com.cc.java.bees.*;
import com.cc.java.birds.*;

public class App {
    
    public static void main(String[] args) {
     
        HoneyBee queen = new Queen();
        HoneyBee worker = new Worker();
        HoneyBee drone = new Drone();
        Bird bird = new Bird();

        output(queen.doYourJob());
        output(queen.fly());

        output(worker.doYourJob());
        output(worker.fly());

        output(drone.doYourJob());
        output(drone.fly());


        output("---------------");
    
        

        output("-------Birds--------");

        output(bird.fly());
        output(bird.hasFeathers());

    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

