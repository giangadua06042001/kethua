package kethua;

public class Circle extends Shape{
    private double radius=1.0;

    public Circle() {
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double radius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

   public double getArea(){
        double Area=this.radius*this.radius*3.14;
        return Area;
   }
   public double getPerimeter(){
        double pr=this.radius*2*3.14;
        return pr;
   }

    @Override
    public String toString() {
        return super.toString()+
               "radius="+ radius
                +"Area="+getArea()
                +"Perimeter="+getPerimeter();
    }

    public static void main(String[] args) {
        Circle circle=new Circle();
        Circle cl=new Circle("blue",false,5);
        System.out.println(circle.getArea());
        System.out.println(cl.getPerimeter());
        System.out.println(circle);
        System.out.println(cl);
    }

}
