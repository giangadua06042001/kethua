package kethua;

public class Cricle1 {
    private String color;
    private double radius;
    public Cricle1() {
    }

    public Cricle1(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public String color() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double radius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        double area=this.radius*this.radius*3.14;
        return area;
    }
    public double getPerimeter(){
        double pr=this.radius*2*3.14;
        return pr;
    }

    @Override
    public String toString() {
        return "Cricle1{" +
                "color='" + color + '\'' +
                ", radius=" + radius +"  " +"Area="+getArea()+" "+"perimeter="+getPerimeter();

    }

    public static void main(String[] args) {
        Cricle1 cricle1=new Cricle1("blue",4);
        System.out.println(cricle1);
    }
}
