package es.uah.matcomp.mp.e1.ejerciciosclases.MatCompMPEL1c;

public class MovablePoint extends Point2D{
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MovablePoint(float xSpeed, float ySpeed){
        super();
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MovablePoint(){
        super();
    }
    public float getXSpeed(){
        return xSpeed;
    }
    public void setXSpeed(float newXSpeed){
        this.xSpeed=newXSpeed;
    }
    public float getYSpeed(){
        return ySpeed;
    }
    public void setYSpeed(float newYSpeed){
        this.ySpeed=newYSpeed;
    }
    public float[] getSpeed(){
        return new float[]{xSpeed, ySpeed};
    }
    public void setSpeed(float newXSpeed, float newYSpeed){
        this.xSpeed=newXSpeed;
        this.ySpeed=newYSpeed;
    }
    @Override
    public String toString(){
        return super.toString()+", speed=("+xSpeed+", "+ySpeed+")";
    }
    public MovablePoint move(){
        super.setXY((super.getX()+xSpeed),(super.getY()+ySpeed));
        return this;
    }

}
