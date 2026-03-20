package codegym;

public class Test {
    public static void main(String[] args) {
        Resizeable[] shapes = new Resizeable[3];

        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Square(3);
        for (Resizeable shape : shapes) {
            double percent = Math.random() * 100;

            if (shape instanceof Circle circle) {
                System.out.println("Before: " + circle.getArea());
                circle.resize(percent);
                System.out.println("After: " + circle.getArea());
            }

            if (shape instanceof Rectangle rectangle) {
                System.out.println("Before: " + rectangle.getArea());
                rectangle.resize(percent);
                System.out.println("After: " + rectangle.getArea());
            }
        }
    }
}
