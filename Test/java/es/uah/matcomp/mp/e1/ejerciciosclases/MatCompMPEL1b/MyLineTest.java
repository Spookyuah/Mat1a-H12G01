package es.uah.matcomp.mp.e1.ejerciciosclases.MatCompMPEL1b;

class MyLineTest {
    public static void main(String[] args){
        MyLine l1= new MyLine(1, 2, 3, 4);
        System.out.println(l1);
        MyLine l2= new MyLine(new MyPoint(2, 4), new MyPoint(6, 8));
        System.out.println(l2);

        l2.setBegin(new MyPoint(10,10));
        l2.setEnd(new MyPoint(20,20));
        System.out.println("Begin point:"+l2.getBegin());
        System.out.println("End point:"+l2.getEnd());

        l1.setBeginX(2);
        l1.setBeginY(6);
        l1.setEndX(4);
        l1.setEndY(8);
        System.out.println("Begin x:"+l1.getBeginX());
        System.out.println("Begin Y:"+l1.getBeginY());
        System.out.println("End x:"+l1.getEndX());
        System.out.println("End y:"+l1.getEndY());

        l2.setBeginXY(1,1);
        l2.setEndXY(1,5);
        System.out.printf("Begin: (%d, %d)%n",l2.getBeginXY()[0],l2.getBeginXY()[1]);
        System.out.printf("End: (%d, %d)%n",l2.getEndXY()[0],l2.getEndXY()[1]);

        System.out.println("Line 1 length:"+l1.getLength());
        System.out.println("Line 2 gradient:"+l2.getGradient());
    }
}