package behavioral.observer.java;

public class BilibiliUser implements Observer{
    private String name;

    public BilibiliUser(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        BilibiliUP up = (BilibiliUP) o;
        String video = (String) arg;
        System.out.println("观众老爷" + name + "观看了" + up.getName() + "上传的" + video + ", 并发了弹幕下次一定");
    }
}
