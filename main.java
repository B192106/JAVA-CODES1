abstract class Shape {
    // Abstract methods for calculating area and volume
    public abstract double getArea();
    public abstract double getVolume();
}

class TwoDimensionalShape extends Shape {
    // 2D shapes only have area, no volume
    @Override
    public double getVolume() {
        return 0;
    }
}

class ThreeDimensionalShape extends Shape {
    // 3D shapes have both area and volume
}

class Square extends TwoDimensionalShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}

class Circle extends TwoDimensionalShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Cube extends ThreeDimensionalShape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return 6 * side * side;
    }

    @Override
    public double getVolume() {
        return side * side * side;
    }
}

class Sphere extends ThreeDimensionalShape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println("Area of square: " + square.getArea());
        System.out.println("Volume of square: " + square.getVolume());

        Circle circle = new Circle(3);
        System.out.println("Area of circle: " + circle.getArea());
        System.out.println("Volume of circle: " + circle.getVolume());

        Cube cube = new Cube(4);
        System.out.println("Area of cube: " + cube.getArea());
        System.out.println("Volume of cube: " + cube.getVolume());

        Sphere sphere = new Sphere(2);
        System.out.println("Area of sphere: " + sphere.getArea());
        System.out.println("Volume of sphere: " + sphere.getVolume());
    }
}
