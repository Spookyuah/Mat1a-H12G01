package es.uah.matcomp.mp.e1.ejerciciosclases.MatCompMPEL1d.Interfaces;

public class MovableCircle implements Movable {
    MovablePoint center;
    int radius;

    public MovableCircle(int x, int y, int xspeed, int yspeed, int radius) {
        this.center= new MovablePoint(x,y,xspeed,yspeed);
        this.radius = radius;
    }
    public String toString(){
        return center +", radius=" +radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}
