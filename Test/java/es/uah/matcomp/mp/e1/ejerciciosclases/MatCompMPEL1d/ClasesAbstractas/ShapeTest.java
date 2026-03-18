package es.uah.matcomp.mp.e1.ejerciciosclases.MatCompMPEL1d.ClasesAbstractas;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    public static void main(String[]args){
        Shape s1 = new Circle(5.5, "red", false); // Upcast Circle to Shape, Polimorfismo
        System.out.println(s1);     //Version Circle
        Circle c2= new Circle();
        System.out.println(c2);
        Circle c3= new Circle(7.4);
        System.out.println(c3);
        s1.setColor("yellow");
        s1.setFilled(true);
        System.out.println(s1.getArea());       //Version Circle
        System.out.println(s1.getPerimeter());      //Version Circle
        System.out.println(s1.getColor());      //Shape
        System.out.println(s1.isFilled());      //Shape
        System.out.println(((Circle)s1).getRadius());       //Circle

        Circle c1 = (Circle)s1; // Downcast back to Circle
        System.out.println(c1);
        c1.setRadius(3.5);
        System.out.println(c1.getArea());   //Todos Circle
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        //Shape s2 = new Shape();   //Linea invalida

        Shape s3 = new Rectangle(1.0, 2.0, "red", false); // Upcast, Polimorfismo
        System.out.println(s3);
        s3.setColor("yellow");
        s3.setFilled(true);
        Rectangle r3= new Rectangle();
        System.out.println(r3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());      //Shape
        System.out.println(s3.isFilled());      //Shape
        System.out.println(((Rectangle)s3).getWidth());
        System.out.println(((Rectangle)s3).getLength());

        Rectangle r1 = (Rectangle)s3; // downcast
        System.out.println(r1);
        r1.setLength(7);
        r1.setWidth(4);
        System.out.println(r1.getArea());       //Todos Rectangle
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6, "red", false); // Upcast, Polimorfismo
        System.out.println(s4);
        s4.setColor("yellow");
        s4.setFilled(true);
        Square sq2= new Square();
        System.out.println(sq2);
        Square sq3= new Square(7.0);
        System.out.println(sq3);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());  //Shape
        System.out.println(((Square)s4).getSide());

// Take note that we downcast Shape s4 to Rectangle,
// which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle)s4;   //Polimorfismo
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());  //Shape
        System.out.println(((Square)r2).getSide()); //getSide solo existe en square, r2 es Rectangle (de lados iguales)
        System.out.println(r2.getLength());

// Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        sq1.setLength(5);
        sq1.setWidth(7);
        System.out.println(sq1.getWidth());
        sq1.setSide(6);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());       //Shape
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}