package behavioral.command.java;

public class CloseVideoCommand implements Command {
    private Video video;

    public CloseVideoCommand(Video video) {
        this.video = video;
    }

    @Override
    public void execute() {
        video.close();
    }
}
