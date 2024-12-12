package org.example3;

public class Main {

    public static void main(String[] args) {
        C c = new C();

        A a = c;
        B b = c;

        a.methodA();
        b.methodB();

    }
}
