package structural.flyweight.java;

import java.util.HashMap;
import java.util.Map;

public class GameFactory {
    private static final Map<String, IGame> GAME_MAP = new HashMap<>();

    public static IGame getGame(String type) {
        IGame game = GAME_MAP.get(type);
        if (game == null) {
            game = new Game(type);
            GAME_MAP.put(type, game);
        }
        return game;
    }

    public static int size() {
        return GAME_MAP.size();
    }
}
