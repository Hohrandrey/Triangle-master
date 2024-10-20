// Исключение для невалидного треугольника
class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }
}

public class Triangle extends GeometricObject {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    // Безаргументный конструктор
    public Triangle() {}

    /** Создает треугольник с указанными сторонами */
    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalTriangleException("Стороны треугольника должны быть положительными.");
        }
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException("Сумма длин любых двух сторон должна быть больше длины третьей стороны.");
        }

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Геттеры
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    // Метод для вычисления площади
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Метод для вычисления периметра
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return "Triangle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3 +
                ", color = " + getColor() + ", isFilled = " + isFilled() +
                ", area = " + getArea() + ", perimeter = " + getPerimeter();
    }
}
