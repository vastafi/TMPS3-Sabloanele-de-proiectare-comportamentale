package ChainResponsability;

public abstract class BalanceDispenser {

    protected BalanceDispenser nextDispenser;
    public void setNextDispenser(BalanceDispenser  nextDispenser) {
              this.nextDispenser = nextDispenser;
    }

    public abstract void dispense(CurrentBalance currency);
}

