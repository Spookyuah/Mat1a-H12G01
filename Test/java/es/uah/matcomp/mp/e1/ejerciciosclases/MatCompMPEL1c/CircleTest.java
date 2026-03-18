package es.uah.matcomp.mp.e1.ejerciciosclases.MatCompMPEL1c;

class CircleTest {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        System.out.println(c1);

        Circle c2 = new Circle(5.0);
        System.out.println(c2);

        Circle c3 = new Circle(3.0, "yellow", false);
        System.out.println(c3);

        System.out.println("Area: " + c3.getArea());
        System.out.println("Perimeter: " + c3.getPerimeter());
    }
}