package behavioral.command.java;

public class Video {
    private String name;

    public Video(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println("打开" + name);
    }

    public void close() {
        System.out.println("关闭" + name);
    }
}
