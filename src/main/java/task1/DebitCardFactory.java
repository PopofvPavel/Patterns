package task1;

public class DebitCardFactory extends AbstractCardFactory {
    @Override
    public Card createCard(int idUser, int cardNumber, int balance, String name) {
        return new DebitCard(idUser, cardNumber, balance, name);
    }
}
