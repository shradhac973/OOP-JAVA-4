package lab_sheet_4;

// Let each Shape child calculate its own area.
// Sample output:
// Rectangle area: 24.0
// Circle area: 78.54
abstract class Shape {
    abstract double calculateArea();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Question14 {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(6, 4);
        Shape circle = new Circle(5);

        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.printf("Circle area: %.2f%n", circle.calculateArea());
    }
}