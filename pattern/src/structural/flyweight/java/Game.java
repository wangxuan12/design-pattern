package structural.flyweight.java;

public class Game implements IGame {
    private String type;

    @Override
    public void show(String name) {
        System.out.println(type + ": " + name);
    }

    public Game (String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
