package Command;

public class BuyAccount implements CashATM {
    private final Cash user;

    public BuyAccount(Cash user){
        this.user = user;
    }

    public void execute() {
        user.extract();
    }
}
