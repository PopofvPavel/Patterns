package task3;

public class SendEmailAndSmsCommand extends SendNotificationCommand {

    public SendEmailAndSmsCommand(Client client) {
        super(client);
    }

    @Override
    void sendNotification() {
        SendSmsCommand sendSmsCommand = new SendSmsCommand(client, SendSmsCommand.SmsType.LINK_SMS);
        sendSmsCommand.sendNotification();
        SendEmailCommand sendEmailCommand = new SendEmailCommand(client);
        sendEmailCommand.sendNotification();
    }
}
