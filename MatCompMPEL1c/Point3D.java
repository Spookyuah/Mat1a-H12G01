package es.uah.matcomp.mp.e1.ejerciciosclases.MatCompMPEL1c;

public class Point3D  extends Point2D{
    private float z =0.0f;

    public Point3D(){
        super();
    }
    public Point3D(float x,float y, float z){
        super(x,y);
        this.z=z;
    }

    public float getZ() {
        return z;}
    public void setZ(float z) {
        this.z = z;}
    public float[] getXYZ(){
        return new float[]{super.getX(),super.getY(),this.getZ()};
    }
    public void setXYZ(float newX, float newY, float newZ){
        super.setX(newX);
        super.setY(newY);
        this.setZ(newZ);
    }
    @Override
    public String toString(){
        return String.format("(%f, %f, %f)%n",super.getX(), super.getY(),this.getZ());
    }
}
