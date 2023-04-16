package kethua;

public class CircleRy extends Cricle1{
    private double height;

    public CircleRy() {
    }

    public CircleRy(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }

    public double height() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return super.getArea()*2+2*getPerimeter()*this.height;
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter()*this.height;
    }

    @Override
    public String toString() {
        return super.toString()+"height"+" "+height;
    }

    public static void main(String[] args) {
        CircleRy circleRy=new CircleRy("bule",1,2);
        System.out.println(circleRy);
    }
}
