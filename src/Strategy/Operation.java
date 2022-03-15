package Strategy;

import java.util.ArrayList;
import java.util.List;

public class Operation {

    List<Card> items;

    public Operation(){
        this.items=new ArrayList<Card>();
    }

    public void addMoney(Card item){
        this.items.add(item);
    }

    public void removeMoney(Card item){
        this.items.remove(item);
    }

    public int calculateTotal(){
        int moneyAvailable = 0;
        for(Card item : items){
            moneyAvailable += item.getAmount();
        }
        return moneyAvailable;
    }

    public void pay(Strategy addingMethod){
        int amount = calculateTotal();
        addingMethod.addingMoney(amount);
    }
}