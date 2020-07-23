package structural.proxy.java.dynamicproxy;

public class Test {
    public static void main(String[] args) {
        Gamer gamer = (Gamer) new DynamicProxy(new GamerImpl()).bind();
        gamer.buy("异度神剑");
    }
}
