package Dz;

public class Triangle extends Figure {
    private static String Name = "Triangle";
    private double A;
    private double B;
    private double C;

    public Triangle(double A, double B, double C){
        this.A = A;
        this.B = B;
        this.C = C;
    }

    @Override
    public double getArea() {
        double p = (A + B + C) / 2;
        double area = Math.sqrt(p * (p - A) * (p - B) * (p - C));
        return area;
    }

    @Override
    public String getName() {
        return Name;
    }



    public double getA(){
        return A;
    }
    public double getB(){
        return B;
    }
    public  double getC(){
        return C;
    }



    public void setA(double A){
        this.A = A;
    }
    public void setB(double B){
        this.B = B;
    }
    public void setC(double C){
        this.C = C;
    }


}
