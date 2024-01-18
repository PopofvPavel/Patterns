package task2;

public class ValidationHandler extends BaseHandler {

    public ValidationHandler() {
        this.setMessage("Не пройдена валидация данных");
    }
    @Override
    public boolean tryProcessRequest(Request request) {
        return ((request.getFIO() != null && !request.getFIO().isEmpty())
                && (request.getEmail() != null && !request.getEmail().isEmpty())
                && (request.getAge() >= 18 && request.getAge() <= 120)
                && (request.getYearIncome() > 0)
                && (request.getCurrentCreditAmount() >= 0 && request.getCurrentDebt() >= 0)
                && (request.getNewDebt() > 0 && request.getPeriod() >= 6 && request.getRate() >= 10)
        );

    }
}
