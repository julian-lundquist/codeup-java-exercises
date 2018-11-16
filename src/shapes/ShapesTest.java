package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable rectangle = new Rectangle(4, 5);
        Measurable square = new Square(5);


        System.out.println(rectangle.getArea());
        System.out.println(square.getArea());
    }
}
