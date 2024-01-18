package task2;

public class Main {
    public static void main(String[] args) {
        Request request1 = new Request("Boris", "bor@mail.ru", 25, 50_000, 1,
                120_000, 200_000, 10, 20, 10000);
        Request request2 = new Request("Dmitri", "dimon@mail.ru", 25, 70_000, 3,
                150_000, 700_000, 10, 20, 10000);
        Request request3 = new Request("Alexander", "aldr@mail.ru", 18, 90_000, 1,
                12_000, 400_000, 10, 14, 10000);
        Request request4 = new Request("Klement", "badman@mail.ru", 25, 50_000, 1,
                105_000, 600_000, 10, 23, 10000);

        BaseHandler validationHandler = new ValidationHandler();
        BaseHandler complianceHandler = new ComplianceHandler();
        BaseHandler approvalHandler = new ApprovalHandler();

        validationHandler.setNext(complianceHandler);
        complianceHandler.setNext(approvalHandler);

        validationHandler.handle(request1);
        validationHandler.handle(request2);
        validationHandler.handle(request3);
        validationHandler.handle(request4);
    }
}
