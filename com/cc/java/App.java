package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        HoneyBee queen = new Queen();
        HoneyBee worker = new Worker();
        HoneyBee drone = new Drone();

        output(queen.doYourJob());
        output(worker.doYourJob());
        output(drone.doYourJob());

        output("---------------");
    
        output(queen.fly());
        output(worker.fly());
        output(drone.fly());

        output("---------------");

    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

