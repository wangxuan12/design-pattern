package creational.factorymethod.java;

public class RPGGameFactory extends GameFactory {
    @Override
    public Game makeGame() {
        return new RPGGame();
    }
}
