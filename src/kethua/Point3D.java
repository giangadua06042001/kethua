package kethua;

import java.util.Arrays;

public class Point3D extends Point2D{
    private float z=0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float z() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        this.z=z;
        this.setX(x);
        this.setY(y);
    }
    public float[]array(){
        float[]arrya={setX(x()),setX(y()),z};
        return arrya;
    }

    @Override
    public String toString() {
        return super.toString()+"+"+array()+"="+z;
    }

    public static void main(String[] args) {
        Point3D point3D=new Point3D(2,3,5);
        System.out.println(point3D);
        System.out.println(Arrays.toString(point3D.array()));
    }
}
