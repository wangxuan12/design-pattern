package behavioral.command.java;

public class Vedio {
    private String name;

    public Vedio(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println("打开" + name);
    }

    public void close() {
        System.out.println("关闭" + name);
    }
}
