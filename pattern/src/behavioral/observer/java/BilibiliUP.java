package behavioral.observer.java;

public class BilibiliUP extends Observable{
    private String name;

    public BilibiliUP(String name) {
        this.name = name;
    }

    public void uploadVideo(String video) {
        System.out.println("up主: " + name + "上传了" + video + "视频,并请求三连");
        notifyObservers(video);
    }

    public String getName() {
        return name;
    }
}
