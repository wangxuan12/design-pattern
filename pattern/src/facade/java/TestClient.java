package facade.java;

public class TestClient {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.buy();
        System.out.println(orderFacade.position());
    }
}