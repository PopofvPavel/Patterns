package task2;

public abstract class BaseHandler implements Handler {

    private Handler nextHandler;

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handle(Request request) {
        if (request != null) {
            if (tryProcessRequest(request)) {
                if (nextHandler != null) {
                    nextHandler.handle(request);
                } else {
                    System.out.println("Цепочка обработки закончена для " + request.getEmail());
                }
            } else {
                System.out.println("Заявка отклонена для " + request.getEmail() + " по причине " + this.getMessage());
            }
        } else {
            throw new IllegalArgumentException("Переданный запрос является null");

        }
    }

    public abstract boolean tryProcessRequest(Request request);
}
