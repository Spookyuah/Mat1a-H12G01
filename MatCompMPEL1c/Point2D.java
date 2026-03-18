package es.uah.matcomp.mp.e1.ejerciciosclases.MatCompMPEL1c;

public class Point2D {
    private float x=0.0f;
    private float y=0.0f;

    public Point2D(){}
    public Point2D(float x, float y){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;}
    public void setX(float x) {
        this.x = x;}
    public float getY() {
        return y;}
    public void setY(float y) {
        this.y = y;}
    public float[] getXY(){
        return new float[]{x,y};
    }
    public void setXY(float newX, float newY){
        this.x=newX;
        this.y=newY;
    }
    @Override
    public String toString(){
        return "("+x+", "+y+")";
    }
}
