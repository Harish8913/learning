package abstraction.example1.classes;

public class Rectangle extends Shape {
    int height;
    int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return width * height;
    }
}
