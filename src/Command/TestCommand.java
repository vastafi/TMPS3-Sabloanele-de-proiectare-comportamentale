package Command;

public class TestCommand {
    public static void main(String[] args) {
        Cash user = new Cash();

        BuyCard buyCardOperations = new BuyCard(user);
        BuyAccount buyAccountOperations = new  BuyAccount(user);
        Operations operations = new Operations();
        operations.takeOperations(buyCardOperations);
        operations.takeOperations(buyAccountOperations);
        operations.placeOperations();
    }
}
