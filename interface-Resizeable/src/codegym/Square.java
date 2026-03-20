package codegym;

public class Square extends Rectangle implements Colorable{
    public Square() {
    }
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");

    }
}
