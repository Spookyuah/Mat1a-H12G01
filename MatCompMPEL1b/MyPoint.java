package es.uah.matcomp.mp.e1.ejerciciosclases.MatCompMPEL1b;

public class MyPoint {
    private int x=0;
    private int y=0;

    public MyPoint() {}
    public MyPoint(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;}
    public void setX(int x) {
        this.x = x;}
    public int getY() {
        return y;}
    public void setY(int y) {
        this.y = y;}
    public int[] getXY(){
        return new int[]{x, y};
    }
    public void setXY(int newX, int newY){
        this.x=newX;
        this.y=newY;}

    public String toString(){
        return "("+x+", "+y+")";}
    public double distance(int x, int y){
        int dx=this.x-x;
        int dy=this.y-y;
        return Math.sqrt(dx*dx+dy*dy);
    }
    public double distance(MyPoint other){
        int dx=this.x-other.x;
        int dy=this.y-other.y;
        return Math.sqrt( dx*dx + dy*dy );
    }
    public double distance(){ //Distance from 0,0
        return Math.sqrt( x*x + y*y );
    }
}
