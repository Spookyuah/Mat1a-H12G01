package es.uah.matcomp.mp.e1.ejerciciosclases.MatCompMPEL1b;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(int x1, int y1, int x2, int y2) {
        begin = new MyPoint(x1, y1);
        end = new MyPoint(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin() {
        return begin;
    }
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }
    public MyPoint getEnd() {
        return end;
    }
    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }
    public void setBeginX(int newX) {
        begin.setX(newX);
    }
    public int getBeginY() {
        return begin.getY();
    }
    public void setBeginY(int newY) {
        begin.setY(newY);
    }

    public int getEndX() {
        return end.getX();
    }
    public void setEndX(int newX) {
        end.setX(newX);
    }
    public int getEndY() {
        return end.getY();
    }
    public void setEndY(int newY) {
        end.setY(newY);
    }

    public int[] getBeginXY(){
        return new int[]{begin.getX(), begin.getY()};
    }
    public void setBeginXY(int newX, int newY){
        begin= new MyPoint(newX,newY);
    }
    public int[] getEndXY(){
        return new int[]{end.getX(), end.getY()};
    }
    public void setEndXY(int newX, int newY){
        end= new MyPoint(newX,newY);
    }

    public double getLength(){
        return this.begin.distance(this.end);
    }
    public double getGradient() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff, xDiff);
    }
    public String toString(){
        return "MyLine[begin="+begin+", end="+end+"]";
    }
}
