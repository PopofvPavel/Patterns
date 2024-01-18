package task3;

public abstract class SendNotificationCommand {
    protected final Client client;

    public SendNotificationCommand(Client client) {
        this.client = client;
    }

    abstract void sendNotification();
}
