package State;

public class HasPin implements ATMState {

    ATM atm;
    public HasPin(ATM newATM){
        atm = newATM;
    }

    public void insertCard() {
        System.out.println("Card has already been entered");

    }

    public void ejectCard() {
        System.out.println("Card is ejected");
        atm.setATMState(atm.getNoCardState());
    }


    public void requestCash(int cashToWithdraw) {

        if(cashToWithdraw > atm.cashIn){

            System.out.println("You don't have that amount available");
            System.out.println("Card is ejected");
            atm.setATMState(atm.getNoCardState());

        } else {

            System.out.println(cashToWithdraw + " is provided by the machine");
            atm.setCashIn(atm.cashIn - cashToWithdraw);

            System.out.println("Card is ejected");
            atm.setATMState(atm.getNoCardState());

            if(atm.cashIn <= 0){
                atm.setATMState(atm.getNoCashState());
            }
        }
    }

    public void insertPin(int pinEntered) {
        System.out.println("PIN has already been entered");
    }
}