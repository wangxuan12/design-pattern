package structural.bridge.java;

public class RedColor implements Color {
    @Override
    public void paint() {
        System.out.println("刷成红色");
    }

    @Override
    public void showColor() {
        System.out.println("这是红色");
    }
}
