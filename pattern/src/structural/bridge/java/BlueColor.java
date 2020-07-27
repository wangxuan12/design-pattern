package structural.bridge.java;

public class BlueColor implements Color{
    @Override
    public void paint() {
        System.out.println("刷成蓝色");
    }

    @Override
    public void showColor() {
        System.out.println("这是蓝色");
    }
}
