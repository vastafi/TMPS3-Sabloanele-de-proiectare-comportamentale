package ChainResponsability;

public class DispenserFor100 extends BalanceDispenser {

    public DispenserFor100() {
        super();
    }

    @Override

    public void dispense(CurrentBalance currency) {

        if (currency != null) {
            int amount = currency.getAmount();
            int remainder = amount;

            if (amount >= 100) {
                int count = amount / 100;
                remainder = amount % 100;

                System.out.printf("Dispensing '%d'banknote of 100$.\n", count);
            }
            if (remainder > 0 && this.nextDispenser != null) {
                this.nextDispenser.dispense(new CurrentBalance(remainder));
            }
        }
    }
}