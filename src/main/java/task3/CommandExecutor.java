package task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommandExecutor {

    private final List<SendNotificationCommand> commandList = new ArrayList<>();


    public CommandExecutor(SendNotificationCommand... notificationCommands) {
        commandList.addAll(Arrays.asList(notificationCommands));
    }

    public void executeAll() {
        for (SendNotificationCommand command : commandList) {
            command.sendNotification();
        }
    }
}
