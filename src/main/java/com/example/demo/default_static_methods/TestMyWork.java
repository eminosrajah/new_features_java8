package com.example.demo.default_static_methods;


public interface TestMyWork {

    static void printInfoStatic() {
        System.out.println(" With static ");
    }

    int sum(int x, int y);

    int getX();

    int getY();

    default void printInfo() {
        System.out.println("x: " + getX() + "  ****  y : " + getY());
    }


}
