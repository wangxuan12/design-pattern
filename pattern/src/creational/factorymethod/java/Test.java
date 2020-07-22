package creational.factorymethod.java;

public class Test {
    public static void main(String[] args) {
        GameFactory gameFactory = new ActGameFactory();
        gameFactory.makeGame().produce();
    }
}
