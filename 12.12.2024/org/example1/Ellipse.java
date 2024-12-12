package org.example1;

public class Ellipse extends Figure {

    protected int r1;
    protected int r2;

    public Ellipse(int x, int y, int r1, int r2) {
        super(x, y);
        this.r1 = r1;
        this.r2 = r2;
    }

    public int getR1() {
        return r1;
    }

    public void setR1(int r1) {
        this.r1 = r1;
    }

    public int getR2() {
        return r2;
    }

    public void setR2(int r2) {
        this.r2 = r2;
    }

    public int getArea() {
        return (int) (Math.PI * r1 * r2);
    }

    public int getPerimeter() {
        return (int) (2 * Math.PI * Math.sqrt((r1*r1 + r2*r2)/2));
    }

    @Override
    public void print() {
        System.out.printf("Эллипс [%d,%d]: с диагоналями %d, %d%n",
                x, y, r1, r2);
    }
}
