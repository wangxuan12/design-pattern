package creational.factorymethod.java;

public class ActGameFactory extends GameFactory {
    @Override
    public Game makeGame() {
        return new ActGame();
    }
}
