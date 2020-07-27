package structural.bridge.java;

public class CircleShape extends Shape {
    protected CircleShape(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("画一个圆形,");
        getColor().paint();
    }
}
