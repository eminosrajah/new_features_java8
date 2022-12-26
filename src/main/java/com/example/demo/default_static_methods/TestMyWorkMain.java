package com.example.demo.default_static_methods;

public class TestMyWorkMain {
    public static void main(String[] args) {
        TestMyWorkClass1 class1 = new TestMyWorkClass1();
        TestMyWorkClass2 class2 = new TestMyWorkClass2();
        class1.printInfo();
        class2.printInfo();
        TestMyWork.printInfoStatic();
    }
}
