package ChainResponsability;

public class Withdrawal {
    protected static BalanceDispenser dispenserFor50 = new DispenserFor50();
    protected static BalanceDispenser dispenserFor100 = new DispenserFor100();
    protected static BalanceDispenser dispenserFor200 = new DispenserFor200();
    protected static BalanceDispenser dispenserFor500 = new DispenserFor500();
    protected static BalanceDispenser  dispenserChain;

    static {
        dispenserFor500.setNextDispenser(dispenserFor200);
        dispenserFor200.setNextDispenser(dispenserFor100);
        dispenserFor100.setNextDispenser(dispenserFor50);
                dispenserChain = dispenserFor500;
    }

    public static void withdraw(CurrentBalance currency) {

        if (currency != null) {
            dispenserChain.dispense(currency);
        }
    }
}
