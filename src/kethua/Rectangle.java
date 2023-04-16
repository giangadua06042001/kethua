package kethua;

public class Rectangle extends Shape{

    private double width=1.0;
    private double length=1.0;

    public Rectangle() {
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getArea(){
        double Area=this.length*this.width;
        return Area;
    }
    public double getPerimeter(){
        double pr=(this.length+this.width)*2;
        return pr;
    }

    public double width() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double length() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return super.toString()+"length="+length
                +"width="+width+"area="+getArea()+"perimeter="+getPerimeter();
    }

    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        System.out.println(rectangle);
        Rectangle rectangle1=new Rectangle("Black",true,3.6,2.5);
        System.out.println(rectangle1);

    }
}
