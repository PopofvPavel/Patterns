package task1;

public class CreditCard extends Card {
    private int debt;
    private int debtLimit;

    public CreditCard(int idUser, int cardNumber, int balance, String name, int debt, int debtLimit) {
        super(idUser, cardNumber, balance, name);
        this.debt = debt;
        this.debtLimit = debtLimit;
    }

    public int getDebt() {
        return debt;
    }

    public void setDebt(int debt) {
        this.debt = debt;
    }

    public int getDebtLimit() {
        return debtLimit;
    }

    @Override
    public void transferMoneyToCard(int cardNumber, int amount) {
        if (debt + amount >= debtLimit) {
            System.out.println("Клиент " + this.getName() + "не может перевести деньги так как он весь в долгах");
        }
        debt += amount;
        System.out.println("Клиент " + this.getName() + " перевел " + amount + " на номер" + cardNumber);


    }

    public void setDebtLimit(int debtLimit) {
        this.debtLimit = debtLimit;
    }
}
