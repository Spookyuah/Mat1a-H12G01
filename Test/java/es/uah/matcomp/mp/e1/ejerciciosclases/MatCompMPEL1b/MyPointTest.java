package es.uah.matcomp.mp.e1.ejerciciosclases.MatCompMPEL1b;

class MyPointTest {
    public static void main(String[] arg){
        MyPoint p1 = new MyPoint();
        System.out.println(p1);
        p1.setX(8);
        p1.setY(6);
        System.out.println("x is: " + p1.getX());
        System.out.println("y is: " + p1.getY());
        p1.setXY(3, 0);
        System.out.println(p1.getXY()[0]);
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);

        MyPoint p2 = new MyPoint(0, 4);
        System.out.println(p2);
        System.out.println(p1.distance(p2));            //Version distance(MyPoint other)
        System.out.println(p2.distance(p1));            //Version distance(MyPoint other)
        System.out.println(p1.distance(5, 6));    //Version distance(int x, int y)
        System.out.println(p1.distance());              //Version distance() , distancia respecto a 0,0
    }
}