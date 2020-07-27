package structural.bridge.java;

public abstract class Shape {
    protected Color color;
    protected Shape(Color color) {
        this.color = color;
    }

    public abstract Color paint();
}
