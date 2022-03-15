package ChainResponsability;

public class DispenserFor200 extends BalanceDispenser {

    public DispenserFor200() {
        super();
    }

    @Override

    public void dispense(CurrentBalance currency) {

        if (currency != null) {
            int amount = currency.getAmount();
            int remainder = amount;

            if (amount >= 200) {
                int count = amount / 200;
                remainder = amount % 200;

                System.out.printf("Dispensing '%d'banknote of 200$ currency note.\n", count);
            }
            if (remainder > 0 && this.nextDispenser != null) {
                this.nextDispenser.dispense(new CurrentBalance(remainder));
            }
        }
    }
}