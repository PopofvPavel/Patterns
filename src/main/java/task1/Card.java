package task1;

public abstract class Card {
    private final int idUser;
    private final int cardNumber;
    private int balance;
    private String name;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Card(int idUser, int cardNumber, int balance, String name) {
        this.idUser = idUser;
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.name = name;
    }

    public int getIdUser() {
        return idUser;
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public abstract void transferMoneyToCard(int cardNumber, int amount);
}
