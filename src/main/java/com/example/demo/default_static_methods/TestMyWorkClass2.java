package com.example.demo.default_static_methods;

public class TestMyWorkClass2 implements TestMyWork {
    int x = 5;
    int y = 3;

    @Override
    public int sum(int x, int y) {
        //
        return x + y;
    }

    @Override
    public int getX() {
        //
        return x;
    }

    @Override
    public int getY() {
        return y;
    }
}
