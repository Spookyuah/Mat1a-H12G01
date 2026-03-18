package es.uah.matcomp.mp.e1.ejerciciosclases.MatCompMPEL1c;

class SquareTest {
    public static void main(String[] args) {

        Square s1 = new Square();
        System.out.println(s1);

        Square s2 = new Square(4);
        System.out.println(s2);

        Square s3 = new Square(5, "purple", true);
        System.out.println(s3);

        System.out.println("Side: " + s3.getSide());
        System.out.println("Area: " + s3.getArea());
        System.out.println("Perimeter: " + s3.getPerimeter());

        s3.setSide(10);
        System.out.println(s3);
    }
}