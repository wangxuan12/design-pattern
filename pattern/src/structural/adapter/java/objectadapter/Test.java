package structural.adapter.java.objectadapter;

public class Test {
    public static void main(String[] args) {
        PowerAdapter powerAdapter = new PowerAdapter(new AC220V());
        System.out.println("输出" + powerAdapter.outputDC5V() + "V");
    }
}
