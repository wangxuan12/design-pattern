package structural.proxy.java.dynamicproxy;

public class GamerImpl implements Gamer {
    @Override
    public void buy(String game) {
        System.out.println("买" + game + "游戏");
    }
}
