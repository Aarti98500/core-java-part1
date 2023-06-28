package abstractionClass;

public class Square extends Shape {
    float side;

    public Square(float side) {
        this.side = side;
    }

    @Override
    void draw() {
        System.out.println("I am drawing a Square.");
    }

    @Override
    public double calculateArea() {
        return side*side;
    }
}
