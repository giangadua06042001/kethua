package kethua;

import java.util.Arrays;

public class Point2D {
    private float x=0.0f;
    private float y=0.0f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float x() {
        return x;
    }

    public float setX(float x) {
        this.x = x;
        return x;
    }

    public float y() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;

    }
    public float[] getXY(){
        float[]array={x,y};
        return array;
    }

    @Override
    public String toString() {
        return
                "x=" + x +
                ", y=" + y +" (x,y)"+getXY();

    }

    public static void main(String[] args) {
        Point2D point2D=new Point2D(3,5);
        System.out.println(point2D);
        System.out.println(Arrays.toString(point2D.getXY()));
    }
}
