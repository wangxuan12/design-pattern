package behavioral.command.java;

public class CloseVedioCommand implements Command {
    private Vedio vedio;

    public CloseVedioCommand(Vedio vedio) {
        this.vedio = vedio;
    }

    @Override
    public void execute() {
        vedio.close();
    }
}
