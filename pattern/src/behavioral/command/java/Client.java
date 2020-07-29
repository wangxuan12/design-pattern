package behavioral.command.java;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private List<Command> commandList;


    public Client() {
        commandList = new ArrayList<>();
    }

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void executeCommand() {
        for (Command command : commandList) {
            command.execute();
        }
        commandList.clear();
    }
}
