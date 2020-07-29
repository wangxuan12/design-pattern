package behavioral.command.java;

public class OpenVideoCommand implements Command{
    private Video video;

    public OpenVideoCommand(Video video) {
        this.video = video;
    }

    @Override
    public void execute() {
        video.open();
    }
}
