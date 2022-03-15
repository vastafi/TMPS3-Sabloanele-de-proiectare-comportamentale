package Strategy;

public class TestStrategy {
    public static void main(String[] args) {
        Operation card = new Operation ();

        Card item1 = new Card("1234",10);
        Card item2 = new Card("5678",40);

        card.addMoney(item1);
        card.addMoney(item2);

        card.pay(new AppMobile("tina", "1234"));
        card.pay(new CreditCard("Ion", "Ambros","1234 5674 7852 3456", "125", "10/14"));
    }
}

