package es.uah.matcomp.mp.e1.ejerciciosclases.MatCompMPEL1b;

public class MyPoint_Array_10_puntos {
    public static void main(String[]args){
        MyPoint[] points = new MyPoint[10];

        for (int i = 0; i < 10; i++) {
            points[i] = new MyPoint(i+1, i+1);
        }
        System.out.println("Distancias:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                double dist = points[i].distance(points[j]);
                System.out.printf("| %8f  |", dist);
            }
            System.out.println();
        }
    }
}
