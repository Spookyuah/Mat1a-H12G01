package es.uah.matcomp.mp.e1.ejerciciosclases.MatCompMPEL1c.FirstExample;

public class Circle {
    private double radius=1.0;
    private String color="red";

    public Circle() {}
    public Circle(double r) {
        this.radius = r;
    }
    public Circle(double r, String c){
        this.radius = r;
        this.color = c;
    }

    public double getRadius() {
        return radius;}
    public void setRadius(double newRadius) {
        this.radius = newRadius;}
    public String getColor() {
        return color;}
    public void setColor(String newColor){
        this.color = newColor;}

    public double getArea() {
        return radius*radius*Math.PI;
    }
    @Override
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
}

