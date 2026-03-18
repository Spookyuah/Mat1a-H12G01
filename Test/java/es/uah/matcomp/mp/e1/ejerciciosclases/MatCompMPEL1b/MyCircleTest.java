package es.uah.matcomp.mp.e1.ejerciciosclases.MatCompMPEL1b;

class MyCircleTest {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle();
        System.out.println(c1);

        MyCircle c2 = new MyCircle(3, 4, 5);
        System.out.println(c2);

        MyCircle c3 = new MyCircle(new MyPoint(6, 8), 10);
        System.out.println(c3);

        c1.setRadius(7);
        System.out.println("Radius c1: " + c1.getRadius());

        c1.setCenter(new MyPoint(2, 2));
        System.out.println("Center c1: " + c1.getCenter());

        c2.setCenterX(10);
        c2.setCenterY(20);
        System.out.println("Center X c2: " + c2.getCenterX());
        System.out.println("Center Y c2: " + c2.getCenterY());

        c3.setCenterXY(5, 5);
        System.out.printf("Center c3: (%d, %d)%n", c3.getCenterXY()[0], c3.getCenterXY()[1]);

        System.out.println("Area c2: " + c2.getArea());
        System.out.println("Circumference c2: " + c2.getCircumference());

        System.out.println("Distance between c2 and c3: " + c2.distance(c3));
    }
}