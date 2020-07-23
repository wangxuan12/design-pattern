package structural.proxy.java.staticproxy;

public class StaticProxy implements Gamer {
    private Gamer gamer;

    public StaticProxy(Gamer gamer) {
        this.gamer = gamer;
    }

    @Override
    public void buy(String game) {
        beforeMethod(game);
        gamer.buy(game);
        afterMethod(game);
    }

    private void beforeMethod(String game) {
        System.out.println("先买玩" + game + "所需要的主机");
    }

    private void afterMethod(String game) {
        System.out.println("玩" + game);
    }
}
