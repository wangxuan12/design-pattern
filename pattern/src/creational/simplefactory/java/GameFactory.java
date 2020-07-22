package creational.simplefactory.java;

import java.lang.reflect.InvocationTargetException;

public class GameFactory {
    public Game makeGame(String type) {
        if ("act".equalsIgnoreCase(type)) {
            return new ActGame();
        } else if ("rpg".equalsIgnoreCase(type)) {
            return new RPGGame();
        }
        return null;
    }

    public <T extends Game> Game makeGame(Class<T> c) {
        Game game = null;
        try {
            game = c.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return game;
    }
}
