package es.uah.matcomp.mp.e1.ejerciciosclases.MatCompMPEL1d.Interfaces;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {
    public static void main(String[] args){
        MovablePoint p1=new MovablePoint(5,5,2,1);
        System.out.println(p1);
        p1.moveUp();
        System.out.println(p1);
        p1.moveRight();
        System.out.println(p1);
        p1.moveDown();
        System.out.println(p1);
        p1.moveLeft();
        System.out.println(p1);
    }
}