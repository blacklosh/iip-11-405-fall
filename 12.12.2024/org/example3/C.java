package org.example3;

public class C implements A, B {
    @Override
    public void methodA() {
        System.out.println("AAA");
    }

    @Override
    public void methodB() {
        System.out.println("BBB");
    }

    @Override
    public String toString() {
        return "";
    }
}
