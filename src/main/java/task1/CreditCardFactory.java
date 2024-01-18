package task1;

public class CreditCardFactory extends AbstractCardFactory {
    @Override
    public Card createCard(int idUser, int cardNumber, int balance, String name) {
        return new CreditCard(idUser, cardNumber, balance, name, 1000, 5000);
    }
}
