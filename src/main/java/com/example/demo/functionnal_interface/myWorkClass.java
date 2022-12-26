package com.example.demo.functionnal_interface;

public class myWorkClass {

    public static void main(String[] args) {
        // To do

        myWork InstancemyWork = (x, y) -> {

            System.out.println("print lambda");
            System.out.println("x : " + x);
            System.out.println("y : " + y);
        };

        InstancemyWork.doWork(3, 15);
    }
}
