package es.uah.matcomp.mp.e1.ejerciciosclases.MatCompMPEL1d.Interfaces;

public class MovablePoint implements Movable{
    int x;
    int y;
    int xspeed;
    int yspeed;

    public MovablePoint(int x, int y, int xspeed, int yspeed) {
        this.x = x;
        this.y = y;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }
    @Override
    public String toString(){
        return String.format("(%d,%d), speed=(%d,%d)",x,y,xspeed,yspeed);
    }

    @Override
    public void moveUp() {
        y-=yspeed;
    }

    @Override
    public void moveDown() {
        y+= yspeed;
    }

    @Override
    public void moveLeft() {
        x-=xspeed;
    }

    @Override
    public void moveRight() {
        x+=xspeed;
    }
}
