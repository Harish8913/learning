package abstraction.example1;

import abstraction.example1.classes.Circle;
import abstraction.example1.classes.Rectangle;
import abstraction.example1.classes.Square;

public class Main {
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(10, 10);
        Circle circle = new Circle(10);
        Square square = new Square(10);

        System.out.println(circle.area());
        System.out.println(rectangle.area());
        System.out.println(square.area());

        rectangle.echoShape();
        circle.echoShape();
        square.echoShape();
    }
}
