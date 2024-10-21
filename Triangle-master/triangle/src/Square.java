public class Square extends GeometricObject implements Colorable {
    private double side;

    // Реализация метода howToColor
    public void howToColor() {
        System.out.println("Раскрасьте все четыре стороны.");
    }

    // Безаргументный конструктор
    public Square() {
        this.side = 0;
    }

    // Конструктор с параметром
    public Square(double side) {
        this.side = side;
    }

    // Геттер для side
    public double getSide() {
        return side;
    }

    // Сеттер для side
    public void setSide(double side) {
        this.side = side;
    }

}
