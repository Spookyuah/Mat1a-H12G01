package es.uah.matcomp.mp.e1.ejerciciosclases.MatCompMPEL1c;

class ShapeTest {
    public static void main(String[] args) {

        Shape s1 = new Shape();
        System.out.println(s1);

        Shape s2 = new Shape("blue", false);
        System.out.println(s2);

        s2.setColor("green");
        s2.setFilled(true);

        System.out.println("Color: " + s2.getColor());
        System.out.println("Filled: " + s2.isFilled());
    }
}