package task1;

import com.sun.nio.sctp.IllegalReceiveException;

public class Main {
    public static void main(String[] args) {
        AbstractCardFactory creditFactory = getCardFactory("CREDIT");
        Card creditCard = creditFactory.createCard(1, 222545, 3000, "Akakiy");
        creditCard.transferMoneyToCard(123456, 200);


        AbstractCardFactory debitFactory = getCardFactory("DEBIT");
        Card debitCard = creditFactory.createCard(2, 342545, 3000, "Innokentiy");
        debitCard.transferMoneyToCard(453456, 600);


    }

    private static AbstractCardFactory getCardFactory(String type) {
        if (type.equals("CREDIT")) {
            return new CreditCardFactory();
        } else if (type.equals("DEBIT")) {
            return new DebitCardFactory();
        } else {
            throw new IllegalArgumentException("Нет такого типа фабрики");
        }
    }
}
