package ChainResponsability;

public class DispenserFor50 extends BalanceDispenser {

    public DispenserFor50() {
        super();
    }

    @Override

    public void dispense(CurrentBalance currency) {

        if (currency != null) {
            int amount = currency.getAmount();
            int remainder = amount;

            if (amount >= 50) {
                int count = amount / 50;
                remainder = amount % 50;

                System.out.printf("Dispensing '%d'banknote of 50$.\n", count);
            }
            if (remainder > 0 && this.nextDispenser != null) {
                this.nextDispenser.dispense(new CurrentBalance(remainder));
            }
        }
    }
}