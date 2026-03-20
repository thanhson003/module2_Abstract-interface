package codegym;

public class TestColorable {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Square(3);

        for (Shape shape : shapes) {

            System.out.println("Area: " + shape.getColor());

            if (shape instanceof Colorable) {
                Colorable c = (Colorable) shape;
                c.howToColor();
            }
        }
    }
}
