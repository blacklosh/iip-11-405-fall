package org.example1;

public class Square extends Rectangle {

    public Square(int x, int y, int a) {
        super(x, y, a, a);
    }

    @Override
    public void print() {
        System.out.printf("Квадрат [%d,%d]: со стороной %d%n",
                x, y, a);
    }
}
