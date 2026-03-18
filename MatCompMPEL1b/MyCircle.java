package es.uah.matcomp.mp.e1.ejerciciosclases.MatCompMPEL1b;

public class MyCircle {
    private MyPoint center=(new MyPoint(0,0));
    private int radius=1;

    public MyCircle(){}
    public MyCircle(int x, int y, int r){
        this.center= new MyPoint(x,y);
        this.radius= r;
    }
    public MyCircle(MyPoint center, int r){
        this.center=center;
        this.radius=r;
    }

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public MyPoint getCenter() {
        return center;
    }
    public void setCenter(MyPoint newCenter){
        this.center=newCenter;
    }

    public int getCenterX(){
        return center.getX();
    }
    public void setCenterX(int x){
        center.setX(x);
    }
    public int getCenterY(){
        return center.getY();
    }
    public void setCenterY(int y){
        center.setY(y);
    }

    public int[] getCenterXY(){
        return center.getXY();
    }
    public void setCenterXY(int x, int y){
        center.setXY(x,y);
    }

    public String toString(){
        return "MyCircle[radius="+radius+", center="+center+"]";
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getCircumference(){
        return 2*Math.PI*radius;
    }
    public double distance(MyCircle other){
        return center.distance(other.center);
    }
}
