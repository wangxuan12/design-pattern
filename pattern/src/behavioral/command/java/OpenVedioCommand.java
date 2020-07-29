package behavioral.command.java;

public class OpenVedioCommand implements Command{
    private Vedio vedio;

    public OpenVedioCommand(Vedio vedio) {
        this.vedio = vedio;
    }

    @Override
    public void execute() {
        vedio.open();
    }
}
