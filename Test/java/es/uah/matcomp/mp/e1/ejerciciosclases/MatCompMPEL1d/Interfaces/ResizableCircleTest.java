package es.uah.matcomp.mp.e1.ejerciciosclases.MatCompMPEL1d.Interfaces;

import static org.junit.jupiter.api.Assertions.*;

class ResizableCircleTest {
    public static void main(String[]args){
        ResizableCircle rc1= new ResizableCircle(8);
        System.out.println(rc1);
        rc1.resize(50);
        System.out.println(rc1);

        //Test circle
        Circle c1= new Circle(7);
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
    }
}