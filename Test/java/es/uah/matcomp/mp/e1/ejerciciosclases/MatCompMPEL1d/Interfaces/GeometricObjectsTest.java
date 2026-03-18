package es.uah.matcomp.mp.e1.ejerciciosclases.MatCompMPEL1d.Interfaces;

class GeometricObjectsTest {
    public static void main(String[]args) {
        Circle c1 = new Circle(7.4);
        System.out.println(c1);
        System.out.println("Perimeter="+c1.getPerimeter()+", Area="+c1.getArea());

        Rectangle r1 = new Rectangle(7,6);
        System.out.println(r1);
        System.out.println("Perimeter="+r1.getPerimeter()+", Area="+r1.getArea());
    }
}