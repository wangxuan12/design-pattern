package structural.bridge.java;

public abstract class Shape {
    private Color color;
    protected Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();

    public Color getColor() {
        return color;
    }
}
