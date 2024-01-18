package task1;

public class DebitCard extends Card {

    public DebitCard(int idUser, int cardNumber, int balance, String name) {
        super(idUser, cardNumber, balance, name);
    }

    @Override
    public void transferMoneyToCard(int cardNumber, int amount) {
        if (this.getBalance() >=  amount) {
            System.out.println("Клиент " + this.getName() + "не имеет достаточно средств на счету");
        }
        this.setBalance(getBalance() - amount);
        System.out.println("Клиент " + this.getName() + " перевел " + amount + " на номер" + cardNumber);

    }
}
