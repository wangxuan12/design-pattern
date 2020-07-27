package structural.bridge.java;

public class CircleShape extends Shape {
    protected CircleShape(Color color) {
        super(color);
    }

    @Override
    public Color paint() {
        System.out.print("画一个圆形,");
        color.paint();
        return color;
    }
}
