package org.example1;

public class Rectangle extends Figure {

    protected int a;
    protected int b;

    public Rectangle(int x, int y, int a, int b) {
        super(x, y);
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if(a > 0) {
            this.a = a;
        }
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        if(b > 0) {
            this.b = b;
        }
    }

    @Override
    public void print() {
        System.out.printf("Прямоугольник [%d,%d]: %dx%d%n",
                x, y, a, b);
    }

    public int getPerimeter() {
        return 2 * a + 2 * b;
    }

    public int getArea() {
        return a * b;
    }
}
