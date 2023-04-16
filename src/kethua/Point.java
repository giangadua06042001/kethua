package kethua;

import java.util.Arrays;

public class Point {
    private float x=0.0f;
    private float y=0.0f;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float x() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
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
    public float [] getXY(){
        float[] array={x,y};
        return array;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                "="+getXY();
    }

    public static void main(String[] args) {
        Point point=new Point(2,4);
        System.out.println(point);
        System.out.println(Arrays.toString(point.getXY()));
    }
}
