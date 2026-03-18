package es.uah.matcomp.mp.e1.ejerciciosclases.MatCompMPEL1c;

class MovablePointTest {
    public static void main(String[] args){
        Point2D p1= new Point2D();
        Point2D p2= new Point2D(1,2);
        System.out.println(p1);
        System.out.println(p2);
        p1.setX(7);
        p1.setY(8);
        System.out.println(p1);
        p1.setXY(5,4);
        System.out.println("Point x:"+p1.getX());
        System.out.println("Point y:"+p1.getY());
        System.out.println("Point coordinates:"+p1.getXY()[0]+","+p1.getXY()[1]);

        MovablePoint p3= new MovablePoint();
        System.out.println(p3);
        MovablePoint p4= new MovablePoint(3,4);
        System.out.println(p4);
        p3.setXSpeed(1);
        p3.setYSpeed(1);
        System.out.println("Point x speed:"+p3.getXSpeed());
        System.out.println("Point y speed:"+p3.getYSpeed());
        MovablePoint p5= new MovablePoint(3,3,1,2);
        System.out.println(p5);
        p5.setSpeed(3,3);
        System.out.println("New point speed:"+p5.getSpeed()[0]+", "+p5.getSpeed()[1]);
        p5.move();
        System.out.println(p5);
        p5.move();
        System.out.println(p5);
    }
}