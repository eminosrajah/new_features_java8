package com.example.demo.default_static_methods;

public class TestMyWorkClass1 implements TestMyWork {
    int x = 10;
    int y = 13;

    @Override
    public int sum(int x, int y) {
        return x + y;
    }

    @Override
    public int getX() {

        return x;
    }

    @Override
    public int getY() {
        return y;
    }
}
