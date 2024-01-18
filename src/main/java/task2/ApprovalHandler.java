package task2;

public class ApprovalHandler extends BaseHandler
{
    @Override
    public boolean tryProcessRequest(Request request) {
        if (request.getCurrentCreditAmount() > 2) {
            setMessage("слишком много кредитов");
            return false;
        }
        if (request.getCurrentDebt() / request.getYearIncome() >= 20) {
            setMessage("слишком низкий доход для закрытия прошлых кредитов");
            return false;
        }

        return true;
    }
}
