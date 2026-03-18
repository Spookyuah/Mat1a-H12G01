package es.uah.matcomp.mp.e1.ejerciciosclases.MatCompMPEL1c.FirstExample;

public class Cylinder extends Circle{
    private double height;
    public Cylinder() {
        super(); // call superclass no-arg constructor Circle()
        height = 1.0;
    }
    public Cylinder(double height) {
        super(); // call superclass no-arg constructor Circle()
        this.height = height;
    }
    public Cylinder(double radius, double height) {
        super(radius); // call superclass constructor Circle(r)
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    // use superclass method getArea() to get the base area
    public double getVolume() {
        return getArea()*height;
    }

}
