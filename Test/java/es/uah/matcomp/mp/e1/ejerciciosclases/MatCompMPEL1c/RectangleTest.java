package es.uah.matcomp.mp.e1.ejerciciosclases.MatCompMPEL1c;

class RectangleTest {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        System.out.println(r1);

        Rectangle r2 = new Rectangle(4, 5);
        System.out.println(r2);

        Rectangle r3 = new Rectangle(2, 6, "black", true);
        System.out.println(r3);

        System.out.println("Area: " + r3.getArea());
        System.out.println("Perimeter: " + r3.getPerimeter());
    }
}