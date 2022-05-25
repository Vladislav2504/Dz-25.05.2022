import Dz.Circle;
import Dz.Figure;
import Dz.Rectangle;
import Dz.Triangle;

public class Main {
    public static void main(String[] args) {

        Figure[] figure =
                {
                new Rectangle(6, 4),
                new Triangle(7, 10, 5),
                new Circle(5)
                };
        for (Figure f : figure) {
            System.out.println(f.getName() + " площадь = " + f.getArea());
        }
        System.out.println();

    }
}