package org.example1;

public class Circle extends Ellipse {

    public Circle(int x, int y, int r) {
        super(x, y, r, r);
    }

    @Override
    public void print() {
        System.out.printf("Круг [%d,%d]: с диагональю %d%n",
                x, y, r1);
    }
}
