package task3;

public class SendSmsCommand extends SendNotificationCommand {

    public enum SmsType {
        LINK_SMS,EMAIL_NOTIFY_SMS,
    }

    private final SmsType smsType;

    public SendSmsCommand(Client client, SmsType smsType) {
        super(client);
        this.smsType = smsType;
    }

    @Override
    void sendNotification() {
        sendSmsToClient(client);
    }

    private void sendSmsToClient(Client client) {
        if (smsType.equals(SmsType.LINK_SMS)) {
            System.out.println("Отправляем ссылку в смс клиенту " + client.getName() + " на номер " + client.getPhone());

        } else {
            System.out.println("Отправляем смс-оповещение об отправлении письма клиенту " + client.getName() +
                    " на номер " + client.getPhone());

        }
    }
}
