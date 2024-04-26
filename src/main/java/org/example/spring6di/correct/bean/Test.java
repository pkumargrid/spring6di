package org.example.spring6di.correct.bean;

public class Test {

    Test() {
        System.out.println("no constructor called");
    }
    Test(int a) {
        System.out.println("constructor with 1 parameter called");
    }

    Test(int a, int b) {
        System.out.println("constructor with 2 parameter called");
    }
}
