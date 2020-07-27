package structural.bridge.java;

public class SquareShape extends Shape {
    public SquareShape(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("画一个方形,");
        getColor().paint();
    }
}
