package creational.simplefactory.java;

public class Test {
    public static void main(String[] args) {
        GameFactory gameFactory = new GameFactory();
        Game game = gameFactory.makeGame(RPGGame.class);
        if (game == null) return;
        game.produce();
    }
}
