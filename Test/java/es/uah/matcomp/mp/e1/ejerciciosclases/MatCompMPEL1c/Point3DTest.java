package es.uah.matcomp.mp.e1.ejerciciosclases.MatCompMPEL1c;

class Point3DTest {
    public static void main(String[]args){
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

        Point3D p3= new Point3D();
        Point3D p4= new Point3D(1,2,3);
        System.out.println(p3);
        System.out.println(p4);
        p3.setX(7);
        p3.setY(8);
        p3.setZ(9);
        System.out.println(p3);
        p3.setXYZ(3,4,5);
        System.out.println("Point x:"+p3.getX());
        System.out.println("Point y:"+p3.getY());
        System.out.println("Point z:"+p3.getZ());
        System.out.println("Point coordinates:"+p3.getXYZ()[0]+","+p3.getXYZ()[1]+","+p3.getXYZ()[2]);

    }
}