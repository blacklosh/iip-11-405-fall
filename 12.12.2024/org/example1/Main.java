package org.example1;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(2, 3, 100, 200);
        //rectangle.print();

        //System.out.println(rectangle.getPerimeter());
        //System.out.println(rectangle.getArea());

        Square square = new Square(5, 6, 13);
        //square.print();
        //System.out.println(square.getPerimeter());
        //System.out.println(square.getArea());

        //System.out.println("---------------------------");
        Ellipse ellipse = new Ellipse(14, 15, 16, 17);
        //ellipse.print();

        //System.out.println(ellipse.getPerimeter());
        //System.out.println(ellipse.getArea());

        Circle circle = new Circle(18, 19, 20);
        //circle.print();

        //System.out.println(circle.getPerimeter());
        //System.out.println(circle.getArea());

        //System.out.println("----------------------");
        //Figure figure = new Figure(101, 102);
        //figure.print();

        Figure[] figures = new Figure[] {
                rectangle,
                circle,
                ellipse,
                square
        };

        printAll(figures);
    }

    public static void printAll(Figure[] figures) {
        for(int i = 0; i < figures.length; i++) {
            figures[i].print();
        }
    }
}