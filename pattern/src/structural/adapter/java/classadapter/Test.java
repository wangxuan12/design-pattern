package structural.adapter.java.classadapter;

public class Test {
    public static void main(String[] args) {
        PowerAdapter powerAdapter = new PowerAdapter();
        System.out.println("输出" + powerAdapter.outputDC5V() + "V");
    }
}
