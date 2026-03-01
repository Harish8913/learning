package abstraction.example1.classes;

public class Square extends Shape {
    int side;

    public Square(int side){
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}
