package Strategy;

public class Card {

    private String code;
    private int amount;

    public Card(String code, int amount){
        this.code=code;
        this.amount=amount;
    }

    public String getCode() {
        return code;
    }

    public int getAmount() {
        return amount;
    }
}

