package es.uah.matcomp.mp.e1.ejerciciosclases.MatCompMPEL1b;

class MyTriangleTest {
    public static void main(String[] args) {
        MyTriangle t1 = new MyTriangle(0, 0, 3, 0, 0, 4);
        System.out.println(t1);

        MyTriangle t2 = new MyTriangle(
                new MyPoint(1, 1),
                new MyPoint(4, 1),
                new MyPoint(1, 5)
        );
        System.out.println(t2);

        System.out.println("Perimeter t1: " + t1.getPerimeter());
        System.out.println("Perimeter t2: " + t2.getPerimeter());

        System.out.println("Type t1: " + t1.getType());
        System.out.println("Type t2: " + t2.getType());

        MyTriangle t3 = new MyTriangle(0, 0, 2, 0, 1, 2);
        System.out.println(t3);
        System.out.println("Perimeter t3: " + t3.getPerimeter());
        System.out.println("Type t3: " + t3.getType());

        MyTriangle t4 = new MyTriangle(0, 0, 0, 0, 0, 0); //Only way to get equilateral with integers
        System.out.println(t4);
        System.out.println("Perimeter t4: " + t4.getPerimeter());
        System.out.println("Type t4: " + t4.getType());
    }
}