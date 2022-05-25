package Dz;

public class Rectangle extends Figure{
    private static String Name = "Rectangle";

    private double Height;
    private double Width;

    public Rectangle(double Heinght, double Width){
        this.Height = Heinght;
        this.Width = Width;
    }


    public double getArea() {
        return Width * Height;
    }

    @Override
    public String getName(){
        return Name;
    }

    public double getHeight(){
        return Height;
    }
    public  double getWidth(){
        return Width;
    }


    public void setHeight(double Height){
        this.Height = Height;
    }
    public void setWidth(double Width){
        this.Width = Width;
    }
}
