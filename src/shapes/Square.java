package shapes;

public class Square extends Quadrilateral implements Measurable {

    public Square(int side) {
        super(side, side);
    }
    public double getArea() {
        return Math.pow(width, 2);
    }
    public double getPerimeter() {
        return width * 4;
    }
}

