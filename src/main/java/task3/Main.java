package task3;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Vasya", "vasyan@mail.ru", "+79834843223");
        Client client2 = new Client("Petya", "petya@mail.ru", "+767348434453");
        Client client3 = new Client("Semen", "sem@mail.ru", "+727235434453");
        SendSmsCommand sendSmsCommand = new SendSmsCommand(client1, SendSmsCommand.SmsType.LINK_SMS);
        SendEmailCommand sendEmailCommand = new SendEmailCommand(client2);
        SendEmailAndSmsCommand sendEmailAndSmsCommand = new SendEmailAndSmsCommand(client3);

        CommandExecutor commandExecutor = new CommandExecutor(sendSmsCommand, sendEmailCommand, sendEmailAndSmsCommand);
        commandExecutor.executeAll();


    }
}
