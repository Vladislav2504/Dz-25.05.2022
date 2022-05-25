package Dz;

public class Circle extends Figure {

    private static String Name = "Circle";
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea(){
        double area = 3.14 * radius * radius;
        return area;
    }
    @Override
    public String getName(){
        return Name;
    }


    public double getRadius(){
        return radius;
    }
    public void setRadius(){
        this.radius = radius;
    }


}
