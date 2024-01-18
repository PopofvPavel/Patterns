package task3;

public class SendEmailCommand extends SendNotificationCommand {

    public SendEmailCommand(Client client) {
        super(client);
    }

    @Override
    void sendNotification() {
        sendEmailToClient(client);
        SendSmsCommand sendSmsCommand = new SendSmsCommand(client, SendSmsCommand.SmsType.EMAIL_NOTIFY_SMS);
        sendSmsCommand.sendNotification();

    }

    private void sendEmailToClient(Client client) {
        System.out.println("Отправляем email клиенту " + client.getName() + " на адрес " + client.getEmail());

    }
}
