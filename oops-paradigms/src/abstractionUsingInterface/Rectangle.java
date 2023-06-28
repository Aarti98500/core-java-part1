package abstractionUsingInterface;

public class Rectangle implements Shape {
    float length;
    float breadth;

    public Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void draw() {
        System.out.println("I am drawing a Rectangle.");

    }

    @Override
    public double calculateArea() {
        return length*breadth;
    }
}
