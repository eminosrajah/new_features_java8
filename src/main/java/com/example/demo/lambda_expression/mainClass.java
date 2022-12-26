package com.example.demo.lambda_expression;

public class mainClass {
    //
    public static void main(String[] args) {

        //
        // Without Lambda -- Classic method : before Java 8
        myRunnable user_run = new myRunnable();
        Thread t = new Thread(user_run);
        t.start();
        //
        // With Lambda -- JAVA 8
        Runnable myNewRunnable = () -> {
            // run code
            System.out.println("************** Thread is working with LAMBDA ************** ");
        };

        Thread t1 = new Thread(myNewRunnable);
        t1.start();

    }
}
