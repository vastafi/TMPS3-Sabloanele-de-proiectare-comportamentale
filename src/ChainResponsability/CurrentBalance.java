package ChainResponsability;

public class CurrentBalance {
    protected int amount;

    public CurrentBalance(int amount) {
        super();
        this.amount = amount;
    }

    public int getAmount() {
       return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
