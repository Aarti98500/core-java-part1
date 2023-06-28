package abstractionUsingInterface;

public class Triangle implements Shape2 {
    float base;
    float height;

    public Triangle(float base, float height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("I am drawing a Triangle.");
    }

    @Override
    public double calculateArea() {
        return 0.5*base*height;
    }

    @Override
    public void colour() {
        System.out.println("I am coloring Triangle.");
    }
}
